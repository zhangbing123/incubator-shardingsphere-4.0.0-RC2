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

package org.apache.shardingsphere.transaction.xa.jta.connection;

import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.transaction.xa.spi.SingleXAResource;

import javax.sql.ConnectionEventListener;
import javax.sql.StatementEventListener;
import javax.sql.XAConnection;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Single XA Connection.
 *
 * @author zhaojun
 */
@RequiredArgsConstructor
public final class SingleXAConnection implements XAConnection {
    
    private final String resourceName;
    
    private final Connection connection;
    
    private final XAConnection xaConnection;
    
    @Override
    public SingleXAResource getXAResource() throws SQLException {
        return new SingleXAResource(resourceName, xaConnection.getXAResource());
    }
    
    @Override
    public Connection getConnection() {
        return connection;
    }
    
    @Override
    public void close() throws SQLException {
        xaConnection.close();
    }
    
    @Override
    public void addConnectionEventListener(final ConnectionEventListener listener) {
        xaConnection.addConnectionEventListener(listener);
    }
    
    @Override
    public void removeConnectionEventListener(final ConnectionEventListener listener) {
        xaConnection.removeConnectionEventListener(listener);
    }
    
    @Override
    public void addStatementEventListener(final StatementEventListener listener) {
        xaConnection.addStatementEventListener(listener);
    }
    
    @Override
    public void removeStatementEventListener(final StatementEventListener listener) {
        xaConnection.removeStatementEventListener(listener);
    }
}
