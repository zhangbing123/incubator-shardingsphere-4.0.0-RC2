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

package org.apache.shardingsphere.transaction.base.seata.at;

import org.apache.shardingsphere.core.execute.hook.SQLExecutionHook;
import org.apache.shardingsphere.core.route.RouteUnit;
import org.apache.shardingsphere.spi.database.DataSourceMetaData;

import java.util.Map;

/**
 * Seata transactional SQL execution hook.
 *
 * @author zhaojun
 */
public final class TransactionalSQLExecutionHook implements SQLExecutionHook {
    
    @Override
    public void start(final RouteUnit routeUnit, final DataSourceMetaData dataSourceMetaData, final boolean isTrunkThread, final Map<String, Object> shardingExecuteDataMap) {
        if (!isTrunkThread) {
            SeataTransactionBroadcaster.broadcastIfNecessary(shardingExecuteDataMap);
        }
    }
    
    @Override
    public void finishSuccess() {
    }
    
    @Override
    public void finishFailure(final Exception cause) {
    }
}
