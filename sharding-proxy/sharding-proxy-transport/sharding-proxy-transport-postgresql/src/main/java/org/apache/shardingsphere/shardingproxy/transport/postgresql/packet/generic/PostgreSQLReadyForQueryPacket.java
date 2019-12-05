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

package org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.generic;

import lombok.Getter;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.PostgreSQLPacket;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.command.PostgreSQLCommandPacketType;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.payload.PostgreSQLPacketPayload;

/**
 * Ready for query packet for PostgreSQL.
 *
 * @author zhangyonglun
 */
public final class PostgreSQLReadyForQueryPacket implements PostgreSQLPacket {
    
    @Getter
    private final char messageType = PostgreSQLCommandPacketType.READY_FOR_QUERY.getValue();
    
    private final char status = 'I';
    
    @Override
    public void write(final PostgreSQLPacketPayload payload) {
        payload.writeInt1(status);
    }
}
