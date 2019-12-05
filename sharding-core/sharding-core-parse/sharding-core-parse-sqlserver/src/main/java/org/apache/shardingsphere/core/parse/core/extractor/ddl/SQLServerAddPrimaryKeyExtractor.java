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

package org.apache.shardingsphere.core.parse.core.extractor.ddl;

import com.google.common.base.Optional;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.shardingsphere.core.parse.core.extractor.api.OptionalSQLSegmentExtractor;
import org.apache.shardingsphere.core.parse.core.extractor.util.ExtractorUtils;
import org.apache.shardingsphere.core.parse.core.extractor.util.RuleName;
import org.apache.shardingsphere.core.parse.sql.segment.ddl.constraint.ConstraintDefinitionSegment;

import java.util.Collection;
import java.util.Map;

/**
 * Add primary key extractor for SQLServer.
 *
 * @author duhongjun
 */
public final class SQLServerAddPrimaryKeyExtractor implements OptionalSQLSegmentExtractor {
    
    @Override
    public Optional<ConstraintDefinitionSegment> extract(final ParserRuleContext ancestorNode, final Map<ParserRuleContext, Integer> parameterMarkerIndexes) {
        Optional<ParserRuleContext> addColumnNode = ExtractorUtils.findFirstChildNode(ancestorNode, RuleName.ADD_COLUMN_SPECIFICATION);
        if (!addColumnNode.isPresent()) {
            return Optional.absent();
        }
        Optional<ParserRuleContext> tableConstraintNode = ExtractorUtils.findFirstChildNode(addColumnNode.get(), RuleName.TABLE_CONSTRAINT);
        if (!tableConstraintNode.isPresent()) {
            return Optional.absent();
        }
        Optional<ParserRuleContext> primaryKeyNode = ExtractorUtils.findFirstChildNode(tableConstraintNode.get(), RuleName.PRIMARY_KEY);
        if (!primaryKeyNode.isPresent()) {
            return Optional.absent();
        }
        Collection<ParserRuleContext> columnNameNodes = ExtractorUtils.getAllDescendantNodes(tableConstraintNode.get(), RuleName.COLUMN_NAME);
        if (columnNameNodes.isEmpty()) {
            return Optional.absent();
        }
        ConstraintDefinitionSegment result = new ConstraintDefinitionSegment(tableConstraintNode.get().getStart().getStartIndex(), tableConstraintNode.get().getStop().getStopIndex());
        for (ParseTree each : columnNameNodes) {
            result.getPrimaryKeyColumnNames().add(each.getText());
        }
        return Optional.of(result);
    }
}
