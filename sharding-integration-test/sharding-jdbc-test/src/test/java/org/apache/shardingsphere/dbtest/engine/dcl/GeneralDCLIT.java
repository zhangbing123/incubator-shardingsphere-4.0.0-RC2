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

package org.apache.shardingsphere.dbtest.engine.dcl;

import org.apache.shardingsphere.dbtest.cases.assertion.dcl.DCLIntegrateTestCaseAssertion;
import org.apache.shardingsphere.dbtest.engine.SQLType;
import org.apache.shardingsphere.dbtest.engine.util.IntegrateTestParameters;
import org.apache.shardingsphere.dbtest.env.DatabaseTypeEnvironment;
import org.apache.shardingsphere.test.sql.SQLCaseType;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Collection;

public final class GeneralDCLIT extends BaseDCLIT {
    
    public GeneralDCLIT(final String sqlCaseId, final String path, final DCLIntegrateTestCaseAssertion assertion, final String shardingRuleType,
                        final DatabaseTypeEnvironment databaseTypeEnvironment, final SQLCaseType caseType) throws IOException, JAXBException, SQLException, ParseException {
        super(sqlCaseId, path, assertion, shardingRuleType, databaseTypeEnvironment, caseType);
    }
    
    @Parameters(name = "{0} -> Rule:{3} -> {4} -> {5}")
    public static Collection<Object[]> getParameters() {
        return IntegrateTestParameters.getParametersWithAssertion(SQLType.DCL);
    }
    
    @Test
    public void assertExecuteUpdate() throws SQLException {
        if (!getDatabaseTypeEnvironment().isEnabled()) {
            return;
        }
        try (Connection connection = getDataSource().getConnection()) {
            if (SQLCaseType.Literal == getCaseType()) {
                connection.createStatement().executeUpdate(getSql());
            } else {
                connection.prepareStatement(getSql()).executeUpdate();
            }
        }
    }
    
    @Test
    public void assertExecute() throws SQLException {
        if (!getDatabaseTypeEnvironment().isEnabled()) {
            return;
        }
        try (Connection connection = getDataSource().getConnection()) {
            if (SQLCaseType.Literal == getCaseType()) {
                connection.createStatement().execute(getSql());
            } else {
                connection.prepareStatement(getSql()).execute();
            }
        }
    }
}
