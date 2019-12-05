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

package org.apache.shardingsphere.core.execute.hook;

import org.apache.shardingsphere.core.spi.NewInstanceServiceLoader;

import java.util.Collection;

/**
 * Root invoke hook for SPI.
 *
 * @author zhangliang
 */
public final class SPIRootInvokeHook implements RootInvokeHook {
    
    private final Collection<RootInvokeHook> rootInvokeHooks = NewInstanceServiceLoader.newServiceInstances(RootInvokeHook.class);
    
    static {
        NewInstanceServiceLoader.register(RootInvokeHook.class);
    }
    
    @Override
    public void start() {
        for (RootInvokeHook each : rootInvokeHooks) {
            each.start();
        }
    }
    
    @Override
    public void finish(final int connectionCount) {
        for (RootInvokeHook each : rootInvokeHooks) {
            each.finish(connectionCount);
        }
    }
}
