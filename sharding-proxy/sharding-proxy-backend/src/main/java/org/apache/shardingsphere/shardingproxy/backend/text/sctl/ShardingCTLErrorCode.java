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

package org.apache.shardingsphere.shardingproxy.backend.text.sctl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.exception.InvalidShardingCTLFormatException;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.exception.ShardingCTLException;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.exception.UnsupportedShardingCTLTypeException;
import org.apache.shardingsphere.shardingproxy.error.SQLErrorCode;

/**
 * Sharding CTL error code.
 *
 * @author zhangliang
 */
@RequiredArgsConstructor
@Getter
public enum ShardingCTLErrorCode implements SQLErrorCode {
    
    INVALID_FORMAT(11000, "S11000", "Invalid format for sharding ctl [%s], should be [sctl:set key=value]."),
    
    UNSUPPORTED_TYPE(11001, "S11001", "Could not support sctl type [%s].");
    
    private final int errorCode;
    
    private final String sqlState;
    
    private final String errorMessage;
    
    /**
     * Value of sharding CTL error code.
     * 
     * @param exception exception
     * @return sharding CTL error code
     */
    public static ShardingCTLErrorCode valueOf(final ShardingCTLException exception) {
        if (exception instanceof InvalidShardingCTLFormatException) {
            return ShardingCTLErrorCode.INVALID_FORMAT;
        }
        if (exception instanceof UnsupportedShardingCTLTypeException) {
            return ShardingCTLErrorCode.UNSUPPORTED_TYPE;
        }
        throw new UnsupportedOperationException("Cannot find sharding CTL error code from exception: %s", exception);
    }
}
