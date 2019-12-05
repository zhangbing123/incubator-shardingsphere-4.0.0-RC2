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

package org.apache.shardingsphere.shardingproxy.backend.communication;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.JDBCDatabaseCommunicationEngine;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.execute.JDBCExecuteEngine;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.wrapper.PreparedStatementExecutorWrapper;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.wrapper.StatementExecutorWrapper;
import org.apache.shardingsphere.shardingproxy.backend.schema.LogicSchema;

import java.util.List;

/**
 * Database communication engine factory.
 *
 * @author zhangliang
 * @author panjuan
 * @author zhaojun
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DatabaseCommunicationEngineFactory {
    
    private static final DatabaseCommunicationEngineFactory INSTANCE = new DatabaseCommunicationEngineFactory();
    
    /**
     * Get backend handler factory instance.
     *
     * @return backend handler factory
     */
    public static DatabaseCommunicationEngineFactory getInstance() {
        return INSTANCE;
    }
    
    /**
     * Create new instance of text protocol backend handler.
     *
     * @param logicSchema logic schema
     * @param sql SQL to be executed
     * @param backendConnection backend connection
     * @return instance of text protocol backend handler
     */
    public DatabaseCommunicationEngine newTextProtocolInstance(final LogicSchema logicSchema, final String sql, final BackendConnection backendConnection) {
        return new JDBCDatabaseCommunicationEngine(logicSchema, sql, new JDBCExecuteEngine(backendConnection, new StatementExecutorWrapper(logicSchema)));
    }
    
    /**
     * Create new instance of text protocol backend handler.
     *
     * @param logicSchema logic schema
     * @param sql SQL to be executed
     * @param parameters SQL parameters
     * @param backendConnection backend connection
     * @return instance of text protocol backend handler
     */
    public DatabaseCommunicationEngine newBinaryProtocolInstance(final LogicSchema logicSchema, final String sql, final List<Object> parameters, final BackendConnection backendConnection) {
        return new JDBCDatabaseCommunicationEngine(logicSchema, sql, new JDBCExecuteEngine(backendConnection, new PreparedStatementExecutorWrapper(logicSchema, parameters)));
    }
}
