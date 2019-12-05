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

package org.apache.shardingsphere.shardingproxy.context;

import org.apache.shardingsphere.core.constant.properties.ShardingPropertiesConstant;
import org.apache.shardingsphere.core.rule.Authentication;
import org.apache.shardingsphere.core.rule.ProxyUser;
import org.apache.shardingsphere.orchestration.internal.eventbus.ShardingOrchestrationEventBus;
import org.apache.shardingsphere.orchestration.internal.registry.config.event.AuthenticationChangedEvent;
import org.apache.shardingsphere.orchestration.internal.registry.config.event.PropertiesChangedEvent;
import org.apache.shardingsphere.orchestration.internal.registry.state.event.CircuitStateChangedEvent;
import org.junit.Test;

import java.util.Collections;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public final class ShardingProxyContextTest {
    
    @Test
    public void assertInit() {
        ProxyUser proxyUser = new ProxyUser("root", Collections.singleton("db1"));
        Authentication authentication = new Authentication();
        authentication.getUsers().put("root", proxyUser);
        Properties props = new Properties();
        props.setProperty(ShardingPropertiesConstant.SQL_SHOW.getKey(), Boolean.TRUE.toString());
        props.setProperty(ShardingPropertiesConstant.PROXY_TRANSACTION_TYPE.getKey(), "BASE");
        ShardingProxyContext.getInstance().init(authentication, props);
        assertThat(ShardingProxyContext.getInstance().getAuthentication(), is(authentication));
        assertTrue(ShardingProxyContext.getInstance().getShardingProperties().<Boolean>getValue(ShardingPropertiesConstant.SQL_SHOW));
        assertThat(ShardingProxyContext.getInstance().getShardingProperties().<String>getValue(ShardingPropertiesConstant.PROXY_TRANSACTION_TYPE), is("BASE"));
    }
    
    @Test
    public void assertRenewShardingProperties() {
        ProxyUser proxyUser = new ProxyUser("root", Collections.singleton("db1"));
        Authentication authentication = new Authentication();
        authentication.getUsers().put("root", proxyUser);
        ShardingProxyContext.getInstance().init(authentication, new Properties());
        assertTrue(ShardingProxyContext.getInstance().getShardingProperties().getProps().isEmpty());
        Properties props = new Properties();
        props.setProperty(ShardingPropertiesConstant.SQL_SHOW.getKey(), Boolean.TRUE.toString());
        ShardingOrchestrationEventBus.getInstance().post(new PropertiesChangedEvent(props));
        assertFalse(ShardingProxyContext.getInstance().getShardingProperties().getProps().isEmpty());
    }
    
    @Test
    public void assertRenewAuthentication() {
        ProxyUser proxyUser = new ProxyUser("root", Collections.singleton("db1"));
        Authentication authentication = new Authentication();
        authentication.getUsers().put("root", proxyUser);
        ShardingProxyContext.getInstance().init(authentication, new Properties());
        ShardingOrchestrationEventBus.getInstance().post(new AuthenticationChangedEvent(authentication));
        assertThat(ShardingProxyContext.getInstance().getAuthentication().getUsers().keySet().iterator().next(), is("root"));
        assertThat(ShardingProxyContext.getInstance().getAuthentication().getUsers().get("root").getPassword(), is("root"));
        assertThat(ShardingProxyContext.getInstance().getAuthentication().getUsers().get("root").getAuthorizedSchemas().iterator().next(), is("db1"));
    }
    
    @Test
    public void assertRenewCircuitState() {
        assertFalse(ShardingProxyContext.getInstance().isCircuitBreak());
        ShardingOrchestrationEventBus.getInstance().post(new CircuitStateChangedEvent(true));
        assertTrue(ShardingProxyContext.getInstance().isCircuitBreak());
        ShardingOrchestrationEventBus.getInstance().post(new CircuitStateChangedEvent(false));
    }
}
