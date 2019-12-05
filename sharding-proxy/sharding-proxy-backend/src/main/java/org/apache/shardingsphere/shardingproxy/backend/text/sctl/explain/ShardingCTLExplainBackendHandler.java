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

package org.apache.shardingsphere.shardingproxy.backend.text.sctl.explain;

import com.google.common.base.Optional;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.core.route.RouteUnit;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.wrapper.StatementExecutorWrapper;
import org.apache.shardingsphere.shardingproxy.backend.response.BackendResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.error.ErrorResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryData;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryHeader;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryResponse;
import org.apache.shardingsphere.shardingproxy.backend.schema.LogicSchemas;
import org.apache.shardingsphere.shardingproxy.backend.text.TextProtocolBackendHandler;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.exception.InvalidShardingCTLFormatException;

import java.sql.Types;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Sharding CTL explain backend handler.
 *
 * @author Wen
 */
@RequiredArgsConstructor
public final class ShardingCTLExplainBackendHandler implements TextProtocolBackendHandler {
    
    private final String sql;
    
    private final BackendConnection backendConnection;
    
    private List<QueryHeader> queryHeaders;
    
    private Iterator<RouteUnit> routeUnits;
    
    @Override
    public BackendResponse execute() {
        Optional<ShardingCTLExplainStatement> explainStatement = new ShardingCTLExplainParser(sql).doParse();
        if (!explainStatement.isPresent()) {
            return new ErrorResponse(new InvalidShardingCTLFormatException(sql));
        }
        StatementExecutorWrapper statementExecutorWrapper = new StatementExecutorWrapper(backendConnection.getLogicSchema());
        routeUnits = statementExecutorWrapper.route(explainStatement.get().getSql(), LogicSchemas.getInstance().getDatabaseType()).getRouteUnits().iterator();
        queryHeaders = new ArrayList<>(2);
        queryHeaders.add(new QueryHeader("", "", "datasource_name", "", 255, Types.CHAR, 0));
        queryHeaders.add(new QueryHeader("", "", "sql", "", 255, Types.CHAR, 0));
        return new QueryResponse(queryHeaders);
    }
    
    @Override
    public boolean next() {
        return null != routeUnits && routeUnits.hasNext();
    }
    
    @Override
    public QueryData getQueryData() {
        RouteUnit routeUnit = routeUnits.next();
        List<Object> row = new ArrayList<>(queryHeaders.size());
        row.add(routeUnit.getDataSourceName());
        row.add(routeUnit.getSqlUnit().getSql());
        List<Integer> columnTypes = new ArrayList<>(queryHeaders.size());
        columnTypes.add(queryHeaders.get(0).getColumnType());
        columnTypes.add(queryHeaders.get(1).getColumnType());
        return new QueryData(columnTypes, row);
    }
}
