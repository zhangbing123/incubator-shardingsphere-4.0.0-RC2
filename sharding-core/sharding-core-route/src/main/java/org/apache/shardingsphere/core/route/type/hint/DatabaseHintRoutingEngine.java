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

package org.apache.shardingsphere.core.route.type.hint;

import com.google.common.base.Preconditions;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.api.hint.HintManager;
import org.apache.shardingsphere.core.route.type.RoutingEngine;
import org.apache.shardingsphere.core.route.type.RoutingResult;
import org.apache.shardingsphere.core.route.type.RoutingUnit;
import org.apache.shardingsphere.core.strategy.route.hint.HintShardingStrategy;
import org.apache.shardingsphere.core.strategy.route.value.ListRouteValue;
import org.apache.shardingsphere.core.strategy.route.value.RouteValue;

import java.util.Collection;
import java.util.Collections;

/**
 * Database hint only routing engine.
 * 
 * @author gaohongtao
 * @author zhangliang
 * @author maxiaoguang
 */
@RequiredArgsConstructor
public final class DatabaseHintRoutingEngine implements RoutingEngine {
    
    private final Collection<String> dataSourceNames;
    
    private final HintShardingStrategy databaseShardingStrategy;
    
    @Override
    public RoutingResult route() {
        Collection<Comparable<?>> shardingValues = HintManager.getDatabaseShardingValues();
        Preconditions.checkState(!shardingValues.isEmpty());
        Collection<String> routingDataSources;
        routingDataSources = databaseShardingStrategy.doSharding(dataSourceNames, Collections.<RouteValue>singletonList(new ListRouteValue<>("", "", shardingValues)));
        Preconditions.checkState(!routingDataSources.isEmpty(), "no database route info");
        RoutingResult result = new RoutingResult();
        for (String each : routingDataSources) {
            result.getRoutingUnits().add(new RoutingUnit(each));
        }
        return result;
    }
}
