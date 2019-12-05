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

package org.apache.shardingsphere.orchestration.internal.registry.config.node;

import org.apache.shardingsphere.core.constant.ShardingConstant;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public final class ConfigurationNodeTest {
    
    private final ConfigurationNode configurationNode = new ConfigurationNode("test");
    
    @Test
    public void assertGetSchemaPath() {
        assertThat(configurationNode.getRulePath(ShardingConstant.LOGIC_SCHEMA_NAME), is("/test/config/schema/logic_db/rule"));
    }
    
    @Test
    public void assertGetDataSourcePath() {
        assertThat(configurationNode.getDataSourcePath(ShardingConstant.LOGIC_SCHEMA_NAME), is("/test/config/schema/logic_db/datasource"));
    }
    
    @Test
    public void assertGetRulePath() {
        assertThat(configurationNode.getRulePath(ShardingConstant.LOGIC_SCHEMA_NAME), is("/test/config/schema/logic_db/rule"));
    }
    
    @Test
    public void assertGetAuthenticationPath() {
        assertThat(configurationNode.getAuthenticationPath(), is("/test/config/authentication"));
    }
    
    @Test
    public void assertGetPropsPath() {
        assertThat(configurationNode.getPropsPath(), is("/test/config/props"));
    }
    
    @Test
    public void assertGetSchemaName() {
        assertThat(configurationNode.getSchemaName("/test/config/schema/logic_db/rule"), is(ShardingConstant.LOGIC_SCHEMA_NAME));
    }
}
