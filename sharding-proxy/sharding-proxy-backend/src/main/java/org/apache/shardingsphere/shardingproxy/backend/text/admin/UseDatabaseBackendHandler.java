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
import org.apache.shardingsphere.core.parse.sql.statement.dal.dialect.mysql.UseStatement;
import org.apache.shardingsphere.core.parse.util.SQLUtil;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.exception.UnknownDatabaseException;
import org.apache.shardingsphere.shardingproxy.backend.response.BackendResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.error.ErrorResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryData;
import org.apache.shardingsphere.shardingproxy.backend.response.update.UpdateResponse;
import org.apache.shardingsphere.shardingproxy.backend.schema.LogicSchemas;
import org.apache.shardingsphere.shardingproxy.backend.text.TextProtocolBackendHandler;
import org.apache.shardingsphere.shardingproxy.context.ShardingProxyContext;

import java.util.Collection;

/**
 * Use database backend handler.
 *
 * @author chenqingyang
 * @author zhaojun
 */
@RequiredArgsConstructor
public final class UseDatabaseBackendHandler implements TextProtocolBackendHandler {
    
    private final UseStatement useStatement;
    
    private final BackendConnection backendConnection;
    
    @Override
    public BackendResponse execute() {
        String schema = SQLUtil.getExactlyValue(useStatement.getSchema());
        if (LogicSchemas.getInstance().schemaExists(schema) && isAuthorizedSchema(schema)) {
            backendConnection.setCurrentSchema(schema);
            return new UpdateResponse();
        }
        return new ErrorResponse(new UnknownDatabaseException(schema));
        
    }
    
    private boolean isAuthorizedSchema(final String schema) {
        Collection<String> authorizedSchemas = ShardingProxyContext.getInstance().getAuthentication().getUsers().get(backendConnection.getUserName()).getAuthorizedSchemas();
        return authorizedSchemas.isEmpty() || authorizedSchemas.contains(schema);
    }
    
    @Override
    public boolean next() {
        return false;
    }
    
    @Override
    public QueryData getQueryData() {
        return null;
    }
}
