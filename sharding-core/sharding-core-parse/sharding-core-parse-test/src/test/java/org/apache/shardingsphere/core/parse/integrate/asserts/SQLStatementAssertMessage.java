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

package org.apache.shardingsphere.core.parse.integrate.asserts;

import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.core.parse.integrate.jaxb.ParserResultSetRegistry;
import org.apache.shardingsphere.test.sql.SQLCaseType;
import org.apache.shardingsphere.test.sql.loader.SQLCasesLoader;

import java.util.Collections;

/**
 * SQL statement assert message.
 *
 * @author zhangliang
 */
@RequiredArgsConstructor
public final class SQLStatementAssertMessage {
    
    private final SQLCasesLoader sqlCasesLoader;
    
    private final ParserResultSetRegistry parserResultSetRegistry;
    
    private final String sqlCaseId;
    
    private final SQLCaseType sqlCaseType;
    
    /**
     * Get full assert message.
     * 
     * @param assertMessage assert message
     * @return full assert message
     */
    public String getFullAssertMessage(final String assertMessage) {
        StringBuilder result = new StringBuilder(System.getProperty("line.separator"));
        result.append("SQL Case ID : ");
        result.append(sqlCaseId);
        result.append(System.getProperty("line.separator"));
        result.append("SQL         : ");
        if (SQLCaseType.Placeholder == sqlCaseType) {
            result.append(sqlCasesLoader.getSQL(sqlCaseId, sqlCaseType, Collections.emptyList()));
            result.append(System.getProperty("line.separator"));
            result.append("SQL Params  : ");
            result.append(parserResultSetRegistry.get(sqlCaseId).getParameters());
            result.append(System.getProperty("line.separator"));
        } else {
            result.append(sqlCasesLoader.getSQL(sqlCaseId, sqlCaseType, parserResultSetRegistry.get(sqlCaseId).getParameters()));
        }
        result.append(System.getProperty("line.separator"));
        result.append(assertMessage);
        result.append(System.getProperty("line.separator"));
        return result.toString();
    }
}
