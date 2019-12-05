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

package org.apache.shardingsphere.core.yaml.swapper.impl;

import org.apache.shardingsphere.api.config.sharding.KeyGeneratorConfiguration;
import org.apache.shardingsphere.core.yaml.config.sharding.YamlKeyGeneratorConfiguration;
import org.apache.shardingsphere.core.yaml.swapper.YamlSwapper;

/**
 * Key generator configuration YAML swapper.
 *
 * @author zhangliang
 */
public final class KeyGeneratorConfigurationYamlSwapper implements YamlSwapper<YamlKeyGeneratorConfiguration, KeyGeneratorConfiguration> {
    
    @Override
    public YamlKeyGeneratorConfiguration swap(final KeyGeneratorConfiguration data) {
        YamlKeyGeneratorConfiguration result = new YamlKeyGeneratorConfiguration();
        result.setType(data.getType());
        result.setColumn(data.getColumn());
        result.setProps(data.getProperties());
        return result;
    }
    
    @Override
    public KeyGeneratorConfiguration swap(final YamlKeyGeneratorConfiguration yamlConfiguration) {
        return new KeyGeneratorConfiguration(yamlConfiguration.getType(), yamlConfiguration.getColumn(), yamlConfiguration.getProps());
    }
}
