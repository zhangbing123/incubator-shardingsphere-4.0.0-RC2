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

package org.apache.shardingsphere.core.parse.cache;

import org.apache.shardingsphere.core.parse.sql.statement.SQLStatement;
import org.apache.shardingsphere.core.parse.sql.statement.dml.SelectStatement;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public final class SQLParseResultCacheTest {
    
    @Test
    public void assertGetSQLStatementWithinCache() {
        SQLParseResultCache actual = new SQLParseResultCache();
        SQLStatement selectStatement = new SelectStatement();
        actual.put("SELECT 1", selectStatement);
        assertTrue(actual.getSQLStatement("SELECT 1").isPresent());
        assertThat(actual.getSQLStatement("SELECT 1").get(), is(selectStatement));
    }
    
    @Test
    public void assertGetSQLStatementWithoutCache() {
        SQLParseResultCache actual = new SQLParseResultCache();
        SQLStatement selectStatement = new SelectStatement();
        actual.put("SELECT 1", selectStatement);
        assertFalse(actual.getSQLStatement("SELECT 2").isPresent());
    }
    
    @Test
    public void assertClear() {
        SQLParseResultCache actual = new SQLParseResultCache();
        SQLStatement selectStatement = new SelectStatement();
        actual.put("SELECT 1", selectStatement);
        actual.clear();
        assertFalse(actual.getSQLStatement("SELECT 1").isPresent());
    }
}
