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

package org.apache.shardingsphere.core.strategy.route.hint;

import com.google.common.base.Preconditions;
import lombok.Getter;
import org.apache.shardingsphere.api.config.sharding.strategy.HintShardingStrategyConfiguration;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;
import org.apache.shardingsphere.core.strategy.route.ShardingStrategy;
import org.apache.shardingsphere.core.strategy.route.value.ListRouteValue;
import org.apache.shardingsphere.core.strategy.route.value.RouteValue;

import java.util.Collection;
import java.util.TreeSet;

/**
 * Hint sharding strategy.
 * 
 * @author zhangliang
 */
public final class HintShardingStrategy implements ShardingStrategy {
    
    @Getter
    private final Collection<String> shardingColumns;
    
    private final HintShardingAlgorithm shardingAlgorithm;
    
    public HintShardingStrategy(final HintShardingStrategyConfiguration hintShardingStrategyConfig) {
        Preconditions.checkNotNull(hintShardingStrategyConfig.getShardingAlgorithm(), "Sharding algorithm cannot be null.");
        shardingColumns = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        shardingAlgorithm = hintShardingStrategyConfig.getShardingAlgorithm();
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Collection<String> doSharding(final Collection<String> availableTargetNames, final Collection<RouteValue> shardingValues) {
        ListRouteValue shardingValue = (ListRouteValue) shardingValues.iterator().next();
        Collection<String> shardingResult = shardingAlgorithm.doSharding(availableTargetNames, 
                new HintShardingValue(shardingValue.getTableName(), shardingValue.getColumnName(), shardingValue.getValues()));
        Collection<String> result = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        result.addAll(shardingResult);
        return result;
    }
}
