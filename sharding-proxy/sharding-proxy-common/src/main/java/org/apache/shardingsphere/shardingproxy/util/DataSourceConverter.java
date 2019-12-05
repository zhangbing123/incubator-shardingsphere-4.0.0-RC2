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

package org.apache.shardingsphere.shardingproxy.util;

import com.zaxxer.hikari.HikariDataSource;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.core.config.DataSourceConfiguration;
import org.apache.shardingsphere.shardingproxy.config.yaml.YamlDataSourceParameter;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Data source parameter converter.
 *
 * @author panjuan
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DataSourceConverter {
    
    /**
     * Get data source map.
     *
     * @param dataSourceConfigurationMap data source configuration map
     * @return data source parameter map
     */
    public static Map<String, YamlDataSourceParameter> getDataSourceParameterMap(final Map<String, DataSourceConfiguration> dataSourceConfigurationMap) {
        Map<String, YamlDataSourceParameter> result = new LinkedHashMap<>(dataSourceConfigurationMap.size(), 1);
        for (Entry<String, DataSourceConfiguration> entry : dataSourceConfigurationMap.entrySet()) {
            result.put(entry.getKey(), createDataSourceParameter(entry.getValue()));
        }
        return result;
    }
    
    private static YamlDataSourceParameter createDataSourceParameter(final DataSourceConfiguration dataSourceConfiguration) {
        YamlDataSourceParameter result = new YamlDataSourceParameter();
        for (Field each : result.getClass().getDeclaredFields()) {
            try {
                each.setAccessible(true);
                if (dataSourceConfiguration.getProperties().containsKey(each.getName())) {
                    each.set(result, dataSourceConfiguration.getProperties().get(each.getName()));
                }
            } catch (final ReflectiveOperationException ignored) {
            }
        }
        return result;
    }
    
    /**
     * Get data source configuration map.
     *
     * @param dataSourceParameterMap data source map
     * @return data source configuration map
     */
    public static Map<String, DataSourceConfiguration> getDataSourceConfigurationMap(final Map<String, YamlDataSourceParameter> dataSourceParameterMap) {
        Map<String, DataSourceConfiguration> result = new LinkedHashMap<>(dataSourceParameterMap.size());
        for (Entry<String, YamlDataSourceParameter> entry : dataSourceParameterMap.entrySet()) {
            result.put(entry.getKey(), createDataSourceConfiguration(entry.getValue()));
        }
        return result;
    }
    
    private static DataSourceConfiguration createDataSourceConfiguration(final YamlDataSourceParameter dataSourceParameter) {
        DataSourceConfiguration result = new DataSourceConfiguration(HikariDataSource.class.getName());
        result.getProperties().put("url", dataSourceParameter.getUrl());
        result.getProperties().put("username", dataSourceParameter.getUsername());
        result.getProperties().put("password", dataSourceParameter.getPassword());
        result.getProperties().put("connectionTimeoutMilliseconds", dataSourceParameter.getConnectionTimeoutMilliseconds());
        result.getProperties().put("idleTimeoutMilliseconds", dataSourceParameter.getIdleTimeoutMilliseconds());
        result.getProperties().put("maxLifetimeMilliseconds", dataSourceParameter.getMaxLifetimeMilliseconds());
        result.getProperties().put("maxPoolSize", dataSourceParameter.getMaxPoolSize());
        result.getProperties().put("minPoolSize", dataSourceParameter.getMinPoolSize());
        result.getProperties().put("maintenanceIntervalMilliseconds", dataSourceParameter.getMaintenanceIntervalMilliseconds());
        result.getProperties().put("readOnly", dataSourceParameter.isReadOnly());
        return result;
    }
}
