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

import com.google.common.base.Strings;
import lombok.Getter;
import org.apache.shardingsphere.core.metadata.datasource.UnrecognizedDatabaseURLException;
import org.apache.shardingsphere.spi.database.DataSourceMetaData;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Data source meta data for Oracle.
 *
 * @author panjuan
 */
@Getter
public final class OracleDataSourceMetaData implements DataSourceMetaData {
    
    private static final int DEFAULT_PORT = 1521;
    
    private final String hostName;
    
    private final int port;
    
    private final String schemaName;
    
    private final Pattern pattern = Pattern.compile("jdbc:oracle:(thin|oci|kprb):@(//)?([\\w\\-\\.]+):?([0-9]*)[:/]([\\w\\-]+)", Pattern.CASE_INSENSITIVE);
    
    public OracleDataSourceMetaData(final String url) {
        Matcher matcher = pattern.matcher(url);
        if (!matcher.find()) {
            throw new UnrecognizedDatabaseURLException(url, pattern.pattern());
        }
        hostName = matcher.group(3);
        port = Strings.isNullOrEmpty(matcher.group(4)) ? DEFAULT_PORT : Integer.valueOf(matcher.group(4));
        schemaName = matcher.group(5);
    }
}
