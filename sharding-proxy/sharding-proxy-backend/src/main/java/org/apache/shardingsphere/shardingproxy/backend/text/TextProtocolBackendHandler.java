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

package org.apache.shardingsphere.shardingproxy.backend.text;

import org.apache.shardingsphere.shardingproxy.backend.response.BackendResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryData;

import java.sql.SQLException;

/**
 * Text protocol backend handler.
 *
 * @author zhangliang
 */
public interface TextProtocolBackendHandler {
    
    /**
     * Execute command.
     *
     * @return backend response
     */
    BackendResponse execute();
    
    /**
     * Goto next result value.
     *
     * @return has more result value or not
     * @throws SQLException SQL exception
     */
    boolean next() throws SQLException;
    
    /**
     * Get query data.
     *
     * @return query data
     * @throws SQLException SQL exception
     */
    QueryData getQueryData() throws SQLException;
}
