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

package org.apache.shardingsphere.core;

import lombok.SneakyThrows;
import org.apache.shardingsphere.core.database.DatabaseTypes;
import org.apache.shardingsphere.core.metadata.ShardingMetaData;
import org.apache.shardingsphere.core.parse.SQLParseEngine;
import org.apache.shardingsphere.core.route.StatementRoutingEngine;
import org.apache.shardingsphere.core.rule.EncryptRule;
import org.apache.shardingsphere.core.rule.ShardingRule;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Field;
import java.util.Collections;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public final class SimpleQueryShardingEngineTest extends BaseShardingEngineTest {
    
    @Mock
    private StatementRoutingEngine routingEngine;
    
    private SimpleQueryShardingEngine shardingEngine;
    
    public SimpleQueryShardingEngineTest() {
        super("SELECT 1", Collections.emptyList());
    }
    
    @Before
    public void setUp() {
        ShardingRule shardingRule = mock(ShardingRule.class);
        EncryptRule encryptRule = mock(EncryptRule.class);
        when(shardingRule.getEncryptRule()).thenReturn(encryptRule);
        shardingEngine = new SimpleQueryShardingEngine(
                shardingRule, getShardingProperties(), mock(ShardingMetaData.class), DatabaseTypes.getActualDatabaseType("MySQL"), mock(SQLParseEngine.class));
        setRoutingEngine();
    }
    
    @SneakyThrows
    private void setRoutingEngine() {
        Field field = SimpleQueryShardingEngine.class.getDeclaredField("routingEngine");
        field.setAccessible(true);
        field.set(shardingEngine, routingEngine);
    }
    
    protected void assertShard() {
        when(routingEngine.route(getSql())).thenReturn(createSQLRouteResult());
        assertSQLRouteResult(shardingEngine.shard(getSql(), getParameters()));
    }
}
