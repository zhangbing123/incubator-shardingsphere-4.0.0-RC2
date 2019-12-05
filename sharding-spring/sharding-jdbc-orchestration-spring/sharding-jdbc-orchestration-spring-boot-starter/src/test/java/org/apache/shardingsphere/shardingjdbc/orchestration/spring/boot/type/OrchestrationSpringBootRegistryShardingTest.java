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

package org.apache.shardingsphere.shardingjdbc.orchestration.spring.boot.type;

import lombok.SneakyThrows;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.shardingsphere.core.constant.properties.ShardingProperties;
import org.apache.shardingsphere.core.constant.properties.ShardingPropertiesConstant;
import org.apache.shardingsphere.core.rule.DataNode;
import org.apache.shardingsphere.core.rule.ShardingRule;
import org.apache.shardingsphere.core.rule.TableRule;
import org.apache.shardingsphere.core.strategy.route.inline.InlineShardingStrategy;
import org.apache.shardingsphere.shardingjdbc.jdbc.core.context.ShardingRuntimeContext;
import org.apache.shardingsphere.shardingjdbc.jdbc.core.datasource.ShardingDataSource;
import org.apache.shardingsphere.shardingjdbc.orchestration.internal.datasource.OrchestrationShardingDataSource;
import org.apache.shardingsphere.shardingjdbc.orchestration.spring.boot.registry.TestRegistryCenter;
import org.apache.shardingsphere.shardingjdbc.orchestration.spring.boot.util.EmbedTestingServer;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.lang.reflect.Field;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = OrchestrationSpringBootRegistryShardingTest.class)
@SpringBootApplication
@ActiveProfiles("registry")
public class OrchestrationSpringBootRegistryShardingTest {
    
    @Resource
    private DataSource dataSource;
    
    @BeforeClass
    public static void init() {
        EmbedTestingServer.start();
        TestRegistryCenter testRegistryCenter = new TestRegistryCenter();
        testRegistryCenter.persist("/demo_spring_boot_ds_registry/config/schema/logic_db/datasource", "ds: !!org.apache.shardingsphere.orchestration.yaml.config.YamlDataSourceConfiguration\n"
            + "  dataSourceClassName: org.apache.commons.dbcp2.BasicDataSource\n"
            + "  properties:\n"
            + "    url: jdbc:h2:mem:ds;DB_CLOSE_DELAY=-1;DATABASE_TO_UPPER=false;MODE=MYSQL\n"
            + "    maxTotal: 16\n"
            + "    password: ''\n"
            + "    username: sa\n"
            + "ds_0: !!org.apache.shardingsphere.orchestration.yaml.config.YamlDataSourceConfiguration\n"
            + "  dataSourceClassName: org.apache.commons.dbcp2.BasicDataSource\n"
            + "  properties:\n"
            + "    url: jdbc:h2:mem:ds_0;DB_CLOSE_DELAY=-1;DATABASE_TO_UPPER=false;MODE=MYSQL\n"
            + "    maxTotal: 16\n"
            + "    password: ''\n"
            + "    username: sa\n"
            + "ds_1: !!org.apache.shardingsphere.orchestration.yaml.config.YamlDataSourceConfiguration\n"
            + "  dataSourceClassName: org.apache.commons.dbcp2.BasicDataSource\n"
            + "  properties:\n"
            + "    url: jdbc:h2:mem:ds_1;DB_CLOSE_DELAY=-1;DATABASE_TO_UPPER=false;MODE=MYSQL\n"
            + "    maxTotal: 16\n"
            + "    password: ''\n"
            + "    username: sa\n");
        testRegistryCenter.persist("/demo_spring_boot_ds_registry/config/schema/logic_db/rule", "bindingTables:\n"
            + "- t_order\n"
            + "- t_order_item\n"
            + "broadcastTables:\n"
            + "- t_config\n"
            + "defaultDataSourceName: ds\n"
            + "defaultDatabaseStrategy:\n"
            + "  inline:\n"
            + "    algorithmExpression: ds_${user_id % 2}\n"
            + "    shardingColumn: user_id\n"
            + "tables:\n"
            + "  t_order:\n"
            + "    actualDataNodes: ds_${0..1}.t_order_${0..1}\n"
            + "    keyGenerator:\n"
            + "      column: order_id\n"
            + "      props:\n"
            + "        worker.id: '123'\n"
            + "      type: SNOWFLAKE\n"
            + "    logicTable: t_order\n"
            + "    tableStrategy:\n"
            + "      inline:\n"
            + "        algorithmExpression: t_order_${order_id % 2}\n"
            + "        shardingColumn: order_id\n"
            + "  t_order_item:\n"
            + "    actualDataNodes: ds_${0..1}.t_order_item_${0..1}\n"
            + "    keyGenerator:\n"
            + "      column: order_item_id\n"
            + "      props:\n"
            + "        worker.id: '123'\n"
            + "      type: SNOWFLAKE\n"
            + "    logicTable: t_order_item\n"
            + "    tableStrategy:\n"
            + "      inline:\n"
            + "        algorithmExpression: t_order_item_${order_id % 2}\n"
            + "        shardingColumn: order_id\n");
        testRegistryCenter.persist("/demo_spring_boot_ds_registry/config/props", "executor.size: '100'\nsql.show: 'true'\n");
        testRegistryCenter.persist("/demo_spring_boot_ds_registry/state/datasources", "");
    }
    
    @Test
    public void assertWithShardingDataSource() {
        assertTrue(dataSource instanceof OrchestrationShardingDataSource);
        ShardingDataSource shardingDataSource = getFieldValue("dataSource", OrchestrationShardingDataSource.class, dataSource);
        ShardingRuntimeContext runtimeContext = getFieldValue("runtimeContext", ShardingDataSource.class, shardingDataSource);
        for (DataSource each : shardingDataSource.getDataSourceMap().values()) {
            assertThat(((BasicDataSource) each).getMaxTotal(), is(16));
        }
        assertTrue(runtimeContext.getProps().<Boolean>getValue(ShardingPropertiesConstant.SQL_SHOW));
        ShardingProperties shardingProperties = runtimeContext.getProps();
        assertTrue((Boolean) shardingProperties.getValue(ShardingPropertiesConstant.SQL_SHOW));
        assertThat((Integer) shardingProperties.getValue(ShardingPropertiesConstant.EXECUTOR_SIZE), is(100));
    }
    
    @Test
    public void assertWithShardingDataSourceNames() {
        ShardingDataSource shardingDataSource = getFieldValue("dataSource", OrchestrationShardingDataSource.class, dataSource);
        ShardingRuntimeContext runtimeContext = getFieldValue("runtimeContext", ShardingDataSource.class, shardingDataSource);
        ShardingRule shardingRule = runtimeContext.getRule();
        assertThat(shardingRule.getShardingDataSourceNames().getDataSourceNames().size(), is(3));
        assertTrue(shardingRule.getShardingDataSourceNames().getDataSourceNames().contains("ds"));
        assertTrue(shardingRule.getShardingDataSourceNames().getDataSourceNames().contains("ds_0"));
        assertTrue(shardingRule.getShardingDataSourceNames().getDataSourceNames().contains("ds_1"));
    }
    
    @Test
    public void assertWithTableRules() {
        ShardingDataSource shardingDataSource = getFieldValue("dataSource", OrchestrationShardingDataSource.class, dataSource);
        ShardingRuntimeContext runtimeContext = getFieldValue("runtimeContext", ShardingDataSource.class, shardingDataSource);
        ShardingRule shardingRule = runtimeContext.getRule();
        assertThat(shardingRule.getTableRules().size(), is(2));
        TableRule orderRule = shardingRule.getTableRule("t_order");
        assertThat(orderRule.getLogicTable(), is("t_order"));
        assertThat(orderRule.getActualDataNodes().size(), is(4));
        assertTrue(orderRule.getActualDataNodes().contains(new DataNode("ds_0", "t_order_0")));
        assertTrue(orderRule.getActualDataNodes().contains(new DataNode("ds_0", "t_order_1")));
        assertTrue(orderRule.getActualDataNodes().contains(new DataNode("ds_1", "t_order_0")));
        assertTrue(orderRule.getActualDataNodes().contains(new DataNode("ds_1", "t_order_1")));
        assertThat(orderRule.getGenerateKeyColumn(), is("order_id"));
        TableRule itemRule = shardingRule.getTableRule("t_order_item");
        assertThat(itemRule.getLogicTable(), is("t_order_item"));
        assertThat(itemRule.getActualDataNodes().size(), is(4));
        assertTrue(itemRule.getActualDataNodes().contains(new DataNode("ds_0", "t_order_item_0")));
        assertTrue(itemRule.getActualDataNodes().contains(new DataNode("ds_0", "t_order_item_1")));
        assertTrue(itemRule.getActualDataNodes().contains(new DataNode("ds_1", "t_order_item_0")));
        assertTrue(itemRule.getActualDataNodes().contains(new DataNode("ds_1", "t_order_item_1")));
        assertThat(itemRule.getTableShardingStrategy(), instanceOf(InlineShardingStrategy.class));
        assertThat(itemRule.getTableShardingStrategy().getShardingColumns().iterator().next(), is("order_id"));
        assertThat(itemRule.getGenerateKeyColumn(), is("order_item_id"));
        assertThat(itemRule.getTableShardingStrategy(), instanceOf(InlineShardingStrategy.class));
        assertThat(itemRule.getTableShardingStrategy().getShardingColumns().iterator().next(), is("order_id"));
        
    }
    
    @Test
    public void assertWithBindingTableRules() {
        ShardingDataSource shardingDataSource = getFieldValue("dataSource", OrchestrationShardingDataSource.class, dataSource);
        ShardingRuntimeContext runtimeContext = getFieldValue("runtimeContext", ShardingDataSource.class, shardingDataSource);
        ShardingRule shardingRule = runtimeContext.getRule();
        assertThat(shardingRule.getBindingTableRules().size(), is(2));
        TableRule orderRule = shardingRule.getTableRule("t_order");
        assertThat(orderRule.getLogicTable(), is("t_order"));
        assertThat(orderRule.getActualDataNodes().size(), is(4));
        assertTrue(orderRule.getActualDataNodes().contains(new DataNode("ds_0", "t_order_0")));
        assertTrue(orderRule.getActualDataNodes().contains(new DataNode("ds_0", "t_order_1")));
        assertTrue(orderRule.getActualDataNodes().contains(new DataNode("ds_1", "t_order_0")));
        assertTrue(orderRule.getActualDataNodes().contains(new DataNode("ds_1", "t_order_1")));
        TableRule itemRule = shardingRule.getTableRule("t_order_item");
        assertThat(itemRule.getLogicTable(), is("t_order_item"));
        assertThat(itemRule.getActualDataNodes().size(), is(4));
        assertTrue(itemRule.getActualDataNodes().contains(new DataNode("ds_0", "t_order_item_0")));
        assertTrue(itemRule.getActualDataNodes().contains(new DataNode("ds_0", "t_order_item_1")));
        assertTrue(itemRule.getActualDataNodes().contains(new DataNode("ds_1", "t_order_item_0")));
        assertTrue(itemRule.getActualDataNodes().contains(new DataNode("ds_1", "t_order_item_1")));
        assertThat(itemRule.getTableShardingStrategy(), instanceOf(InlineShardingStrategy.class));
        assertThat(itemRule.getTableShardingStrategy().getShardingColumns().iterator().next(), is("order_id"));
        assertThat(itemRule.getGenerateKeyColumn(), is("order_item_id"));
        assertThat(itemRule.getTableShardingStrategy(), instanceOf(InlineShardingStrategy.class));
        assertThat(itemRule.getTableShardingStrategy().getShardingColumns().iterator().next(), is("order_id"));
        assertThat(orderRule.getGenerateKeyColumn(), is("order_id"));
        
    }
    
    @Test
    public void assertWithBroadcastTables() {
        ShardingDataSource shardingDataSource = getFieldValue("dataSource", OrchestrationShardingDataSource.class, dataSource);
        ShardingRuntimeContext runtimeContext = getFieldValue("runtimeContext", ShardingDataSource.class, shardingDataSource);
        ShardingRule shardingRule = runtimeContext.getRule();
        assertThat(shardingRule.getBroadcastTables().size(), is(1));
        assertThat(shardingRule.getBroadcastTables().iterator().next(), is("t_config"));
    }
    
    @SuppressWarnings("unchecked")
    @SneakyThrows
    private <T> T getFieldValue(final String fieldName, final Class<?> fieldClass, final Object target) {
        Field field = fieldClass.getDeclaredField(fieldName);
        field.setAccessible(true);
        return (T) field.get(target);
    }
}
