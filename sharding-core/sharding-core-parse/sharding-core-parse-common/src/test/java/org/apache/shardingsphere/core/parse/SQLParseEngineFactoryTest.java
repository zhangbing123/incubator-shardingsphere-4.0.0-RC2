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

package org.apache.shardingsphere.core.parse;

import org.apache.shardingsphere.core.database.DatabaseTypes;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public final class SQLParseEngineFactoryTest {
    
    @Before
    @After
    public void reset() throws NoSuchFieldException, IllegalAccessException {
        Field field = SQLParseEngineFactory.class.getDeclaredField("ENGINES");
        field.setAccessible(true);
        ((Map) field.get(SQLParseEngineFactory.class)).clear();
    }
    
    @Test
    public void assertGetSQLParseEngine() {
        assertThat(SQLParseEngineFactory.getSQLParseEngine(DatabaseTypes.getTrunkDatabaseType("MySQL")), is(SQLParseEngineFactory.getSQLParseEngine(DatabaseTypes.getTrunkDatabaseType("MySQL"))));
    }
}
