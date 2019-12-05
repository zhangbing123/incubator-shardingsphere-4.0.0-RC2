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

import com.google.common.base.Preconditions;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.shardingjdbc.jdbc.unsupported.AbstractUnsupportedGeneratedKeysResultSet;

import java.math.BigDecimal;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Collections;
import java.util.Iterator;

/**
 * ResultSet for generated keys.
 * 
 * @author gaohongtao
 */
@RequiredArgsConstructor
public final class GeneratedKeysResultSet extends AbstractUnsupportedGeneratedKeysResultSet {
    
    private final Iterator<Comparable<?>> generatedKeys;
    
    private final String generatedKeyColumn;
    
    private final Statement statement;
    
    private boolean closed;
    
    private Comparable<?> currentGeneratedKey;
    
    public GeneratedKeysResultSet() {
        generatedKeys = Collections.<Comparable<?>>emptyList().iterator();
        generatedKeyColumn = null;
        statement = null;
    }
    
    @Override
    public boolean isClosed() {
        return closed;
    }
    
    @Override
    public boolean next() {
        if (closed || !generatedKeys.hasNext()) {
            currentGeneratedKey = null;
            return false;
        }
        currentGeneratedKey = generatedKeys.next();
        return true;
    }
    
    @Override
    public void close() {
        closed = true;
    }
    
    @Override
    public ResultSetMetaData getMetaData() {
        checkState();
        return new GeneratedKeysResultSetMetaData(generatedKeyColumn);
    }
    
    @Override
    public boolean wasNull() {
        checkState();
        return false;
    }
    
    @Override
    public String getString(final int columnIndex) {
        checkStateForGetData();
        return currentGeneratedKey.toString();
    }
    
    @Override
    public String getString(final String columnLabel) {
        return getString(1);
    }
    
    @Override
    public byte getByte(final int columnIndex) {
        checkStateForGetData();
        return Byte.valueOf(getString(columnIndex));
    }
    
    @Override
    public byte getByte(final String columnLabel) {
        return getByte(1);
    }
    
    @Override
    public short getShort(final int columnIndex) {
        checkStateForGetData();
        return Short.valueOf(getString(columnIndex));
    }
    
    @Override
    public short getShort(final String columnLabel) {
        return getShort(1);
    }
    
    @Override
    public int getInt(final int columnIndex) {
        checkStateForGetData();
        return Integer.valueOf(getString(columnIndex));
    }
    
    @Override
    public int getInt(final String columnLabel) {
        return getInt(1);
    }
    
    @Override
    public long getLong(final int columnIndex) {
        checkStateForGetData();
        return Long.valueOf(getString(columnIndex));
    }
    
    @Override
    public long getLong(final String columnLabel) {
        return getLong(1);
    }
    
    @Override
    public float getFloat(final int columnIndex) {
        checkStateForGetData();
        return Float.valueOf(getString(columnIndex));
    }
    
    @Override
    public float getFloat(final String columnLabel) {
        return getFloat(1);
    }
    
    @Override
    public double getDouble(final int columnIndex) {
        checkStateForGetData();
        return Double.valueOf(getString(columnIndex));
    }
    
    @Override
    public double getDouble(final String columnLabel) {
        return getDouble(1);
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public BigDecimal getBigDecimal(final int columnIndex, final int scale) {
        checkStateForGetData();
        return new BigDecimal(getString(columnIndex)).setScale(scale, BigDecimal.ROUND_HALF_UP);
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public BigDecimal getBigDecimal(final String columnLabel, final int scale) {
        return getBigDecimal(1, scale);
    }
    
    @Override
    public BigDecimal getBigDecimal(final int columnIndex) {
        checkStateForGetData();
        return new BigDecimal(getString(columnIndex));
    }
    
    @Override
    public BigDecimal getBigDecimal(final String columnLabel) {
        return getBigDecimal(1);
    }
    
    @Override
    public byte[] getBytes(final int columnIndex) {
        checkStateForGetData();
        return getString(columnIndex).getBytes();
    }
    
    @Override
    public byte[] getBytes(final String columnLabel) {
        return getBytes(1);
    }
    
    @Override
    public Object getObject(final int columnIndex) {
        checkStateForGetData();
        return currentGeneratedKey;
    }
    
    @Override
    public Object getObject(final String columnLabel) {
        return getObject(1);
    }
    
    @Override
    public int findColumn(final String columnLabel) {
        checkState();
        return 1;
    }
    
    @Override
    public int getType() {
        checkState();
        return TYPE_FORWARD_ONLY;
    }
    
    @Override
    public int getConcurrency() {
        checkState();
        return CONCUR_READ_ONLY;
    }
    
    @Override
    public Statement getStatement() {
        checkState();
        return statement;
    }
    
    private void checkState() {
        Preconditions.checkState(!closed, "ResultSet has closed.");
    }
    
    private void checkStateForGetData() {
        checkState();
        Preconditions.checkNotNull(currentGeneratedKey, "ResultSet should call next or has no more data.");
    }
}
