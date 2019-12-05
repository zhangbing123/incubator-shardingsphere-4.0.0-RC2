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

package org.apache.shardingsphere.shardingproxy.frontend.postgresql.command.query.binary.parse;

import org.apache.shardingsphere.core.parse.sql.statement.SQLStatement;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.schema.LogicSchema;
import org.apache.shardingsphere.shardingproxy.frontend.api.CommandExecutor;
import org.apache.shardingsphere.shardingproxy.transport.packet.DatabasePacket;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.command.query.binary.BinaryStatementRegistry;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.command.query.binary.ConnectionScopeBinaryStatementRegistry;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.command.query.binary.parse.PostgreSQLComParsePacket;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.command.query.binary.parse.PostgreSQLParseCompletePacket;

import java.util.Collection;
import java.util.Collections;

/**
 * PostgreSQL command parse executor.
 *
 * @author zhangyonglun
 * @author zhangliang
 */
public final class PostgreSQLComParseExecutor implements CommandExecutor {
    
    private final PostgreSQLComParsePacket packet;
    
    private final LogicSchema logicSchema;
    
    private final ConnectionScopeBinaryStatementRegistry binaryStatementRegistry;
    
    public PostgreSQLComParseExecutor(final PostgreSQLComParsePacket packet, final BackendConnection backendConnection) {
        this.packet = packet;
        logicSchema = backendConnection.getLogicSchema();
        binaryStatementRegistry = BinaryStatementRegistry.getInstance().get(backendConnection.getConnectionId());
    }
    
    @Override
    public Collection<DatabasePacket> execute() {
        if (!packet.getSql().isEmpty()) {
            SQLStatement sqlStatement = logicSchema.getParseEngine().parse(packet.getSql(), true);
            binaryStatementRegistry.register(packet.getStatementId(), packet.getSql(), sqlStatement.getParametersCount(), packet.getBinaryStatementParameterTypes());
        }
        return Collections.<DatabasePacket>singletonList(new PostgreSQLParseCompletePacket());
    }
}
