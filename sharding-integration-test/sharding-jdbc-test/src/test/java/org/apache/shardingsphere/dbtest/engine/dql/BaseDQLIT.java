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

package org.apache.shardingsphere.dbtest.engine.dql;

import org.apache.shardingsphere.core.database.DatabaseTypes;
import org.apache.shardingsphere.dbtest.cases.assertion.dql.DQLIntegrateTestCaseAssertion;
import org.apache.shardingsphere.dbtest.cases.dataset.DataSet;
import org.apache.shardingsphere.dbtest.cases.dataset.metadata.DataSetColumn;
import org.apache.shardingsphere.dbtest.cases.dataset.metadata.DataSetMetadata;
import org.apache.shardingsphere.dbtest.cases.dataset.row.DataSetRow;
import org.apache.shardingsphere.dbtest.engine.SingleIT;
import org.apache.shardingsphere.dbtest.env.DatabaseTypeEnvironment;
import org.apache.shardingsphere.dbtest.env.EnvironmentPath;
import org.apache.shardingsphere.dbtest.env.IntegrateTestEnvironment;
import org.apache.shardingsphere.dbtest.env.dataset.DataSetEnvironmentManager;
import org.apache.shardingsphere.dbtest.env.datasource.DataSourceUtil;
import org.apache.shardingsphere.dbtest.env.schema.SchemaEnvironmentManager;
import org.apache.shardingsphere.spi.database.DatabaseType;
import org.apache.shardingsphere.test.sql.SQLCaseType;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.sql.DataSource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public abstract class BaseDQLIT extends SingleIT {
    
    private static IntegrateTestEnvironment integrateTestEnvironment = IntegrateTestEnvironment.getInstance();
    
    public BaseDQLIT(final String sqlCaseId, final String path, final DQLIntegrateTestCaseAssertion assertion, final String shardingRuleType,
                     final DatabaseTypeEnvironment databaseTypeEnvironment, final SQLCaseType caseType) throws IOException, JAXBException, SQLException, ParseException {
        super(sqlCaseId, path, assertion, shardingRuleType, databaseTypeEnvironment, caseType);
    }
    
    @BeforeClass
    public static void insertData() throws IOException, JAXBException, SQLException, ParseException {
        createDatabasesAndTables();
        for (DatabaseType each : DatabaseTypes.getDatabaseTypes()) {
            if (IntegrateTestEnvironment.getInstance().getDatabaseTypes().contains(each)) {
                insertData(each);
            }
        }
    }
    
    private static void insertData(final DatabaseType databaseType) throws SQLException, ParseException, IOException, JAXBException {
        for (String each : integrateTestEnvironment.getShardingRuleTypes()) {
            new DataSetEnvironmentManager(EnvironmentPath.getDataInitializeResourceFile(each), createDataSourceMap(databaseType, each)).initialize();
        }
    }
    
    @AfterClass
    public static void clearData() throws IOException, JAXBException, SQLException {
        for (DatabaseType each : DatabaseTypes.getDatabaseTypes()) {
            if (IntegrateTestEnvironment.getInstance().getDatabaseTypes().contains(each)) {
                clearData(each);
            }
        }
        dropDatabases();
    }
    
    private static void clearData(final DatabaseType databaseType) throws SQLException, IOException, JAXBException {
        for (String each : integrateTestEnvironment.getShardingRuleTypes()) {
            new DataSetEnvironmentManager(EnvironmentPath.getDataInitializeResourceFile(each), createDataSourceMap(databaseType, each)).clear();
        }
    }
    
    private static Map<String, DataSource> createDataSourceMap(final DatabaseType databaseType, final String shardingRuleType) throws IOException, JAXBException {
        Collection<String> dataSourceNames = SchemaEnvironmentManager.getDataSourceNames(shardingRuleType);
        Map<String, DataSource> result = new HashMap<>(dataSourceNames.size(), 1);
        for (String each : dataSourceNames) {
            result.put(each, DataSourceUtil.createDataSource(databaseType, each));
        }
        return result;
    }
    
    protected final void assertResultSet(final ResultSet resultSet) throws SQLException, JAXBException, IOException {
        DataSet expected;
        try (FileReader reader = new FileReader(getExpectedDataFile())) {
            expected = (DataSet) JAXBContext.newInstance(DataSet.class).createUnmarshaller().unmarshal(reader);
        }
        List<DataSetColumn> expectedColumns = new LinkedList<>();
        for (DataSetMetadata each : expected.getMetadataList()) {
            expectedColumns.addAll(each.getColumns());
        }
        assertMetaData(resultSet.getMetaData(), expectedColumns);
        assertRows(resultSet, expected.getRows());
    }
    
    private void assertMetaData(final ResultSetMetaData actualMetaData, final List<DataSetColumn> expectedColumns) throws SQLException {
        assertThat(actualMetaData.getColumnCount(), is(expectedColumns.size()));
        int index = 1;
        for (DataSetColumn each : expectedColumns) {
            assertThat(actualMetaData.getColumnLabel(index++).toLowerCase(), is(each.getName().toLowerCase()));
        }
    }
    
    private void assertRows(final ResultSet actualResultSet, final List<DataSetRow> expectedDatSetRows) throws SQLException {
        int count = 0;
        ResultSetMetaData actualMetaData = actualResultSet.getMetaData();
        while (actualResultSet.next()) {
            int index = 1;
            assertTrue("Size of actual result set is different with size of expected dat set rows.", count < expectedDatSetRows.size());
            for (String each : expectedDatSetRows.get(count).getValues()) {
                if (Types.DATE == actualResultSet.getMetaData().getColumnType(index)) {
                    if (!getNotVerifyFlag().equals(each)) {
                        assertThat(new SimpleDateFormat("yyyy-MM-dd").format(actualResultSet.getDate(index)), is(each));
                        assertThat(new SimpleDateFormat("yyyy-MM-dd").format(actualResultSet.getDate(actualMetaData.getColumnLabel(index))), is(each));
                    }
                } else {
                    assertThat(String.valueOf(actualResultSet.getObject(index)), is(each));
                    assertThat(String.valueOf(actualResultSet.getObject(actualMetaData.getColumnLabel(index))), is(each));
                }
                index++;
            }
            count++;
        }
        assertThat("Size of actual result set is different with size of expected dat set rows.", count, is(expectedDatSetRows.size()));
    }
}
