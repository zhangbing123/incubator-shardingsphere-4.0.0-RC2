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

package org.apache.shardingsphere.shardingjdbc.spring.boot.sharding;

import org.apache.shardingsphere.shardingjdbc.spring.boot.encrypt.EncryptRuleCondition;
import org.apache.shardingsphere.shardingjdbc.spring.boot.masterslave.MasterSlaveRuleCondition;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Sharding rule condition.
 *
 * @author yangyi
 */
public final class ShardingRuleCondition extends SpringBootCondition {
    
    @Override
    public ConditionOutcome getMatchOutcome(final ConditionContext conditionContext, final AnnotatedTypeMetadata annotatedTypeMetadata) {
        boolean isMasterSlaveRule = new MasterSlaveRuleCondition().getMatchOutcome(conditionContext, annotatedTypeMetadata).isMatch();
        boolean isEncryptRule = new EncryptRuleCondition().getMatchOutcome(conditionContext, annotatedTypeMetadata).isMatch();
        return isMasterSlaveRule || isEncryptRule ? ConditionOutcome.noMatch("Have found master-slave or encrypt rule in environment") : ConditionOutcome.match();
    }
}
