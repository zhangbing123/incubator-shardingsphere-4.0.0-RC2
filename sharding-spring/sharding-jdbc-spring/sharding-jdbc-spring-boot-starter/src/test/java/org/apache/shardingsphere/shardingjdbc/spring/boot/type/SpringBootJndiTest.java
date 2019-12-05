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

package org.apache.shardingsphere.shardingjdbc.spring.boot.type;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.shardingsphere.shardingjdbc.jdbc.core.datasource.ShardingDataSource;
import org.apache.shardingsphere.shardingjdbc.spring.boot.fixture.TestJndiInitialContextFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.naming.Context;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootJndiTest.class)
@SpringBootApplication
@ActiveProfiles("jndi")
public class SpringBootJndiTest {
    
    private static final String TEST_DATASOURCE_URL = "jdbc:h2:mem:%s;DB_CLOSE_DELAY=-1;DATABASE_TO_UPPER=false;MODE=MYSQL";
    
    private static final String JNDI_DATASOURCE_0 = "java:comp/env/jdbc/jndi0";
    
    private static final String JNDI_DATASOURCE_1 = "java:comp/env/jdbc/jndi1";
    
    private static DataSource dataSource0;
    
    private static DataSource dataSource1;
    
    @Autowired
    private DataSource dataSource;
    
    @BeforeClass
    public static void setUpBeforeClass() {
        System.setProperty(Context.INITIAL_CONTEXT_FACTORY, TestJndiInitialContextFactory.class.getName());
        dataSource0 = createNewDataSource("jndi0");
        dataSource1 = createNewDataSource("jndi1");
        TestJndiInitialContextFactory.bind(JNDI_DATASOURCE_0, dataSource0);
        TestJndiInitialContextFactory.bind(JNDI_DATASOURCE_1, dataSource1);
    }
    
    private static DataSource createNewDataSource(final String dsName) {
        BasicDataSource result = new BasicDataSource();
        result.setUrl(String.format(TEST_DATASOURCE_URL, dsName));
        result.setUsername("sa");
        result.setPassword("");
        result.setDriverClassName("org.h2.Driver");
        return result;
    }
    
    @Test
    public void assertJndiDatasource() throws SQLException {
        assertThat(dataSource, instanceOf(ShardingDataSource.class));
        Map<String, DataSource> dataSourceMap = ((ShardingDataSource) dataSource).getDataSourceMap();
        assertThat(dataSourceMap.size(), is(2));
        assertTrue(dataSourceMap.containsKey("jndi0"));
        assertTrue(dataSourceMap.containsKey("jndi1"));
        assertDatasource(dataSourceMap.get("jndi0"), String.format(TEST_DATASOURCE_URL, "jndi0"));
        assertDatasource(dataSourceMap.get("jndi1"), String.format(TEST_DATASOURCE_URL, "jndi1"));
    }
    
    private void assertDatasource(final DataSource actualDatasource, final String expectedJDBCUrl) throws SQLException {
        String expectedJDBCUrlWithoutParameters = expectedJDBCUrl.substring(0, expectedJDBCUrl.indexOf(";"));
        try (Connection connection = actualDatasource.getConnection()) {
            assertThat(connection.getMetaData().getURL(), is(expectedJDBCUrlWithoutParameters));
        }
    }
}
