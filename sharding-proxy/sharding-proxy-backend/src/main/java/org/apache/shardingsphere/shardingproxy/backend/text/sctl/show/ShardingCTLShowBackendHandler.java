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

package org.apache.shardingsphere.shardingproxy.backend.text.sctl.show;

import com.google.common.base.Optional;
import org.apache.shardingsphere.core.merge.MergedResult;
import org.apache.shardingsphere.core.merge.dal.show.ShowShardingCTLMergedResult;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.response.BackendResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.error.ErrorResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryData;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryHeader;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryResponse;
import org.apache.shardingsphere.shardingproxy.backend.text.TextProtocolBackendHandler;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.exception.InvalidShardingCTLFormatException;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.exception.UnsupportedShardingCTLTypeException;

import java.sql.SQLException;
import java.sql.Types;
import java.util.Arrays;
import java.util.Collections;

/**
 * Sharding CTL show backend handler.
 *
 * @author zhaojun
 */
public final class ShardingCTLShowBackendHandler implements TextProtocolBackendHandler {
    
    private final String sql;
    
    private final BackendConnection backendConnection;
    
    private MergedResult mergedResult;
    
    public ShardingCTLShowBackendHandler(final String sql, final BackendConnection backendConnection) {
        this.sql = sql.toUpperCase().trim();
        this.backendConnection = backendConnection;
    }
    
    @Override
    public BackendResponse execute() {
        Optional<ShardingCTLShowStatement> showStatement = new ShardingCTLShowParser(sql).doParse();
        if (!showStatement.isPresent()) {
            return new ErrorResponse(new InvalidShardingCTLFormatException(sql));
        }
        switch (showStatement.get().getValue()) {
            case "TRANSACTION_TYPE":
                return createResponsePackets("TRANSACTION_TYPE", backendConnection.getTransactionType().name());
            case "CACHED_CONNECTIONS":
                return createResponsePackets("CACHED_CONNECTIONS", backendConnection.getConnectionSize());
            default:
                return new ErrorResponse(new UnsupportedShardingCTLTypeException(sql));
        }
    }
    
    private BackendResponse createResponsePackets(final String columnName, final Object... values) {
        mergedResult = new ShowShardingCTLMergedResult(Arrays.asList(values));
        return new QueryResponse(Collections.singletonList(new QueryHeader("", "", columnName, columnName, 100, Types.VARCHAR, 0)));
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
