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

package org.apache.shardingsphere.core.route.router.sharding;

import com.google.common.base.Preconditions;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.core.metadata.datasource.ShardingDataSourceMetaData;
import org.apache.shardingsphere.core.optimize.api.statement.OptimizedStatement;
import org.apache.shardingsphere.core.optimize.sharding.statement.dml.ShardingConditionOptimizedStatement;
import org.apache.shardingsphere.core.parse.sql.statement.SQLStatement;
import org.apache.shardingsphere.core.parse.sql.statement.dal.DALStatement;
import org.apache.shardingsphere.core.parse.sql.statement.dal.dialect.mysql.ShowDatabasesStatement;
import org.apache.shardingsphere.core.parse.sql.statement.dal.dialect.mysql.UseStatement;
import org.apache.shardingsphere.core.parse.sql.statement.dal.dialect.postgresql.ResetParameterStatement;
import org.apache.shardingsphere.core.parse.sql.statement.dal.dialect.postgresql.SetStatement;
import org.apache.shardingsphere.core.parse.sql.statement.dcl.DCLStatement;
import org.apache.shardingsphere.core.parse.sql.statement.ddl.DDLStatement;
import org.apache.shardingsphere.core.parse.sql.statement.dml.SelectStatement;
import org.apache.shardingsphere.core.parse.sql.statement.tcl.TCLStatement;
import org.apache.shardingsphere.core.route.type.RoutingEngine;
import org.apache.shardingsphere.core.route.type.broadcast.DataSourceGroupBroadcastRoutingEngine;
import org.apache.shardingsphere.core.route.type.broadcast.DatabaseBroadcastRoutingEngine;
import org.apache.shardingsphere.core.route.type.broadcast.InstanceBroadcastRoutingEngine;
import org.apache.shardingsphere.core.route.type.broadcast.TableBroadcastRoutingEngine;
import org.apache.shardingsphere.core.route.type.complex.ComplexRoutingEngine;
import org.apache.shardingsphere.core.route.type.defaultdb.DefaultDatabaseRoutingEngine;
import org.apache.shardingsphere.core.route.type.ignore.IgnoreRoutingEngine;
import org.apache.shardingsphere.core.route.type.standard.StandardRoutingEngine;
import org.apache.shardingsphere.core.route.type.unicast.UnicastRoutingEngine;
import org.apache.shardingsphere.core.rule.ShardingRule;

import java.util.Collection;

/**
 * Routing engine factory.
 *
 * @author zhangliang
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RoutingEngineFactory {
    
    /**
     * Create new instance of routing engine.
     * 
     * @param shardingRule sharding rule
     * @param shardingDataSourceMetaData sharding data source meta data
     * @param optimizedStatement optimized statement
     * @return new instance of routing engine
     */
    public static RoutingEngine newInstance(final ShardingRule shardingRule, final ShardingDataSourceMetaData shardingDataSourceMetaData, final OptimizedStatement optimizedStatement) {
        /**
         * 根据SQLstatement，使用对应的表路由引擎orDB路由引擎
         */
        SQLStatement sqlStatement = optimizedStatement.getSQLStatement();
        Collection<String> tableNames = optimizedStatement.getTables().getTableNames();
        if (sqlStatement instanceof TCLStatement) {
            return new DatabaseBroadcastRoutingEngine(shardingRule);
        }
        if (sqlStatement instanceof DDLStatement) {
            return new TableBroadcastRoutingEngine(shardingRule, optimizedStatement);
        }
        if (sqlStatement instanceof DALStatement) {
            return getDALRoutingEngine(shardingRule, sqlStatement, tableNames);
        }
        if (sqlStatement instanceof DCLStatement) {
            return getDCLRoutingEngine(shardingRule, optimizedStatement, shardingDataSourceMetaData);
        }
        if (shardingRule.isAllInDefaultDataSource(tableNames)) {
            return new DefaultDatabaseRoutingEngine(shardingRule, tableNames);
        }
        if (shardingRule.isAllBroadcastTables(tableNames)) {
            return sqlStatement instanceof SelectStatement ? new UnicastRoutingEngine(shardingRule, tableNames) : new DatabaseBroadcastRoutingEngine(shardingRule);
        }
        if (optimizedStatement instanceof ShardingConditionOptimizedStatement && ((ShardingConditionOptimizedStatement) optimizedStatement).getShardingConditions().isAlwaysFalse()
                || tableNames.isEmpty()) {
            return new UnicastRoutingEngine(shardingRule, tableNames);
        }
        Preconditions.checkState(optimizedStatement instanceof ShardingConditionOptimizedStatement);
        return getShardingRoutingEngine(shardingRule, (ShardingConditionOptimizedStatement) optimizedStatement, tableNames);
    }
    
    private static RoutingEngine getDALRoutingEngine(final ShardingRule shardingRule, final SQLStatement sqlStatement, final Collection<String> tableNames) {
        if (sqlStatement instanceof ShowDatabasesStatement || sqlStatement instanceof UseStatement) {
            return new IgnoreRoutingEngine();
        }
        if (sqlStatement instanceof SetStatement || sqlStatement instanceof ResetParameterStatement) {
            return new DatabaseBroadcastRoutingEngine(shardingRule);
        }
        if (!tableNames.isEmpty()) {
            return new UnicastRoutingEngine(shardingRule, tableNames);
        }
        return new DataSourceGroupBroadcastRoutingEngine(shardingRule);
    }
    
    private static RoutingEngine getDCLRoutingEngine(final ShardingRule shardingRule, final OptimizedStatement optimizedStatement, final ShardingDataSourceMetaData shardingDataSourceMetaData) {
        return isGrantForSingleTable(optimizedStatement) 
                ? new TableBroadcastRoutingEngine(shardingRule, optimizedStatement) : new InstanceBroadcastRoutingEngine(shardingRule, shardingDataSourceMetaData);
    }
    
    private static boolean isGrantForSingleTable(final OptimizedStatement optimizedStatement) {
        return !optimizedStatement.getTables().isEmpty() && !"*".equals(optimizedStatement.getTables().getSingleTableName());
    }

    /**
     * 创建路由引擎,此处创建引擎的机制是，判断logic表的表数量，如果只有一张表 or 查找的表是绑定表，则创建标准路由引擎
     *
     * @param shardingRule
     * @param optimizedStatement
     * @param tableNames
     * @return
     */
    private static RoutingEngine getShardingRoutingEngine(final ShardingRule shardingRule, final ShardingConditionOptimizedStatement optimizedStatement, final Collection<String> tableNames) {
        Collection<String> shardingTableNames = shardingRule.getShardingLogicTableNames(tableNames);
        /*
         * 如果只有一张表 or 查找的表是绑定表，则创建标准路由引擎，可能发生笛卡尔积现象
         * */
        if (1 == shardingTableNames.size() || shardingRule.isAllBindingTables(shardingTableNames)) {
            return new StandardRoutingEngine(shardingRule, shardingTableNames.iterator().next(), optimizedStatement);
        }
        // TODO config for cartesian set ，复合路由引擎
        return new ComplexRoutingEngine(shardingRule, tableNames, optimizedStatement);
    }
}
