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

package org.apache.shardingsphere.core.route.router.masterslave;

/**
 * Master data source visited manager.
 * 
 * <p>Trace master data source visited or not in current thread.</p>
 * 
 * @author zhangliang
 */
public final class MasterVisitedManager {
    
    private static final ThreadLocal<Boolean> MASTER_VISITED = new ThreadLocal<Boolean>() {
        
        @Override
        protected Boolean initialValue() {
            return false;
        }
    };
    
    /**
     * Judge master data source visited in current thread.
     * 
     * @return master data source visited or not in current thread
     */
    public static boolean isMasterVisited() {
        return MASTER_VISITED.get();
    }
    
    /**
     * Set master data source visited in current thread.
     */
    public static void setMasterVisited() {
        MASTER_VISITED.set(true);
    }
    
    /**
     * Clear master data source visited.
     */
    public static void clear() {
        MASTER_VISITED.remove();
    }
}
