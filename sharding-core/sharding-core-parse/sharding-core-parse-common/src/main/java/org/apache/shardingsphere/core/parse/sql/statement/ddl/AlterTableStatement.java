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

package org.apache.shardingsphere.core.parse.sql.statement.ddl;

import lombok.Getter;
import lombok.Setter;
import org.apache.shardingsphere.core.parse.sql.segment.ddl.column.ColumnDefinitionSegment;
import org.apache.shardingsphere.core.parse.sql.segment.ddl.column.position.ColumnPositionSegment;
import org.apache.shardingsphere.core.parse.sql.segment.generic.TableSegment;
import org.apache.shardingsphere.core.parse.sql.statement.generic.TableSegmentAvailable;

import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Alter table statement.
 * 
 * @author duhongjun
 */
@Getter
@Setter
public final class AlterTableStatement extends DDLStatement implements TableSegmentAvailable {
    
    private TableSegment table;
    
    private final Collection<ColumnDefinitionSegment> addedColumnDefinitions = new LinkedList<>();
    
    private final Collection<ColumnPositionSegment> changedPositionColumns = new TreeSet<>();
    
    private final Collection<String> droppedColumnNames = new LinkedList<>();
}
