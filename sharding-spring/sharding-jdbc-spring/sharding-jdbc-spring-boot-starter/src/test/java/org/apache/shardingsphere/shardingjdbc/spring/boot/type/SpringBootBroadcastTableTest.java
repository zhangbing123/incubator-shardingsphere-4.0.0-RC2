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

import org.apache.shardingsphere.core.rule.ShardingRule;
import org.apache.shardingsphere.shardingjdbc.jdbc.core.datasource.ShardingDataSource;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Collection;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootBroadcastTableTest.class)
@SpringBootApplication
@ActiveProfiles("broadcast-table")
public class SpringBootBroadcastTableTest {
    
    @Resource
    private DataSource dataSource;
    
    @Test
    public void assertBroadcastTable() {
        assertThat(dataSource, instanceOf(ShardingDataSource.class));
        ShardingDataSource shardingDataSource = (ShardingDataSource) dataSource;
        ShardingRule shardingRule = shardingDataSource.getRuntimeContext().getRule();
        assertThat(shardingRule.getBroadcastTables(), CoreMatchers.<Collection<String>>is(Collections.singletonList("t_config")));
        assertThat(shardingRule.getShardingDataSourceNames().getDataSourceNames().size(), is(3));
        assertThat(shardingRule.getRuleConfiguration().getDefaultDataSourceName(), is("ds"));
    }
}
