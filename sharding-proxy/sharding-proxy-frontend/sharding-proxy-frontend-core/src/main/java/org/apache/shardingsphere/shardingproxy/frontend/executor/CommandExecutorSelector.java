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

package org.apache.shardingsphere.shardingproxy.frontend.executor;

import io.netty.channel.ChannelId;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.transaction.core.TransactionType;

import java.util.concurrent.ExecutorService;

/**
 * Command executor selector.
 * 
 * @author zhangliang
 * @author zhaojun
 */
@RequiredArgsConstructor
public final class CommandExecutorSelector {
    
    /**
     * Get executor service.
     *
     * @param isOccupyThreadForPerConnection is occupy thread for per connection or not
     * @param transactionType transaction type
     * @param channelId channel ID
     * @return executor service
     */
    public static ExecutorService getExecutor(final boolean isOccupyThreadForPerConnection, final TransactionType transactionType, final ChannelId channelId) {
        return (isOccupyThreadForPerConnection || TransactionType.XA == transactionType || TransactionType.BASE == transactionType)
            ? ChannelThreadExecutorGroup.getInstance().get(channelId) : UserExecutorGroup.getInstance().getExecutorService();
    }
}
