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

package org.apache.shardingsphere.shardingproxy.frontend.mysql;

import org.apache.shardingsphere.shardingproxy.backend.exception.NoDatabaseSelectedException;
import org.apache.shardingsphere.shardingproxy.backend.exception.TableModifyInTransactionException;
import org.apache.shardingsphere.shardingproxy.backend.exception.UnknownDatabaseException;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.exception.InvalidShardingCTLFormatException;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.exception.UnsupportedShardingCTLTypeException;
import org.apache.shardingsphere.shardingproxy.transport.mysql.packet.generic.MySQLErrPacket;
import org.junit.Test;

import java.sql.SQLException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public final class MySQLErrPacketFactoryTest {
    
    @Test
    public void assertNewInstanceWithSQLException() {
        MySQLErrPacket actual = MySQLErrPacketFactory.newInstance(1, new SQLException("No reason", "XXX", 9999, new RuntimeException()));
        assertThat(actual.getSequenceId(), is(1));
        assertThat(actual.getErrorCode(), is(9999));
        assertThat(actual.getSqlState(), is("XXX"));
        assertThat(actual.getErrorMessage(), is("No reason"));
    }
    
    @Test
    public void assertNewInstanceWithInvalidShardingCTLFormatException() {
        MySQLErrPacket actual = MySQLErrPacketFactory.newInstance(1, new InvalidShardingCTLFormatException("test"));
        assertThat(actual.getSequenceId(), is(1));
        assertThat(actual.getErrorCode(), is(11000));
        assertThat(actual.getSqlState(), is("S11000"));
        assertThat(actual.getErrorMessage(), is("Invalid format for sharding ctl [test], should be [sctl:set key=value]."));
    }
    
    @Test
    public void assertNewInstanceWithUnsupportedShardingCTLTypeException() {
        MySQLErrPacket actual = MySQLErrPacketFactory.newInstance(1, new UnsupportedShardingCTLTypeException("sctl:set xxx=xxx"));
        assertThat(actual.getSequenceId(), is(1));
        assertThat(actual.getErrorCode(), is(11001));
        assertThat(actual.getSqlState(), is("S11001"));
        assertThat(actual.getErrorMessage(), is("Could not support sctl type [sctl:set xxx=xxx]."));
    }
    
    @Test
    public void assertNewInstanceWithTableModifyInTransactionException() {
        MySQLErrPacket actual = MySQLErrPacketFactory.newInstance(1, new TableModifyInTransactionException("tbl"));
        assertThat(actual.getSequenceId(), is(1));
        assertThat(actual.getErrorCode(), is(3176));
        assertThat(actual.getSqlState(), is("HY000"));
        assertThat(actual.getErrorMessage(), is("Please do not modify the tbl table with an XA transaction. This is an internal system table used to store GTIDs for committed transactions. "
                + "Although modifying it can lead to an inconsistent GTID state, if neccessary you can modify it with a non-XA transaction."));
    }
    
    @Test
    public void assertNewInstanceWithUnknownDatabaseException() {
        MySQLErrPacket actual = MySQLErrPacketFactory.newInstance(1, new UnknownDatabaseException("ds"));
        assertThat(actual.getSequenceId(), is(1));
        assertThat(actual.getErrorCode(), is(1049));
        assertThat(actual.getSqlState(), is("42000"));
        assertThat(actual.getErrorMessage(), is("Unknown database 'ds'"));
    }
    
    @Test
    public void assertNewInstanceWithNoDatabaseSelectedException() {
        MySQLErrPacket actual = MySQLErrPacketFactory.newInstance(1, new NoDatabaseSelectedException());
        assertThat(actual.getSequenceId(), is(1));
        assertThat(actual.getErrorCode(), is(1046));
        assertThat(actual.getSqlState(), is("3D000"));
        assertThat(actual.getErrorMessage(), is("No database selected"));
    }
    
    @Test
    public void assertNewInstanceWithOtherException() {
        MySQLErrPacket actual = MySQLErrPacketFactory.newInstance(1, new RuntimeException("No reason"));
        assertThat(actual.getSequenceId(), is(1));
        assertThat(actual.getErrorCode(), is(10002));
        assertThat(actual.getSqlState(), is("C10002"));
        assertThat(actual.getErrorMessage(), is("Unknown exception: [No reason]"));
    }
}
