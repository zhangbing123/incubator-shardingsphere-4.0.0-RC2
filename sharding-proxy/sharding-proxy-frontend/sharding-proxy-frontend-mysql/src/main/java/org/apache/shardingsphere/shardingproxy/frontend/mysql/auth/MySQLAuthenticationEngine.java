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

package org.apache.shardingsphere.shardingproxy.frontend.mysql.auth;

import com.google.common.base.Strings;
import io.netty.channel.ChannelHandlerContext;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.schema.LogicSchemas;
import org.apache.shardingsphere.shardingproxy.frontend.ConnectionIdGenerator;
import org.apache.shardingsphere.shardingproxy.frontend.engine.AuthenticationEngine;
import org.apache.shardingsphere.shardingproxy.transport.mysql.constant.MySQLServerErrorCode;
import org.apache.shardingsphere.shardingproxy.transport.mysql.packet.generic.MySQLErrPacket;
import org.apache.shardingsphere.shardingproxy.transport.mysql.packet.generic.MySQLOKPacket;
import org.apache.shardingsphere.shardingproxy.transport.mysql.packet.handshake.MySQLAuthenticationHandler;
import org.apache.shardingsphere.shardingproxy.transport.mysql.packet.handshake.MySQLHandshakePacket;
import org.apache.shardingsphere.shardingproxy.transport.mysql.packet.handshake.MySQLHandshakeResponse41Packet;
import org.apache.shardingsphere.shardingproxy.transport.mysql.payload.MySQLPacketPayload;
import org.apache.shardingsphere.shardingproxy.transport.payload.PacketPayload;

/**
 * Authentication engine for MySQL.
 *
 * @author zhangliang
 */
public final class MySQLAuthenticationEngine implements AuthenticationEngine {
    
    private final MySQLAuthenticationHandler authenticationHandler = new MySQLAuthenticationHandler();
    
    @Override
    public void handshake(final ChannelHandlerContext context, final BackendConnection backendConnection) {
        int connectionId = ConnectionIdGenerator.getInstance().nextId();
        backendConnection.setConnectionId(connectionId);
        context.writeAndFlush(new MySQLHandshakePacket(connectionId, authenticationHandler.getAuthPluginData()));
    }
    
    @Override
    public boolean auth(final ChannelHandlerContext context, final PacketPayload payload, final BackendConnection backendConnection) {
        MySQLHandshakeResponse41Packet response41 = new MySQLHandshakeResponse41Packet((MySQLPacketPayload) payload);
        if (authenticationHandler.login(response41.getUsername(), response41.getAuthResponse())) {
            if (!Strings.isNullOrEmpty(response41.getDatabase()) && !LogicSchemas.getInstance().schemaExists(response41.getDatabase())) {
                context.writeAndFlush(new MySQLErrPacket(response41.getSequenceId() + 1, MySQLServerErrorCode.ER_BAD_DB_ERROR, response41.getDatabase()));
                return true;
            }
            backendConnection.setCurrentSchema(response41.getDatabase());
            backendConnection.setUserName(response41.getUsername());
            context.writeAndFlush(new MySQLOKPacket(response41.getSequenceId() + 1));
        } else {
            // TODO localhost should replace to real ip address
            context.writeAndFlush(new MySQLErrPacket(response41.getSequenceId() + 1,
                    MySQLServerErrorCode.ER_ACCESS_DENIED_ERROR, response41.getUsername(), "localhost", 0 == response41.getAuthResponse().length ? "NO" : "YES"));
        }
        return true;
    }
}
