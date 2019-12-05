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

package org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.recognizer;

import org.apache.shardingsphere.core.exception.ShardingException;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.recognizer.impl.H2Recognizer;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.recognizer.impl.MySQLRecognizer;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.recognizer.impl.OracleRecognizer;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.recognizer.impl.PostgreSQLRecognizer;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.recognizer.impl.SQLServerRecognizer;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public final class JDBCDriverURLRecognizerEngineTest {
    
    @Test
    public void assertGetJDBCDriverURLRecognizerForMySQL() {
        assertThat(JDBCDriverURLRecognizerEngine.getJDBCDriverURLRecognizer("jdbc:mysql:xxx"), instanceOf(MySQLRecognizer.class));
    }
    
    @Test
    public void assertGetJDBCDriverURLRecognizerForPostgreSQL() {
        assertThat(JDBCDriverURLRecognizerEngine.getJDBCDriverURLRecognizer("jdbc:postgresql:xxx"), instanceOf(PostgreSQLRecognizer.class));
    }
    
    @Test
    public void assertGetJDBCDriverURLRecognizerForOracle() {
        assertThat(JDBCDriverURLRecognizerEngine.getJDBCDriverURLRecognizer("jdbc:oracle:xxx"), instanceOf(OracleRecognizer.class));
    }
    
    @Test
    public void assertGetJDBCDriverURLRecognizerForSQLServer() {
        assertThat(JDBCDriverURLRecognizerEngine.getJDBCDriverURLRecognizer("jdbc:sqlserver:xxx"), instanceOf(SQLServerRecognizer.class));
    }
    
    @Test
    public void assertGetJDBCDriverURLRecognizerForH2() {
        assertThat(JDBCDriverURLRecognizerEngine.getJDBCDriverURLRecognizer("jdbc:h2:xxx"), instanceOf(H2Recognizer.class));
    }
    
    @Test(expected = ShardingException.class)
    public void assertGetJDBCDriverURLRecognizerFailure() {
        JDBCDriverURLRecognizerEngine.getJDBCDriverURLRecognizer("xxx");
    }
}
