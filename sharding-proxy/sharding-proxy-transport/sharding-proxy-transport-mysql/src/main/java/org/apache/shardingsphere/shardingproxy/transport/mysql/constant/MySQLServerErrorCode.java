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

package org.apache.shardingsphere.shardingproxy.transport.mysql.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.shardingproxy.error.SQLErrorCode;

/**
 * Server error code for MySQL.
 * 
 * @see <a href="https://dev.mysql.com/doc/refman/5.7/en/error-messages-server.html">error-messages-server</a>
 *
 * @author zhangliang
 */
@RequiredArgsConstructor
@Getter
public enum MySQLServerErrorCode implements SQLErrorCode {
    
    ER_ACCESS_DENIED_ERROR(1045, "28000", "Access denied for user '%s'@'%s' (using password: %s)"),
    
    ER_NO_DB_ERROR(1046, "3D000", "No database selected"),
    
    ER_BAD_DB_ERROR(1049, "42000", "Unknown database '%s'"),
    
    ER_ERROR_ON_MODIFYING_GTID_EXECUTED_TABLE(3176, "HY000", 
            "Please do not modify the %s table with an XA transaction. This is an internal system table used to store GTIDs for committed transactions. " 
                    + "Although modifying it can lead to an inconsistent GTID state, if neccessary you can modify it with a non-XA transaction.");
    
    private final int errorCode;
    
    private final String sqlState;
    
    private final String errorMessage;
}
