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

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.shardingproxy.backend.exception.NoDatabaseSelectedException;
import org.apache.shardingsphere.shardingproxy.backend.exception.TableModifyInTransactionException;
import org.apache.shardingsphere.shardingproxy.backend.exception.UnknownDatabaseException;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.ShardingCTLErrorCode;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.exception.ShardingCTLException;
import org.apache.shardingsphere.shardingproxy.error.CommonErrorCode;
import org.apache.shardingsphere.shardingproxy.transport.mysql.constant.MySQLServerErrorCode;
import org.apache.shardingsphere.shardingproxy.transport.mysql.packet.generic.MySQLErrPacket;

import java.sql.SQLException;

/**
 * ERR packet factory for MySQL.
 * 
 * @author zhangliang
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class MySQLErrPacketFactory {
    
    /**
     * New instance of MytSQL ERR packet.
     * 
     * @param sequenceId sequence ID
     * @param cause cause
     * @return instance of MySQL ERR packet
     */
    public static MySQLErrPacket newInstance(final int sequenceId, final Exception cause) {
        if (cause instanceof SQLException) {
            SQLException sqlException = (SQLException) cause;
            return new MySQLErrPacket(sequenceId, sqlException.getErrorCode(), sqlException.getSQLState(), sqlException.getMessage());
        }
        if (cause instanceof ShardingCTLException) {
            ShardingCTLException shardingCTLException = (ShardingCTLException) cause;
            return new MySQLErrPacket(sequenceId, ShardingCTLErrorCode.valueOf(shardingCTLException), shardingCTLException.getShardingCTL());
        }
        if (cause instanceof TableModifyInTransactionException) {
            return new MySQLErrPacket(sequenceId, MySQLServerErrorCode.ER_ERROR_ON_MODIFYING_GTID_EXECUTED_TABLE, ((TableModifyInTransactionException) cause).getTableName());
        }
        if (cause instanceof UnknownDatabaseException) {
            return new MySQLErrPacket(sequenceId, MySQLServerErrorCode.ER_BAD_DB_ERROR, ((UnknownDatabaseException) cause).getDatabaseName());
        }
        if (cause instanceof NoDatabaseSelectedException) {
            return new MySQLErrPacket(sequenceId, MySQLServerErrorCode.ER_NO_DB_ERROR);
        }
        return new MySQLErrPacket(sequenceId, CommonErrorCode.UNKNOWN_EXCEPTION, cause.getMessage());
    }
}
