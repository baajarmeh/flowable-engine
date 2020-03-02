/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.dmn.engine.impl.agenda;

import org.flowable.common.engine.impl.agenda.Agenda;
import org.flowable.dmn.engine.impl.ExecuteDecisionContext;
import org.flowable.dmn.engine.impl.persistence.entity.DecisionEntity;
import org.flowable.dmn.model.Decision;
import org.flowable.dmn.model.DecisionService;
import org.flowable.dmn.model.DmnDefinition;

/**
 * @author Yvo Swillens
 */
public interface DmnEngineAgenda extends Agenda {

    void planExecuteDecisionServiceOperation(ExecuteDecisionContext executeDecisionContext, DecisionService decisionService);
    void planExecuteDecisionOperation(ExecuteDecisionContext executeDecisionContext, Decision decision);
}
