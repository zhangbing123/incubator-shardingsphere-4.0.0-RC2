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

package org.apache.shardingsphere.core.parse.integrate.asserts.orderby;

import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.core.parse.integrate.asserts.SQLStatementAssertMessage;
import org.apache.shardingsphere.core.parse.integrate.jaxb.orderby.ExpectedOrderByColumn;
import org.apache.shardingsphere.core.parse.sql.segment.dml.order.item.ColumnOrderByItemSegment;
import org.apache.shardingsphere.core.parse.sql.segment.dml.order.item.OrderByItemSegment;

import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Order by assert.
 *
 * @author zhangliang
 */
@RequiredArgsConstructor
public final class OrderByAssert {
    
    private final SQLStatementAssertMessage assertMessage;
    
    /**
     * Assert order by items.
     *
     * @param actual actual order by items
     * @param expected expected order by items
     */
    public void assertOrderByItems(final Collection<OrderByItemSegment> actual, final List<ExpectedOrderByColumn> expected) {
        assertThat(assertMessage.getFullAssertMessage("Order by items size error: "), actual.size(), is(expected.size()));
        int count = 0;
        for (OrderByItemSegment each : actual) {
            if (each instanceof ColumnOrderByItemSegment) {
                assertOrderByItem((ColumnOrderByItemSegment) each, expected.get(count));
            }
            count++;
        }
    }
    
    private void assertOrderByItem(final ColumnOrderByItemSegment actual, final ExpectedOrderByColumn expected) {
        assertThat(assertMessage.getFullAssertMessage("Order by item owner assertion error: "),
                actual.getColumn().getOwner().isPresent() ? actual.getColumn().getOwner().get().getTableName() : null, is(expected.getOwner()));
        assertThat(assertMessage.getFullAssertMessage("Order by item name assertion error: "), actual.getColumn().getName(), is(expected.getName()));
        assertThat(assertMessage.getFullAssertMessage("Order by item order direction assertion error: "), actual.getOrderDirection().name(), is(expected.getOrderDirection()));
        // TODO assert nullOrderDirection
    }
}
