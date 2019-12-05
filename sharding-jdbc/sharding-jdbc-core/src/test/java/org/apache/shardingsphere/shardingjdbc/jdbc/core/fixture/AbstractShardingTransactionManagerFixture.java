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

package org.apache.shardingsphere.shardingjdbc.jdbc.core.fixture;

import lombok.Getter;
import org.apache.shardingsphere.spi.database.DatabaseType;
import org.apache.shardingsphere.transaction.core.ResourceDataSource;
import org.apache.shardingsphere.transaction.core.TransactionOperationType;
import org.apache.shardingsphere.transaction.spi.ShardingTransactionManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public abstract class AbstractShardingTransactionManagerFixture implements ShardingTransactionManager {
    
    @Getter
    private static Collection<TransactionOperationType> invocations = new LinkedList<>();
    
    private final Map<String, DataSource> dataSourceMap = new HashMap<>();
    
    @Override
    public final void init(final DatabaseType databaseType, final Collection<ResourceDataSource> resourceDataSources) {
        for (ResourceDataSource each : resourceDataSources) {
            dataSourceMap.put(each.getOriginalName(), each.getDataSource());
        }
    }
    
    @Override
    public final boolean isInTransaction() {
        return invocations.contains(TransactionOperationType.BEGIN);
    }
    
    @Override
    public final Connection getConnection(final String dataSourceName) throws SQLException {
        return dataSourceMap.get(dataSourceName).getConnection();
    }
    
    @Override
    public final void begin() {
        invocations.add(TransactionOperationType.BEGIN);
    }
    
    @Override
    public final void commit() {
        invocations.add(TransactionOperationType.COMMIT);
    }
    
    @Override
    public final void rollback() {
        invocations.add(TransactionOperationType.ROLLBACK);
    }
    
    @Override
    public final void close() {
    }
}
