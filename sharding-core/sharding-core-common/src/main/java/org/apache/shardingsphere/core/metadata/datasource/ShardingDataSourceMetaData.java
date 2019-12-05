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

package org.apache.shardingsphere.core.metadata.datasource;

import com.google.common.base.Optional;
import org.apache.shardingsphere.core.rule.MasterSlaveRule;
import org.apache.shardingsphere.core.rule.ShardingRule;
import org.apache.shardingsphere.spi.database.DataSourceMetaData;
import org.apache.shardingsphere.spi.database.DatabaseType;
import org.apache.shardingsphere.spi.database.MemorizedDataSourceMetaData;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Sharding data source meta data.
 *
 * @author panjuan
 */
public final class ShardingDataSourceMetaData {
    
    private final Map<String, DataSourceMetaData> dataSourceMetaDataMap;
    
    public ShardingDataSourceMetaData(final Map<String, String> dataSourceURLs, final ShardingRule shardingRule, final DatabaseType databaseType) {
        dataSourceMetaDataMap = getDataSourceMetaDataMap(dataSourceURLs, shardingRule, databaseType);
    }
    
    private Map<String, DataSourceMetaData> getDataSourceMetaDataMap(final Map<String, String> dataSourceURLs, final ShardingRule shardingRule, final DatabaseType databaseType) {
        Map<String, DataSourceMetaData> dataSourceMetaData = getDataSourceMetaDataMapForSharding(dataSourceURLs, databaseType);
        return shardingRule.getMasterSlaveRules().isEmpty() ? dataSourceMetaData : getDataSourceMetaDataMapForMasterSlave(shardingRule, dataSourceMetaData);
    }
    
    private Map<String, DataSourceMetaData> getDataSourceMetaDataMapForSharding(final Map<String, String> dataSourceURLs, final DatabaseType databaseType) {
        Map<String, DataSourceMetaData> result = new ConcurrentHashMap<>(dataSourceURLs.size(), 1);
        for (Entry<String, String> entry : dataSourceURLs.entrySet()) {
            result.put(entry.getKey(), databaseType.getDataSourceMetaData(entry.getValue()));
        }
        return result;
    }
    
    private Map<String, DataSourceMetaData> getDataSourceMetaDataMapForMasterSlave(final ShardingRule shardingRule, final Map<String, DataSourceMetaData> dataSourceMetaDataMap) {
        Map<String, DataSourceMetaData> result = new ConcurrentHashMap<>(dataSourceMetaDataMap);
        for (Entry<String, DataSourceMetaData> entry : dataSourceMetaDataMap.entrySet()) {
            Optional<MasterSlaveRule> masterSlaveRule = shardingRule.findMasterSlaveRule(entry.getKey());
            if (masterSlaveRule.isPresent() && masterSlaveRule.get().getMasterDataSourceName().equals(entry.getKey())) {
                reviseMasterSlaveMetaData(result, entry.getValue(), masterSlaveRule.get());
            }
        }
        return result;
    }
    
    private void reviseMasterSlaveMetaData(final Map<String, DataSourceMetaData> dataSourceMetaDataMap, final DataSourceMetaData masterSlaveDataSourceMetaData, final MasterSlaveRule masterSlaveRule) {
        dataSourceMetaDataMap.put(masterSlaveRule.getName(), masterSlaveDataSourceMetaData);
        dataSourceMetaDataMap.remove(masterSlaveRule.getMasterDataSourceName());
        for (String each : masterSlaveRule.getSlaveDataSourceNames()) {
            dataSourceMetaDataMap.remove(each);
        }
    }
    
    /**
     * Get all instance data source names.
     *
     * @return instance data source names
     */
    public Collection<String> getAllInstanceDataSourceNames() {
        Collection<String> result = new LinkedList<>();
        for (Entry<String, DataSourceMetaData> entry : dataSourceMetaDataMap.entrySet()) {
            if (!isExisted(entry.getKey(), result)) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
    
    private boolean isExisted(final String dataSourceName, final Collection<String> existedDataSourceNames) {
        DataSourceMetaData sample = dataSourceMetaDataMap.get(dataSourceName);
        for (String each : existedDataSourceNames) {
            if (isInSameDatabaseInstance(sample, dataSourceMetaDataMap.get(each))) {
                return true;
            }
        }
        return false;
    }
    
    private boolean isInSameDatabaseInstance(final DataSourceMetaData sample, final DataSourceMetaData target) {
        return sample instanceof MemorizedDataSourceMetaData
                ? target.getSchemaName().equals(sample.getSchemaName()) : target.getHostName().equals(sample.getHostName()) && target.getPort() == sample.getPort();
    }
    
    /**
     * Get data source meta data.
     * 
     * @param actualDataSourceName actual data source name
     * @return actual data source meta data
     */
    public DataSourceMetaData getActualDataSourceMetaData(final String actualDataSourceName) {
        return dataSourceMetaDataMap.get(actualDataSourceName);
    }
}
