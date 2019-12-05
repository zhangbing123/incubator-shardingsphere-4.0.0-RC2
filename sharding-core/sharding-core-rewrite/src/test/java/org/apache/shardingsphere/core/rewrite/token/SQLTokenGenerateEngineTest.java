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

package org.apache.shardingsphere.core.rewrite.token;

import org.apache.shardingsphere.core.optimize.encrypt.segment.condition.EncryptCondition;
import org.apache.shardingsphere.core.optimize.sharding.segment.condition.ShardingCondition;
import org.apache.shardingsphere.core.optimize.sharding.segment.select.groupby.GroupBy;
import org.apache.shardingsphere.core.optimize.sharding.segment.select.item.AggregationDistinctSelectItem;
import org.apache.shardingsphere.core.optimize.sharding.segment.select.item.SelectItem;
import org.apache.shardingsphere.core.optimize.sharding.segment.select.item.SelectItems;
import org.apache.shardingsphere.core.optimize.sharding.segment.select.orderby.OrderBy;
import org.apache.shardingsphere.core.optimize.sharding.segment.select.orderby.OrderByItem;
import org.apache.shardingsphere.core.optimize.sharding.segment.select.pagination.Pagination;
import org.apache.shardingsphere.core.optimize.sharding.statement.dml.ShardingSelectOptimizedStatement;
import org.apache.shardingsphere.core.parse.core.constant.AggregationType;
import org.apache.shardingsphere.core.parse.sql.segment.generic.TableSegment;
import org.apache.shardingsphere.core.parse.sql.statement.dml.SelectStatement;
import org.apache.shardingsphere.core.rewrite.token.pojo.SQLToken;
import org.apache.shardingsphere.core.rewrite.token.pojo.SelectItemPrefixToken;
import org.apache.shardingsphere.core.rule.EncryptRule;
import org.apache.shardingsphere.core.rule.ShardingRule;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public final class SQLTokenGenerateEngineTest {
    
    private SQLTokenGenerateEngine shardingTokenGenerateEngine = new ShardingTokenGenerateEngine();
    
    private SQLTokenGenerateEngine baseTokenGenerateEngine = new BaseTokenGenerateEngine();
    
    private SQLTokenGenerateEngine encryptTokenGenerateEngine = new EncryptTokenGenerateEngine();
    
    private ShardingSelectOptimizedStatement optimizedStatement;
    
    @Before
    public void setUp() {
        SelectStatement selectStatement = new SelectStatement();
        SelectItems selectItems = new SelectItems(1, 20, false, 
                Collections.<SelectItem>singletonList(new AggregationDistinctSelectItem(1, 2, AggregationType.COUNT, "(DISTINCT id)", "c", "id")), Collections.<TableSegment>emptyList(), null);
        optimizedStatement = new ShardingSelectOptimizedStatement(selectStatement, Collections.<ShardingCondition>emptyList(), Collections.<EncryptCondition>emptyList(), 
                new GroupBy(Collections.<OrderByItem>emptyList(), 1), new OrderBy(Collections.<OrderByItem>emptyList(), false), selectItems, new Pagination(null, null, Collections.emptyList()));
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void assertGenerateSQLTokensWithBaseTokenGenerateEngine() {
        List<SQLToken> actual = baseTokenGenerateEngine.generateSQLTokens(optimizedStatement, null, mock(ShardingRule.class), true, false);
        assertThat(actual.size(), is(0));
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void assertGetSQLTokenGeneratorsWithShardingTokenGenerateEngineWithoutSingleRoute() {
        List<SQLToken> actual = shardingTokenGenerateEngine.generateSQLTokens(optimizedStatement, null, mock(ShardingRule.class), false, false);
        assertThat(actual.size(), is(2));
        assertThat(actual.get(0), CoreMatchers.<SQLToken>instanceOf(SelectItemPrefixToken.class));
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void assertGetSQLTokenGeneratorsWithShardingTokenGenerateEngineWithSingleRoute() {
        List<SQLToken> actual = shardingTokenGenerateEngine.generateSQLTokens(optimizedStatement, null, mock(ShardingRule.class), true, false);
        assertThat(actual.size(), is(0));
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void assertGenerateSQLTokensWithEncryptTokenGenerateEngine() {
        List<SQLToken> actual = encryptTokenGenerateEngine.generateSQLTokens(optimizedStatement, null, mock(EncryptRule.class), true, false);
        assertThat(actual.size(), is(0));
    }
}
