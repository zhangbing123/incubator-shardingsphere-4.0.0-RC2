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

import lombok.SneakyThrows;
import org.apache.shardingsphere.shardingproxy.backend.MockLogicSchemasUtil;
import org.apache.shardingsphere.shardingproxy.backend.communication.DatabaseCommunicationEngine;
import org.apache.shardingsphere.shardingproxy.backend.communication.DatabaseCommunicationEngineFactory;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.response.BackendResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.update.UpdateResponse;
import org.apache.shardingsphere.shardingproxy.backend.schema.LogicSchema;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Field;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public final class UnicastBackendHandlerTest {
    
    @Spy
    private BackendConnection backendConnection = new BackendConnection(TransactionType.LOCAL);
    
    @Mock
    private DatabaseCommunicationEngineFactory databaseCommunicationEngineFactory;
    
    @Before
    public void setUp() {
        MockLogicSchemasUtil.setLogicSchemas("schema", 10);
        setUnderlyingHandler(new UpdateResponse());
    }
    
    @Test
    public void assertExecuteWhileSchemaIsNull() {
        UnicastBackendHandler backendHandler = new UnicastBackendHandler("show variable like %s", backendConnection);
        setDatabaseCommunicationEngine(backendHandler);
        BackendResponse actual = backendHandler.execute();
        assertThat(actual, instanceOf(UpdateResponse.class));
        verify(backendConnection).setCurrentSchema(null);
        backendHandler.execute();
    }
    
    @Test
    public void assertExecuteWhileSchemaNotNull() {
        backendConnection.setCurrentSchema("schema_0");
        UnicastBackendHandler backendHandler = new UnicastBackendHandler("show variable like %s", backendConnection);
        setDatabaseCommunicationEngine(backendHandler);
        BackendResponse actual = backendHandler.execute();
        assertThat(actual, instanceOf(UpdateResponse.class));
        backendHandler.execute();
    }
    
    private void setUnderlyingHandler(final BackendResponse backendResponse) {
        DatabaseCommunicationEngine databaseCommunicationEngine = mock(DatabaseCommunicationEngine.class);
        when(databaseCommunicationEngine.execute()).thenReturn(backendResponse);
        when(databaseCommunicationEngineFactory.newTextProtocolInstance((LogicSchema) any(), anyString(), (BackendConnection) any())).thenReturn(databaseCommunicationEngine);
    }
    
    @SneakyThrows
    private void setDatabaseCommunicationEngine(final UnicastBackendHandler unicastSchemaBackendHandler) {
        Field field = unicastSchemaBackendHandler.getClass().getDeclaredField("databaseCommunicationEngineFactory");
        field.setAccessible(true);
        field.set(unicastSchemaBackendHandler, databaseCommunicationEngineFactory);
    }
}
