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

package org.apache.shardingsphere.shardingproxy.backend.text.admin;

import org.apache.shardingsphere.core.parse.sql.statement.dal.dialect.mysql.UseStatement;
import org.apache.shardingsphere.core.rule.Authentication;
import org.apache.shardingsphere.core.rule.ProxyUser;
import org.apache.shardingsphere.shardingproxy.backend.MockLogicSchemasUtil;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.response.BackendResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.error.ErrorResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.update.UpdateResponse;
import org.apache.shardingsphere.shardingproxy.context.ShardingProxyContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public final class UseDatabaseBackendHandlerTest {
    
    private BackendConnection backendConnection;
    
    @Before
    public void setUp() {
        MockLogicSchemasUtil.setLogicSchemas("schema", 10);
        backendConnection = mock(BackendConnection.class);
        when(backendConnection.getUserName()).thenReturn("root");
        ShardingProxyContext.getInstance().init(getAuthentication(), new Properties());
    }
    
    private Authentication getAuthentication() {
        ProxyUser proxyUser = new ProxyUser("root", Arrays.asList("schema_0", "schema_1"));
        Authentication result = new Authentication();
        result.getUsers().put("root", proxyUser);
        return result;
    }
    
    @Test
    public void assertExecuteUseStatementBackendHandler() {
        UseStatement useStatement = mock(UseStatement.class);
        when(useStatement.getSchema()).thenReturn("schema_0");
        UseDatabaseBackendHandler useSchemaBackendHandler = new UseDatabaseBackendHandler(useStatement, backendConnection);
        BackendResponse actual = useSchemaBackendHandler.execute();
        verify(backendConnection).setCurrentSchema(anyString());
        assertThat(actual, instanceOf(UpdateResponse.class));
    }
    
    @Test
    public void assertExecuteUseStatementNotExist() {
        UseStatement useStatement = mock(UseStatement.class);
        when(useStatement.getSchema()).thenReturn("not_exist");
        UseDatabaseBackendHandler useSchemaBackendHandler = new UseDatabaseBackendHandler(useStatement, backendConnection);
        BackendResponse actual = useSchemaBackendHandler.execute();
        assertThat(actual, instanceOf(ErrorResponse.class));
        verify(backendConnection, times(0)).setCurrentSchema(anyString());
    }
}
