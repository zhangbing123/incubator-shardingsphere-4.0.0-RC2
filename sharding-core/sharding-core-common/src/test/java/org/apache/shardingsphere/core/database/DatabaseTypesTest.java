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

package org.apache.shardingsphere.core.database;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public final class DatabaseTypesTest {
    
    @Test
    public void assertGetDatabaseTypes() {
        assertTrue(DatabaseTypes.getDatabaseTypes().contains(DatabaseTypes.getActualDatabaseType("MySQL")));
        assertTrue(DatabaseTypes.getDatabaseTypes().contains(DatabaseTypes.getActualDatabaseType("PostgreSQL")));
        assertTrue(DatabaseTypes.getDatabaseTypes().contains(DatabaseTypes.getActualDatabaseType("Oracle")));
        assertTrue(DatabaseTypes.getDatabaseTypes().contains(DatabaseTypes.getActualDatabaseType("SQLServer")));
        assertTrue(DatabaseTypes.getDatabaseTypes().contains(DatabaseTypes.getActualDatabaseType("H2")));
    }
    
    @Test
    public void assertGetActualDatabaseType() {
        assertThat(DatabaseTypes.getActualDatabaseType("MySQL").getName(), is("MySQL"));
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void assertGetActualDatabaseTypeWithNotExistedDatabaseType() {
        DatabaseTypes.getActualDatabaseType("Invalid");
    }
    
    @Test
    public void assertGetTrunkDatabaseTypeWithTrunkDatabaseType() {
        assertThat(DatabaseTypes.getTrunkDatabaseType("MySQL").getName(), is("MySQL"));
    }
    
    @Test
    public void assertGetTrunkDatabaseTypeWithBranchDatabaseType() {
        assertThat(DatabaseTypes.getTrunkDatabaseType("H2").getName(), is("MySQL"));
    }
    
    @Test
    public void assertGetDatabaseTypeByStandardURL() {
        assertThat(DatabaseTypes.getDatabaseTypeByURL("jdbc:mysql://localhost:3306/test").getName(), is("MySQL"));
    }
    
    @Test
    public void assertGetDatabaseTypeByURLAlias() {
        assertThat(DatabaseTypes.getDatabaseTypeByURL("jdbc:mysqlx://localhost:3306/test").getName(), is("MySQL"));
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void assertGetDatabaseTypeByURLWithUnrecognizedDatabaseURL() {
        DatabaseTypes.getDatabaseTypeByURL("Invalid");
    }
}
