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

package org.apache.shardingsphere.core.yaml.engine;

import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.CollectionNode;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.SequenceNode;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Representer;

/**
 * Default YAML representer.
 *
 * @author panjuan
 * @author zhangliang
 */
public final class DefaultYamlRepresenter extends Representer {
    
    @Override
    protected NodeTuple representJavaBeanProperty(final Object javaBean, final Property property, final Object propertyValue, final Tag customTag) {
        NodeTuple tuple = super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
        return isUnwantedNodeTuple(tuple.getValueNode()) ? null : tuple;
    }
    
    private boolean isUnwantedNodeTuple(final Node valueNode) {
        return isNullNode(valueNode) || isEmptyCollectionNode(valueNode);
    }
    
    private boolean isNullNode(final Node valueNode) {
        return Tag.NULL.equals(valueNode.getTag());
    }
    
    private boolean isEmptyCollectionNode(final Node valueNode) {
        return valueNode instanceof CollectionNode && (isEmptySequenceNode(valueNode) || isEmptyMappingNode(valueNode));
    }
    
    private boolean isEmptySequenceNode(final Node valueNode) {
        return Tag.SEQ.equals(valueNode.getTag()) && ((SequenceNode) valueNode).getValue().isEmpty();
    }
    
    private boolean isEmptyMappingNode(final Node valueNode) {
        return Tag.MAP.equals(valueNode.getTag()) && ((MappingNode) valueNode).getValue().isEmpty();
    }
}
