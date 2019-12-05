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

package org.apache.shardingsphere.shardingproxy.backend.text.sctl;

import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.text.TextProtocolBackendHandler;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.explain.ShardingCTLExplainBackendHandler;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.set.ShardingCTLSetBackendHandler;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.show.ShardingCTLShowBackendHandler;

/**
 * Sharding CTL backend handler factory.
 *
 * @author zhangliang
 */
public final class ShardingCTLBackendHandlerFactory {
    
    public static final String SCTL = "SCTL:";
    
    private static final String SCTL_SET = SCTL + "SET";
    
    private static final String SCTL_SHOW = SCTL + "SHOW";

    private static final String SCTL_EXPLAIN = SCTL + "EXPLAIN";
    
    /**
     * Create new instance of sharding CTL backend handler.
     *
     * @param sql SQL to be executed
     * @param backendConnection backend connection
     * @return instance of sharding CTL backend handler
     */
    public static TextProtocolBackendHandler newInstance(final String sql, final BackendConnection backendConnection) {
        if (sql.toUpperCase().startsWith(SCTL_SET)) {
            return new ShardingCTLSetBackendHandler(sql, backendConnection);
        }
        if (sql.toUpperCase().startsWith(SCTL_SHOW)) {
            return new ShardingCTLShowBackendHandler(sql, backendConnection);
        }
        if (sql.toUpperCase().startsWith(SCTL_EXPLAIN)) {
            return new ShardingCTLExplainBackendHandler(sql, backendConnection);
        }
        throw new IllegalArgumentException(sql);
    }
}
