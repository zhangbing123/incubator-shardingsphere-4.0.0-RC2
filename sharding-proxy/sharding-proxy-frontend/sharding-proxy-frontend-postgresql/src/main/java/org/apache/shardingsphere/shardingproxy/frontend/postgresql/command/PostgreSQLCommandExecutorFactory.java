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

package org.apache.shardingsphere.shardingproxy.frontend.postgresql.command;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.frontend.api.CommandExecutor;
import org.apache.shardingsphere.shardingproxy.frontend.postgresql.command.generic.PostgreSQLComTerminationExecutor;
import org.apache.shardingsphere.shardingproxy.frontend.postgresql.command.generic.PostgreSQLUnsupportedCommandExecutor;
import org.apache.shardingsphere.shardingproxy.frontend.postgresql.command.query.binary.bind.PostgreSQLComBindExecutor;
import org.apache.shardingsphere.shardingproxy.frontend.postgresql.command.query.binary.describe.PostgreSQLComDescribeExecutor;
import org.apache.shardingsphere.shardingproxy.frontend.postgresql.command.query.binary.execute.PostgreSQLComExecuteExecutor;
import org.apache.shardingsphere.shardingproxy.frontend.postgresql.command.query.binary.parse.PostgreSQLComParseExecutor;
import org.apache.shardingsphere.shardingproxy.frontend.postgresql.command.query.binary.sync.PostgreSQLComSyncExecutor;
import org.apache.shardingsphere.shardingproxy.frontend.postgresql.command.query.text.PostgreSQLComQueryExecutor;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.command.PostgreSQLCommandPacket;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.command.PostgreSQLCommandPacketType;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.command.query.binary.bind.PostgreSQLComBindPacket;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.command.query.binary.parse.PostgreSQLComParsePacket;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.command.query.text.PostgreSQLComQueryPacket;

/**
 * Command executor factory for PostgreSQL.
 *
 * @author zhangliang
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public final class PostgreSQLCommandExecutorFactory {
    
    /**
     * Create new instance of command executor.
     *
     * @param commandPacketType command packet type for PostgreSQL
     * @param commandPacket command packet for PostgreSQL
     * @param backendConnection backend connection
     * @return command executor
     */
    public static CommandExecutor newInstance(final PostgreSQLCommandPacketType commandPacketType, final PostgreSQLCommandPacket commandPacket, final BackendConnection backendConnection) {
        log.debug("Execute packet type: {}, value: {}", commandPacketType, commandPacket);
        switch (commandPacketType) {
            case QUERY:
                return new PostgreSQLComQueryExecutor((PostgreSQLComQueryPacket) commandPacket, backendConnection);
            case PARSE:
                return new PostgreSQLComParseExecutor((PostgreSQLComParsePacket) commandPacket, backendConnection);
            case BIND:
                return new PostgreSQLComBindExecutor((PostgreSQLComBindPacket) commandPacket, backendConnection);
            case DESCRIBE:
                return new PostgreSQLComDescribeExecutor();
            case EXECUTE:
                return new PostgreSQLComExecuteExecutor();
            case SYNC:
                return new PostgreSQLComSyncExecutor();
            case TERMINATE:
                return new PostgreSQLComTerminationExecutor();
            default:
                return new PostgreSQLUnsupportedCommandExecutor();
        }
    }
}
