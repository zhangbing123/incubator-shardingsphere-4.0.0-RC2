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

package org.apache.shardingsphere.core.optimize.api.segment;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class ColumnTest {
    
    @Test
    public void assertEqualsForDifferentObjectType() {
        assertFalse(new Column("col", "tbl").equals(new Object()));
    }
    
    @Test
    public void assertEquals() {
        assertTrue(new Column("col", "tbl").equals(new Column("COL", "TBL")));
    }
    
    @Test
    public void assertNotEqualsWhenColumnNameIsDifferent() {
        assertFalse(new Column("col", "tbl").equals(new Column("col1", "tbl")));
    }
    
    @Test
    public void assertNotEqualsWhenTableNameIsDifferent() {
        assertFalse(new Column("col", "tbl").equals(new Column("col", "tbl1")));
    }
}
