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

package org.apache.shardingsphere.shardingproxy.config;

import org.apache.shardingsphere.core.yaml.config.encrypt.YamlEncryptRuleConfiguration;
import org.apache.shardingsphere.core.yaml.config.encrypt.YamlEncryptorRuleConfiguration;
import org.apache.shardingsphere.core.yaml.config.masterslave.YamlMasterSlaveRuleConfiguration;
import org.apache.shardingsphere.core.yaml.config.sharding.YamlShardingRuleConfiguration;
import org.apache.shardingsphere.orchestration.yaml.config.YamlOrchestrationConfiguration;
import org.apache.shardingsphere.shardingproxy.config.yaml.YamlDataSourceParameter;
import org.apache.shardingsphere.shardingproxy.config.yaml.YamlProxyRuleConfiguration;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public final class ShardingConfigurationLoaderTest {
    
    @Test
    public void assertLoad() throws IOException {
        ShardingConfiguration actual = new ShardingConfigurationLoader().load();
        assertOrchestrationConfiguration(actual.getServerConfiguration().getOrchestration());
        assertThat(actual.getRuleConfigurationMap().size(), is(3));
        assertShardingRuleConfiguration(actual.getRuleConfigurationMap().get("sharding_db"));
        assertMasterSlaveRuleConfiguration(actual.getRuleConfigurationMap().get("master_slave_db"));
        assertEncryptRuleConfiguration(actual.getRuleConfigurationMap().get("encrypt_db"));
    }
    
    private void assertOrchestrationConfiguration(final YamlOrchestrationConfiguration actual) {
        assertThat(actual.getName(), is("orchestration_ds"));
        assertTrue(actual.isOverwrite());
        assertThat(actual.getRegistry().getNamespace(), is("orchestration"));
        assertThat(actual.getRegistry().getServerLists(), is("localhost:2181"));
    }
    
    private void assertShardingRuleConfiguration(final YamlProxyRuleConfiguration actual) {
        assertThat(actual.getSchemaName(), is("sharding_db"));
        assertThat(actual.getDataSources().size(), is(2));
        assertNull(actual.getDataSource());
        assertDataSourceParameter(actual.getDataSources().get("ds_0"), "jdbc:mysql://127.0.0.1:3306/ds_0");
        assertDataSourceParameter(actual.getDataSources().get("ds_1"), "jdbc:mysql://127.0.0.1:3306/ds_1");
        assertShardingRuleConfiguration(actual.getShardingRule());
        assertNull(actual.getMasterSlaveRule());
        assertNull(actual.getEncryptRule());
    }
    
    private void assertShardingRuleConfiguration(final YamlShardingRuleConfiguration actual) {
        assertThat(actual.getTables().size(), is(1));
        assertThat(actual.getTables().get("t_order").getActualDataNodes(), is("ds_${0..1}.t_order_${0..1}"));
        assertThat(actual.getTables().get("t_order").getDatabaseStrategy().getInline().getShardingColumn(), is("user_id"));
        assertThat(actual.getTables().get("t_order").getDatabaseStrategy().getInline().getAlgorithmExpression(), is("ds_${user_id % 2}"));
        assertThat(actual.getTables().get("t_order").getTableStrategy().getInline().getShardingColumn(), is("order_id"));
        assertThat(actual.getTables().get("t_order").getTableStrategy().getInline().getAlgorithmExpression(), is("t_order_${order_id % 2}"));
    }
    
    private void assertMasterSlaveRuleConfiguration(final YamlProxyRuleConfiguration actual) {
        assertThat(actual.getSchemaName(), is("master_slave_db"));
        assertThat(actual.getDataSources().size(), is(3));
        assertNull(actual.getDataSource());
        assertDataSourceParameter(actual.getDataSources().get("master_ds"), "jdbc:mysql://127.0.0.1:3306/master_ds");
        assertDataSourceParameter(actual.getDataSources().get("slave_ds_0"), "jdbc:mysql://127.0.0.1:3306/slave_ds_0");
        assertDataSourceParameter(actual.getDataSources().get("slave_ds_1"), "jdbc:mysql://127.0.0.1:3306/slave_ds_1");
        assertNull(actual.getShardingRule());
        assertNull(actual.getEncryptRule());
        assertMasterSlaveRuleConfiguration(actual.getMasterSlaveRule());
    }
    
    private void assertMasterSlaveRuleConfiguration(final YamlMasterSlaveRuleConfiguration actual) {
        assertThat(actual.getName(), is("ms_ds"));
        assertThat(actual.getMasterDataSourceName(), is("master_ds"));
        assertThat(actual.getSlaveDataSourceNames().size(), is(2));
        Iterator<String> slaveDataSourceNames = actual.getSlaveDataSourceNames().iterator();
        assertThat(slaveDataSourceNames.next(), is("slave_ds_0"));
        assertThat(slaveDataSourceNames.next(), is("slave_ds_1"));
    }
    
    private void assertEncryptRuleConfiguration(final YamlProxyRuleConfiguration actual) {
        assertThat(actual.getSchemaName(), is("encrypt_db"));
        assertThat(actual.getDataSources().size(), is(1));
        assertNotNull(actual.getDataSource());
        assertDataSourceParameter(actual.getDataSources().get("dataSource"), "jdbc:mysql://127.0.0.1:3306/encrypt_ds");
        assertNull(actual.getShardingRule());
        assertNull(actual.getMasterSlaveRule());
        assertEncryptRuleConfiguration(actual.getEncryptRule());
    }
    
    private void assertEncryptRuleConfiguration(final YamlEncryptRuleConfiguration actual) {
        assertThat(actual.getEncryptors().size(), is(2));
        assertTrue(actual.getEncryptors().containsKey("encryptor_aes"));
        assertTrue(actual.getEncryptors().containsKey("encryptor_md5"));
        YamlEncryptorRuleConfiguration aesEncryptorRule = actual.getEncryptors().get("encryptor_aes");
        assertThat(aesEncryptorRule.getType(), is("aes"));
        assertThat(aesEncryptorRule.getProps().getProperty("aes.key.value"), is("123456abc"));
        YamlEncryptorRuleConfiguration md5EncryptorRule = actual.getEncryptors().get("encryptor_md5");
        assertThat(md5EncryptorRule.getType(), is("md5"));
    }
    
    private void assertDataSourceParameter(final YamlDataSourceParameter actual, final String expectedURL) {
        assertThat(actual.getUrl(), is(expectedURL));
        assertThat(actual.getUsername(), is("root"));
        assertNull(actual.getPassword());
        assertThat(actual.getConnectionTimeoutMilliseconds(), is(30000L));
        assertThat(actual.getIdleTimeoutMilliseconds(), is(60000L));
        assertThat(actual.getMaxLifetimeMilliseconds(), is(1800000L));
        assertThat(actual.getMaxPoolSize(), is(50));
    }
}
