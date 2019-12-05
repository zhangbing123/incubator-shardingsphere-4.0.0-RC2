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

package org.apache.shardingsphere.core.optimize.transparent.statement;

import lombok.Getter;
import lombok.ToString;
import org.apache.shardingsphere.core.optimize.api.segment.Tables;
import org.apache.shardingsphere.core.optimize.api.statement.OptimizedStatement;
import org.apache.shardingsphere.core.parse.sql.statement.SQLStatement;

/**
 * Optimized statement for transparent.
 *
 * @author zhangliang
 */
@ToString(exclude = "sqlStatement")
public final class TransparentOptimizedStatement implements OptimizedStatement {
    
    private final SQLStatement sqlStatement;
    
    @Getter
    private final Tables tables;
    
    public TransparentOptimizedStatement(final SQLStatement sqlStatement) {
        this.sqlStatement = sqlStatement;
        tables = new Tables(sqlStatement);
    }
    
    @Override
    public SQLStatement getSQLStatement() {
        return sqlStatement;
    }
}
