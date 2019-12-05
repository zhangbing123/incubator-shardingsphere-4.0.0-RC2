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

package org.apache.shardingsphere.core.metadata.datasource.dialect;

import lombok.Getter;
import org.apache.shardingsphere.core.metadata.datasource.UnrecognizedDatabaseURLException;
import org.apache.shardingsphere.spi.database.MemorizedDataSourceMetaData;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Data source meta data for H2.
 *
 * @author panjuan
 */
@Getter
public final class H2DataSourceMetaData implements MemorizedDataSourceMetaData {
    
    private static final int DEFAULT_PORT = -1;
    
    private final String hostName;
    
    private final int port;
    
    private final String schemaName;
    
    private final Pattern pattern = Pattern.compile("jdbc:h2:(mem|~)[:/]([\\w\\-]+);?\\S*", Pattern.CASE_INSENSITIVE);
    
    public H2DataSourceMetaData(final String url) {
        Matcher matcher = pattern.matcher(url);
        if (!matcher.find()) {
            throw new UnrecognizedDatabaseURLException(url, pattern.pattern());
        }
        hostName = "";
        port = DEFAULT_PORT;
        schemaName = matcher.group(2);
    }
}
