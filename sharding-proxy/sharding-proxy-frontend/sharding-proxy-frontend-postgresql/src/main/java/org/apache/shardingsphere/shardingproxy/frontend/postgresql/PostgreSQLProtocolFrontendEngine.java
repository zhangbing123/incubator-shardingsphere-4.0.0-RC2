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

package org.apache.shardingsphere.shardingproxy.frontend.postgresql;

import lombok.Getter;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.frontend.context.FrontendContext;
import org.apache.shardingsphere.shardingproxy.frontend.postgresql.auth.PostgreSQLAuthenticationEngine;
import org.apache.shardingsphere.shardingproxy.frontend.postgresql.command.PostgreSQLCommandExecuteEngine;
import org.apache.shardingsphere.shardingproxy.frontend.spi.DatabaseProtocolFrontendEngine;
import org.apache.shardingsphere.shardingproxy.transport.codec.DatabasePacketCodecEngine;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.codec.PostgreSQLPacketCodecEngine;
import org.apache.shardingsphere.shardingproxy.transport.postgresql.packet.command.query.binary.BinaryStatementRegistry;

/**
 * Frontend engine for PostgreSQL protocol.
 *
 * @author zhangyonglun
 * @author zhangliang
 */
@Getter
public final class PostgreSQLProtocolFrontendEngine implements DatabaseProtocolFrontendEngine {
    
    private final FrontendContext frontendContext = new FrontendContext(true, false);
    
    private final PostgreSQLAuthenticationEngine authEngine = new PostgreSQLAuthenticationEngine();
    
    private final PostgreSQLCommandExecuteEngine commandExecuteEngine = new PostgreSQLCommandExecuteEngine();
    
    private final DatabasePacketCodecEngine codecEngine = new PostgreSQLPacketCodecEngine();
    
    @Override
    public String getDatabaseType() {
        return "PostgreSQL";
    }
    
    @Override
    public void release(final BackendConnection backendConnection) {
        BinaryStatementRegistry.getInstance().unregister(backendConnection.getConnectionId());
    }
}
