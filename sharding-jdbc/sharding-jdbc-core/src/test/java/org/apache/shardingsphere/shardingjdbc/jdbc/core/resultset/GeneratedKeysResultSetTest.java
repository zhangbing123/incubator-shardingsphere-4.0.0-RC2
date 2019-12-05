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

package org.apache.shardingsphere.shardingjdbc.jdbc.core.resultset;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GeneratedKeysResultSetTest {
    
    private static final Statement STATEMENT = Mockito.mock(Statement.class);
    
    private GeneratedKeysResultSet actualResultSet;
    
    @Before
    public void init() {
        actualResultSet = new GeneratedKeysResultSet(Arrays.<Comparable<?>>asList(1L, 2L).iterator(), "order_id", STATEMENT);
    }
    
    @Test
    public void assertNext() {
        assertTrue(actualResultSet.next());
        assertTrue(actualResultSet.next());
        assertFalse(actualResultSet.next());
    }
    
    @Test
    public void assertNextForEmptyResultSet() {
        GeneratedKeysResultSet actual = new GeneratedKeysResultSet();
        assertFalse(actual.next());
    }
    
    @Test
    public void assertClose() {
        actualResultSet.close();
        assertTrue(actualResultSet.isClosed());
    }
    
    @Test(expected = IllegalStateException.class)
    public void assertThrowExceptionWhenInvokeClosedResultSet() {
        actualResultSet.close();
        actualResultSet.getType();
    }
    
    @Test
    public void assertWasNull() {
        assertFalse(actualResultSet.wasNull());
    }
    
    @Test
    public void assertGetString() {
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getString(1), is("1"));
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getString("order_id"), is("2"));
        assertFalse(actualResultSet.next());
    }
    
    @Test
    public void assertGetByte() {
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getByte(1), is((byte) 1L));
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getByte("order_id"), is((byte) 2L));
        assertFalse(actualResultSet.next());
    }
    
    @Test
    public void assertGetShort() {
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getShort(1), is((short) 1L));
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getShort("order_id"), is((short) 2L));
        assertFalse(actualResultSet.next());
    }
    
    @Test
    public void assertGetInt() {
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getInt(1), is(1));
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getInt("order_id"), is(2));
        assertFalse(actualResultSet.next());
    }
    
    @Test
    public void assertGetLong() {
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getLong(1), is(1L));
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getLong("order_id"), is(2L));
        assertFalse(actualResultSet.next());
    }
    
    @Test
    public void assertGetFloat() {
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getFloat(1), is(1F));
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getFloat("order_id"), is(2F));
        assertFalse(actualResultSet.next());
    }
    
    @Test
    public void assertGetDouble() {
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getDouble(1), is(1D));
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getDouble("order_id"), is(2D));
        assertFalse(actualResultSet.next());
    }
    
    @Test
    public void assertGetBigDecimal() {
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getBigDecimal(1), is(new BigDecimal("1")));
        assertThat(actualResultSet.getBigDecimal(1, 2), is(new BigDecimal("1").setScale(BigDecimal.ROUND_CEILING, BigDecimal.ROUND_HALF_UP)));
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getBigDecimal("order_id"), is(new BigDecimal("2")));
        assertThat(actualResultSet.getBigDecimal("order_id", 2), is(new BigDecimal("2").setScale(BigDecimal.ROUND_CEILING, BigDecimal.ROUND_HALF_UP)));
        assertFalse(actualResultSet.next());
    }
    
    @Test
    public void assertGetBytes() {
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getBytes(1), is("1".getBytes()));
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getBytes("order_id"), is("2".getBytes()));
        assertFalse(actualResultSet.next());
    }
    
    @Test
    public void assertGetObject() {
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getObject(1), is((Object) 1L));
        assertTrue(actualResultSet.next());
        assertThat(actualResultSet.getObject("order_id"), is((Object) 2L));
        assertFalse(actualResultSet.next());
    }
    
    @Test
    public void assertFindColumn() {
        assertThat(actualResultSet.findColumn("any"), is(1));
    }
    
    @Test
    public void assertGetType() {
        assertThat(actualResultSet.getType(), is(ResultSet.TYPE_FORWARD_ONLY));
    }
    
    @Test
    public void assertGetConcurrency() {
        assertThat(actualResultSet.getConcurrency(), is(ResultSet.CONCUR_READ_ONLY));
    }
    
    @Test
    public void assertGetStatement() {
        assertThat(actualResultSet.getStatement(), is(STATEMENT));
    }
}
