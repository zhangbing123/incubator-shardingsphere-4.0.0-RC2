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

package org.apache.shardingsphere.core.rewrite.builder;

import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.core.rewrite.token.pojo.Alterable;
import org.apache.shardingsphere.core.rewrite.token.pojo.SQLToken;
import org.apache.shardingsphere.core.rewrite.token.pojo.Substitutable;
import org.apache.shardingsphere.core.route.type.RoutingUnit;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * SQL builder.
 *
 * @author gaohongtao
 * @author zhangliang
 * @author maxiaoguang
 * @author panjuan
 */
@RequiredArgsConstructor
public final class SQLBuilder {
    
    private final String logicSQL;
    
    private final List<SQLToken> sqlTokens;
    
    /**
     * Convert to SQL.
     *
     * @return SQL
     */
    public String toSQL() {
        return toSQL(null, Collections.<String, String>emptyMap());
    }
    
    /**
     * Convert to SQL.
     *
     * @param routingUnit routing unit
     * @param logicAndActualTables logic and actual map
     * @return SQL
     */
    public String toSQL(final RoutingUnit routingUnit, final Map<String, String> logicAndActualTables) {
        if (sqlTokens.isEmpty()) {
            return logicSQL;
        }
        return createLogicSQL(routingUnit, logicAndActualTables);
    }

    /**
     * 创建真实的SQL语句，以便后续发起DB查询
     * @param routingUnit
     * @param logicAndActualTables
     * @return
     */
    private String createLogicSQL(final RoutingUnit routingUnit, final Map<String, String> logicAndActualTables) {
        StringBuilder result = new StringBuilder();
        /*
         *  截取t_order前的语句部分
         *  例：SELECT i.* FROM t_order o JOIN t_order_item i ON o.order_id=i.order_id WHERE o.order_id in (403284788054044672, 403284787324235777)
         *  截取后：SELECT i.* FROM
         */
        result.append(logicSQL.substring(0, sqlTokens.get(0).getStartIndex()));
        for (SQLToken each : sqlTokens) {
            result.append(getSQLTokenLiterals(each, routingUnit, logicAndActualTables));
            result.append(getConjunctionLiterals(each));
        }
        return result.toString();
    }
    
    private String getSQLTokenLiterals(final SQLToken sqlToken, final RoutingUnit routingUnit, final Map<String, String> logicAndActualTables) {
        return sqlToken instanceof Alterable ? ((Alterable) sqlToken).toString(routingUnit, logicAndActualTables) : sqlToken.toString();
    }
    
    private String getConjunctionLiterals(final SQLToken sqlToken) {
        int currentSQLTokenIndex = sqlTokens.indexOf(sqlToken);
        int stopIndex = sqlTokens.size() - 1 == currentSQLTokenIndex ? logicSQL.length() : sqlTokens.get(currentSQLTokenIndex + 1).getStartIndex();
        return logicSQL.substring(getStartIndex(sqlToken) > logicSQL.length() ? logicSQL.length() : getStartIndex(sqlToken), stopIndex);
    }
    
    private int getStartIndex(final SQLToken sqlToken) {
        return sqlToken instanceof Substitutable ? ((Substitutable) sqlToken).getStopIndex() + 1 : sqlToken.getStartIndex();
    }
}
