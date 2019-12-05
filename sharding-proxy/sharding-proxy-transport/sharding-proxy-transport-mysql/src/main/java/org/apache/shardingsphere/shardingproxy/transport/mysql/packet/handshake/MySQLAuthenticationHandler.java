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

package org.apache.shardingsphere.shardingproxy.transport.mysql.packet.handshake;

import com.google.common.base.Optional;
import com.google.common.base.Strings;
import lombok.Getter;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shardingsphere.core.rule.ProxyUser;
import org.apache.shardingsphere.shardingproxy.context.ShardingProxyContext;

import java.util.Arrays;
import java.util.Map.Entry;

/**
 * Authentication handler for MySQL.
 *
 * @author panjuan
 */
@Getter
public final class MySQLAuthenticationHandler {
    
    private static final ShardingProxyContext SHARDING_PROXY_CONTEXT = ShardingProxyContext.getInstance();
    
    private final MySQLAuthPluginData authPluginData = new MySQLAuthPluginData();
    
    /**
     * Login.
     *
     * @param username connection username
     * @param authResponse connection auth response
     * @return login success or failure
     */
    public boolean login(final String username, final byte[] authResponse) {
        Optional<ProxyUser> user = getUser(username);
        return user.isPresent() && (Strings.isNullOrEmpty(user.get().getPassword()) || Arrays.equals(getAuthCipherBytes(user.get().getPassword()), authResponse));
    }
    
    private Optional<ProxyUser> getUser(final String username) {
        for (Entry<String, ProxyUser> entry : SHARDING_PROXY_CONTEXT.getAuthentication().getUsers().entrySet()) {
            if (entry.getKey().equals(username)) {
                return Optional.of(entry.getValue());
            }
        }
        return Optional.absent();
    }
    
    private byte[] getAuthCipherBytes(final String password) {
        byte[] sha1Password = DigestUtils.sha1(password);
        byte[] doubleSha1Password = DigestUtils.sha1(sha1Password);
        byte[] concatBytes = new byte[authPluginData.getAuthPluginData().length + doubleSha1Password.length];
        System.arraycopy(authPluginData.getAuthPluginData(), 0, concatBytes, 0, authPluginData.getAuthPluginData().length);
        System.arraycopy(doubleSha1Password, 0, concatBytes, authPluginData.getAuthPluginData().length, doubleSha1Password.length);
        byte[] sha1ConcatBytes = DigestUtils.sha1(concatBytes);
        return xor(sha1Password, sha1ConcatBytes);
    }
    
    private byte[] xor(final byte[] input, final byte[] secret) {
        final byte[] result = new byte[input.length];
        for (int i = 0; i < input.length; ++i) {
            result[i] = (byte) (input[i] ^ secret[i]);
        }
        return result;
    }
}
