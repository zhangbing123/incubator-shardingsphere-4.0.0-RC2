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

import com.google.common.collect.Lists;
import lombok.EqualsAndHashCode;
import org.apache.shardingsphere.core.rule.ShardingRule;
import org.apache.shardingsphere.shardingjdbc.jdbc.unsupported.AbstractUnsupportedDatabaseMetaDataResultSet;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Database meta data result set.
 *
 * @author yangyi
 */
public final class DatabaseMetaDataResultSet extends AbstractUnsupportedDatabaseMetaDataResultSet {
    
    private static final String TABLE_NAME = "TABLE_NAME";
    
    private static final String INDEX_NAME = "INDEX_NAME";
    
    private final int type;
    
    private final int concurrency;
    
    private final ShardingRule shardingRule;
    
    private final ResultSetMetaData resultSetMetaData;
    
    private final Map<String, Integer> columnLabelIndexMap;
    
    private final Iterator<DatabaseMetaDataObject> databaseMetaDataObjectIterator;
    
    private volatile boolean closed;
    
    private DatabaseMetaDataObject currentDatabaseMetaDataObject;
    
    public DatabaseMetaDataResultSet(final ResultSet resultSet, final ShardingRule shardingRule) throws SQLException {
        this.type = resultSet.getType();
        this.concurrency = resultSet.getConcurrency();
        this.shardingRule = shardingRule;
        this.resultSetMetaData = resultSet.getMetaData();
        this.columnLabelIndexMap = initIndexMap();
        this.databaseMetaDataObjectIterator = initIterator(resultSet);
    }
    
    private Map<String, Integer> initIndexMap() throws SQLException {
        Map<String, Integer> result = new HashMap<>(resultSetMetaData.getColumnCount());
        for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
            result.put(resultSetMetaData.getColumnLabel(i), i);
        }
        return result;
    }
    
    private Iterator<DatabaseMetaDataObject> initIterator(final ResultSet resultSet) throws SQLException {
        ArrayList<DatabaseMetaDataObject> result = Lists.newArrayList();
        Set<DatabaseMetaDataObject> removeDuplicationSet = new HashSet<>();
        int tableNameColumnIndex = columnLabelIndexMap.containsKey(TABLE_NAME) ? columnLabelIndexMap.get(TABLE_NAME) : -1;
        int indexNameColumnIndex = columnLabelIndexMap.containsKey(INDEX_NAME) ? columnLabelIndexMap.get(INDEX_NAME) : -1;
        while (resultSet.next()) {
            DatabaseMetaDataObject databaseMetaDataObject = generateDatabaseMetaDataObject(tableNameColumnIndex, indexNameColumnIndex, resultSet);
            if (!removeDuplicationSet.contains(databaseMetaDataObject)) {
                result.add(databaseMetaDataObject);
                removeDuplicationSet.add(databaseMetaDataObject);
            }
        }
        return result.iterator();
    }
    
    private DatabaseMetaDataObject generateDatabaseMetaDataObject(final int tableNameColumnIndex, final int indexNameColumnIndex, final ResultSet resultSet) throws SQLException {
        DatabaseMetaDataObject result = new DatabaseMetaDataObject(resultSetMetaData.getColumnCount());
        for (int i = 1; i <= columnLabelIndexMap.size(); i++) {
            if (tableNameColumnIndex == i) {
                String tableName = resultSet.getString(i);
                Collection<String> logicTableNames = null == shardingRule ? Collections.<String>emptyList() : shardingRule.getLogicTableNames(tableName);
                result.addObject(logicTableNames.isEmpty() ? tableName : logicTableNames.iterator().next());
            } else if (indexNameColumnIndex == i) {
                String tableName = resultSet.getString(tableNameColumnIndex);
                String indexName = resultSet.getString(i);
                result.addObject(indexName.endsWith(tableName) ? indexName.substring(0, indexName.indexOf(tableName) - 1) : indexName);
            } else {
                result.addObject(resultSet.getObject(i));
            }
        }
        return result;
    }
    
    @Override
    public boolean next() throws SQLException {
        checkClosed();
        if (databaseMetaDataObjectIterator.hasNext()) {
            currentDatabaseMetaDataObject = databaseMetaDataObjectIterator.next();
            return true;
        }
        return false;
    }
    
    @Override
    public void close() throws SQLException {
        checkClosed();
        closed = true;
    }
    
    @Override
    public boolean wasNull() throws SQLException {
        checkClosed();
        return false;
    }
    
    @Override
    public String getString(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return (String) ResultSetUtil.convertValue(currentDatabaseMetaDataObject.getObject(columnIndex), String.class);
    }
    
    @Override
    public String getString(final String columnLabel) throws SQLException {
        return getString(findColumn(columnLabel));
    }
    
    @Override
    public boolean getBoolean(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return (boolean) ResultSetUtil.convertValue(currentDatabaseMetaDataObject.getObject(columnIndex), boolean.class);
    }
    
    @Override
    public boolean getBoolean(final String columnLabel) throws SQLException {
        return getBoolean(findColumn(columnLabel));
    }
    
    @Override
    public byte getByte(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return (byte) ResultSetUtil.convertValue(currentDatabaseMetaDataObject.getObject(columnIndex), byte.class);
    }
    
    @Override
    public byte getByte(final String columnLabel) throws SQLException {
        return getByte(findColumn(columnLabel));
    }
    
    @Override
    public short getShort(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return (short) ResultSetUtil.convertValue(currentDatabaseMetaDataObject.getObject(columnIndex), short.class);
    }
    
    @Override
    public short getShort(final String columnLabel) throws SQLException {
        return getShort(findColumn(columnLabel));
    }
    
    @Override
    public int getInt(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return (int) ResultSetUtil.convertValue(currentDatabaseMetaDataObject.getObject(columnIndex), int.class);
    }
    
    @Override
    public int getInt(final String columnLabel) throws SQLException {
        return getInt(findColumn(columnLabel));
    }
    
    @Override
    public long getLong(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return (long) ResultSetUtil.convertValue(currentDatabaseMetaDataObject.getObject(columnIndex), long.class);
    }
    
    @Override
    public long getLong(final String columnLabel) throws SQLException {
        return getLong(findColumn(columnLabel));
    }
    
    @Override
    public float getFloat(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return (float) ResultSetUtil.convertValue(currentDatabaseMetaDataObject.getObject(columnIndex), float.class);
    }
    
    @Override
    public float getFloat(final String columnLabel) throws SQLException {
        return getFloat(findColumn(columnLabel));
    }
    
    @Override
    public double getDouble(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return (double) ResultSetUtil.convertValue(currentDatabaseMetaDataObject.getObject(columnIndex), double.class);
    }
    
    @Override
    public double getDouble(final String columnLabel) throws SQLException {
        return getDouble(findColumn(columnLabel));
    }
    
    @Override
    public byte[] getBytes(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return (byte[]) ResultSetUtil.convertValue(currentDatabaseMetaDataObject.getObject(columnIndex), byte[].class);
    }
    
    @Override
    public byte[] getBytes(final String columnLabel) throws SQLException {
        return getBytes(findColumn(columnLabel));
    }
    
    @Override
    public Date getDate(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return (Date) ResultSetUtil.convertValue(currentDatabaseMetaDataObject.getObject(columnIndex), Date.class);
    }
    
    @Override
    public Date getDate(final String columnLabel) throws SQLException {
        return getDate(findColumn(columnLabel));
    }
    
    @Override
    public Time getTime(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return (Time) ResultSetUtil.convertValue(currentDatabaseMetaDataObject.getObject(columnIndex), Time.class);
    }
    
    @Override
    public Time getTime(final String columnLabel) throws SQLException {
        return getTime(findColumn(columnLabel));
    }
    
    @Override
    public Timestamp getTimestamp(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return (Timestamp) ResultSetUtil.convertValue(currentDatabaseMetaDataObject.getObject(columnIndex), Timestamp.class);
    }
    
    @Override
    public Timestamp getTimestamp(final String columnLabel) throws SQLException {
        return getTimestamp(findColumn(columnLabel));
    }
    
    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        checkClosed();
        return resultSetMetaData;
    }
    
    @Override
    public Object getObject(final int columnIndex) throws SQLException {
        checkClosed();
        checkColumnIndex(columnIndex);
        return currentDatabaseMetaDataObject.getObject(columnIndex);
    }
    
    @Override
    public Object getObject(final String columnLabel) throws SQLException {
        return getObject(findColumn(columnLabel));
    }
    
    @Override
    public int findColumn(final String columnLabel) throws SQLException {
        checkClosed();
        if (!columnLabelIndexMap.containsKey(columnLabel)) {
            throw new SQLException(String.format("Can not find columnLabel %s", columnLabel));
        }
        return columnLabelIndexMap.get(columnLabel);
    }
    
    @Override
    public int getType() throws SQLException {
        checkClosed();
        return this.type;
    }
    
    @Override
    public int getConcurrency() throws SQLException {
        checkClosed();
        return this.concurrency;
    }
    
    @Override
    public boolean isClosed() throws SQLException {
        return this.closed;
    }
    
    private void checkClosed() throws SQLException {
        if (closed) {
            throw new SQLException("ResultSet has closed.");
        }
    }
    
    private void checkColumnIndex(final int columnIndex) throws SQLException {
        if (columnIndex < 1 || columnIndex > resultSetMetaData.getColumnCount()) {
            throw new SQLException(String.format("ColumnIndex %d out of range from %d to %d", columnIndex, 1, resultSetMetaData.getColumnCount()));
        }
    }
    
    @EqualsAndHashCode
    private final class DatabaseMetaDataObject {
    
        private final ArrayList<Object> objects;
    
        private DatabaseMetaDataObject(final int columnCount) {
            this.objects = new ArrayList<>(columnCount);
        }
    
        public void addObject(final Object object) {
            objects.add(object);
        }
        
        public Object getObject(final int index) {
            return objects.get(index - 1);
        }
    }
}
