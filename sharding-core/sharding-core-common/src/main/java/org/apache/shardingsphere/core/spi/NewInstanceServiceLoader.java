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

package org.apache.shardingsphere.core.spi;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.ServiceLoader;

/**
 * SPI service loader for new instance for every call.
 *
 * @author zhangliang
 * @author zhaojun
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class NewInstanceServiceLoader {
    
    private static final Map<Class, Collection<Class<?>>> SERVICE_MAP = new HashMap<>();
    
    /**
     * 通过spi注册拓展功能实例到Map当中,如分布式主键生成策略
     * Register SPI service into map for new instance.
     *
     * @param service service type
     * @param <T> type of service
     */
    public static <T> void register(final Class<T> service) {
        /*
         * 注意Class.getName 必须同 "META-INF/services/org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator"
         * 否则加载不到spi
         */
        for (T each : ServiceLoader.load(service)) {
            registerServiceClass(service, each);
        }
    }
    
    @SuppressWarnings("unchecked")
    private static <T> void registerServiceClass(final Class<T> service, final T instance) {
        Collection<Class<?>> serviceClasses = SERVICE_MAP.get(service);
        if (null == serviceClasses) {
            serviceClasses = new LinkedHashSet<>();
        }
        serviceClasses.add(instance.getClass());
        SERVICE_MAP.put(service, serviceClasses);
    }
    
    /**
     * New service instances.
     *  spi class 实例获取
     * @param service service class
     * @param <T> type of service
     * @return service instances
     */
    @SneakyThrows
    @SuppressWarnings("unchecked")
    public static <T> Collection<T> newServiceInstances(final Class<T> service) {
        Collection<T> result = new LinkedList<>();
        if (null == SERVICE_MAP.get(service)) {
            return result;
        }
        for (Class<?> each : SERVICE_MAP.get(service)) {
            result.add((T) each.newInstance());
        }
        return result;
    }
}
