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

package org.apache.shardingsphere.shardingjdbc.jdbc;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class JDBCTestSQL {
    
    public static final String INSERT_ORDER_ITEM_WITH_ALL_PLACEHOLDERS_SQL = "INSERT INTO t_order_item (item_id, order_id, user_id, status) VALUES (?, ?, ?, ?)";
    
    public static final String SELECT_WITH_AUTO_INCREMENT_COLUMN_SQL = "SELECT item_id from t_order_item where user_id = %d and order_id= %s and status = 'BATCH'";
    
    public static final String SELECT_WITH_ALIAS_SQL = "SELECT user_id AS usr_id FROM t_order WHERE status = 'init'";
}
