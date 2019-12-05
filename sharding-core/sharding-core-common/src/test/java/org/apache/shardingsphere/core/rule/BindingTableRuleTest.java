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

package org.apache.shardingsphere.core.rule;

import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.TableRuleConfiguration;
import org.apache.shardingsphere.core.config.ShardingConfigurationException;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public final class BindingTableRuleTest {
    
    @Test
    public void assertHasLogicTable() {
        assertTrue(createBindingTableRule().hasLogicTable("Logic_Table"));
    }
    
    @Test
    public void assertNotHasLogicTable() {
        assertFalse(createBindingTableRule().hasLogicTable("New_Table"));
    }
    
    @Test
    public void assertGetBindingActualTablesSuccess() {
        assertThat(createBindingTableRule().getBindingActualTable("ds1", "Sub_Logic_Table", "table_1"), is("sub_table_1"));
    }
    
    @Test(expected = ShardingConfigurationException.class)
    public void assertGetBindingActualTablesFailureWhenNotFound() {
        createBindingTableRule().getBindingActualTable("no_ds", "Sub_Logic_Table", "table_1");
    }
    
    @Test(expected = ShardingConfigurationException.class)
    public void assertGetBindingActualTablesFailureWhenLogicTableNotFound() {
        createBindingTableRule().getBindingActualTable("ds0", "No_Logic_Table", "table_1");
    }
    
    @Test
    public void assertGetAllLogicTables() {
        assertThat(createBindingTableRule().getAllLogicTables(), is((Collection<String>) Arrays.asList("logic_table", "sub_logic_table")));
    }
    
    @Test
    public void assertGetTableRules() {
        assertThat(createBindingTableRule().getTableRules().size(), is(2));
        assertThat(createBindingTableRule().getTableRules().get(0).getLogicTable(), is(createTableRule().getLogicTable()));
        assertThat(createBindingTableRule().getTableRules().get(0).getActualDataNodes(), is(createTableRule().getActualDataNodes()));
        assertThat(createBindingTableRule().getTableRules().get(1).getLogicTable(), is(createSubTableRule().getLogicTable()));
        assertThat(createBindingTableRule().getTableRules().get(1).getActualDataNodes(), is(createSubTableRule().getActualDataNodes()));
    }
    
    private BindingTableRule createBindingTableRule() {
        return new BindingTableRule(Arrays.asList(createTableRule(), createSubTableRule()));
    }
    
    private TableRule createTableRule() {
        return new TableRule(new TableRuleConfiguration("LOGIC_TABLE", "ds${0..1}.table_${0..1}"), createShardingDataSourceNames(), null);
    }
    
    private TableRule createSubTableRule() {
        return new TableRule(new TableRuleConfiguration("SUB_LOGIC_TABLE", "ds${0..1}.sub_table_${0..1}"), createShardingDataSourceNames(), null);
    }
    
    private ShardingDataSourceNames createShardingDataSourceNames() {
        return new ShardingDataSourceNames(new ShardingRuleConfiguration(), Arrays.asList("ds0", "ds1"));
    }
}
