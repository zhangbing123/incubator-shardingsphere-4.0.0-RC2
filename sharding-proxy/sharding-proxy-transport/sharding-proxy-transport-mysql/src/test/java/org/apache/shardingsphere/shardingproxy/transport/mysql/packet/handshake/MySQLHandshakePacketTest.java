/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.shardingproxy.transport.mysql.packet.handshake;

import org.apache.shardingsphere.shardingproxy.transport.mysql.constant.MySQLCapabilityFlag;
import org.apache.shardingsphere.shardingproxy.transport.mysql.constant.MySQLServerInfo;
import org.apache.shardingsphere.shardingproxy.transport.mysql.constant.MySQLStatusFlag;
import org.apache.shardingsphere.shardingproxy.transport.mysql.payload.MySQLPacketPayload;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public final class MySQLHandshakePacketTest {
    
    @Mock
    private MySQLPacketPayload payload;
    
    private final byte[] part1 = {106, 105, 55, 122, 117, 98, 115, 109};
    
    private final byte[] part2 = {68, 102, 53, 122, 65, 49, 84, 79, 85, 115, 116, 113};
    
    @Test
    public void assertNewWithPayload() {
        when(payload.readInt1()).thenReturn(0, MySQLServerInfo.PROTOCOL_VERSION, MySQLServerInfo.CHARSET, 0);
        when(payload.readStringNul()).thenReturn(MySQLServerInfo.SERVER_VERSION);
        when(payload.readStringNulByBytes()).thenReturn(part1, part2);
        when(payload.readInt4()).thenReturn(1000);
        when(payload.readInt2()).thenReturn(
                MySQLCapabilityFlag.calculateHandshakeCapabilityFlagsLower(), MySQLStatusFlag.SERVER_STATUS_AUTOCOMMIT.getValue(), MySQLCapabilityFlag.calculateHandshakeCapabilityFlagsUpper());
        MySQLHandshakePacket actual = new MySQLHandshakePacket(payload);
        assertThat(actual.getSequenceId(), is(0));
        assertThat(actual.getConnectionId(), is(1000));
        assertThat(actual.getAuthPluginData().getAuthPluginDataPart1(), is(part1));
        assertThat(actual.getAuthPluginData().getAuthPluginDataPart2(), is(part2));
        verify(payload).skipReserved(10);
    }
    
    @Test
    public void assertWrite() {
        MySQLAuthPluginData authPluginData = new MySQLAuthPluginData(part1, part2);
        new MySQLHandshakePacket(1000, authPluginData).write(payload);
        verify(payload).writeInt1(MySQLServerInfo.PROTOCOL_VERSION);
        verify(payload).writeStringNul(MySQLServerInfo.SERVER_VERSION);
        verify(payload).writeInt4(1000);
        verify(payload).writeStringNul(new String(authPluginData.getAuthPluginDataPart1()));
        verify(payload).writeInt2(MySQLCapabilityFlag.calculateHandshakeCapabilityFlagsLower());
        verify(payload).writeInt1(MySQLServerInfo.CHARSET);
        verify(payload).writeInt2(MySQLStatusFlag.SERVER_STATUS_AUTOCOMMIT.getValue());
        verify(payload).writeInt2(MySQLCapabilityFlag.calculateHandshakeCapabilityFlagsUpper());
        verify(payload).writeInt1(0);
        verify(payload).writeReserved(10);
        verify(payload).writeStringNul(new String(authPluginData.getAuthPluginDataPart2()));
    }
}
