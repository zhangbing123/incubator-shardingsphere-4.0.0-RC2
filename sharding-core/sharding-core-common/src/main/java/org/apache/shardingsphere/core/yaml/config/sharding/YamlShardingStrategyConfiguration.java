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

package org.apache.shardingsphere.core.yaml.config.sharding;

import lombok.Getter;
import lombok.Setter;
import org.apache.shardingsphere.core.yaml.config.YamlConfiguration;
import org.apache.shardingsphere.core.yaml.config.sharding.strategy.YamlComplexShardingStrategyConfiguration;
import org.apache.shardingsphere.core.yaml.config.sharding.strategy.YamlHintShardingStrategyConfiguration;
import org.apache.shardingsphere.core.yaml.config.sharding.strategy.YamlInlineShardingStrategyConfiguration;
import org.apache.shardingsphere.core.yaml.config.sharding.strategy.YamlNoneShardingStrategyConfiguration;
import org.apache.shardingsphere.core.yaml.config.sharding.strategy.YamlStandardShardingStrategyConfiguration;

/**
 * Sharding strategy configuration for YAML.
 *
 * @author caohao
 * @author panjuan
 */
@Getter
@Setter
public class YamlShardingStrategyConfiguration implements YamlConfiguration {
    
    private YamlStandardShardingStrategyConfiguration standard;
    
    private YamlComplexShardingStrategyConfiguration complex;
    
    private YamlHintShardingStrategyConfiguration hint;
    
    private YamlInlineShardingStrategyConfiguration inline;
    
    private YamlNoneShardingStrategyConfiguration none;
}
