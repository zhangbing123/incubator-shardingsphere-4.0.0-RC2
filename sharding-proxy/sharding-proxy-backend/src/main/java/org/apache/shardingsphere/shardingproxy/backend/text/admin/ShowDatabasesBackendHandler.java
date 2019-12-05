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

package org.apache.shardingsphere.shardingproxy.backend.text.admin;

import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.core.merge.MergedResult;
import org.apache.shardingsphere.core.merge.dal.show.ShowDatabasesMergedResult;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.response.BackendResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryData;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryHeader;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryResponse;
import org.apache.shardingsphere.shardingproxy.backend.schema.LogicSchemas;
import org.apache.shardingsphere.shardingproxy.backend.text.TextProtocolBackendHandler;
import org.apache.shardingsphere.shardingproxy.context.ShardingProxyContext;

import java.sql.SQLException;
import java.sql.Types;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Show databases backend handler.
 *
 * @author chenqingyang
 * @author zhaojun
 * @author panjuan
 */
@RequiredArgsConstructor
public final class ShowDatabasesBackendHandler implements TextProtocolBackendHandler {
    
    private final BackendConnection backendConnection;
    
    private MergedResult mergedResult;
    
    @Override
    public BackendResponse execute() {
        mergedResult = new ShowDatabasesMergedResult(getSchemaNames());
        return new QueryResponse(Collections.singletonList(new QueryHeader("information_schema", "SCHEMATA", "Database", "SCHEMA_NAME", 100, Types.VARCHAR, 0)));
    }
    
    private List<String> getSchemaNames() {
        List<String> result = new LinkedList<>(LogicSchemas.getInstance().getSchemaNames());
        Collection<String> authorizedSchemas = ShardingProxyContext.getInstance().getAuthentication().getUsers().get(backendConnection.getUserName()).getAuthorizedSchemas();
        if (!authorizedSchemas.isEmpty()) {
            result.retainAll(authorizedSchemas);
        }
        return result;
    }
    
    @Override
    public boolean next() throws SQLException {
        return null != mergedResult && mergedResult.next();
    }
    
    @Override
    public QueryData getQueryData() throws SQLException {
        return new QueryData(Collections.singletonList(Types.VARCHAR), Collections.singletonList(mergedResult.getValue(1, Object.class)));
    }
}
