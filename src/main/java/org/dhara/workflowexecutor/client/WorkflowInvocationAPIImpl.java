package org.dhara.workflowexecutor.client;

import org.apache.airavata.client.AiravataAPIFactory;
import org.apache.airavata.client.api.AiravataAPI;
import org.apache.airavata.client.api.exception.AiravataAPIInvocationException;
import org.apache.airavata.registry.api.PasswordCallback;
import org.apache.airavata.registry.api.exception.worker.ExperimentLazyLoadedException;
import org.apache.airavata.registry.api.impl.WorkflowExecutionDataImpl;
import org.apache.airavata.registry.api.workflow.ExperimentData;
import org.apache.airavata.registry.api.workflow.InputData;
import org.apache.airavata.registry.api.workflow.NodeExecutionData;
import org.apache.airavata.registry.api.workflow.OutputData;
import org.apache.airavata.rest.client.PasswordCallbackImpl;
import org.apache.airavata.workflow.model.wf.Workflow;
import org.apache.airavata.workflow.model.wf.WorkflowInput;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: harsha
 * Date: 6/26/13
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class WorkflowInvocationAPIImpl implements WorkflowInvocationAPI {

    private AiravataAPI airavataAPI;
    public WorkflowInvocationAPIImpl() throws URISyntaxException, AiravataAPIInvocationException {
       airavataAPI=AiravataAPIService.getAiravataAPI();
    }

    /**
     * Execute airavata workflow by setting inputs
     * @param inputs
     * @param workflowName
     * @return
     * @throws Exception
     */
    public String executeWorkflow(Map<String, Object> inputs, String workflowName) throws Exception {
        Workflow workflow = airavataAPI.getWorkflowManager().getWorkflow(workflowName);
        List<WorkflowInput> workflowInputs = workflow.getWorkflowInputs();

        for (WorkflowInput workflowInput : workflowInputs) {
            Object value=inputs.get(workflowInput.getName());
            if ("int".equals(workflowInput.getType())||"integer".equals(workflowInput.getType())) {
                workflowInput.setValue((Integer)value);
            } else if("String".equals(workflowInput.getType())){
                workflowInput.setValue((String)value);
            }
        }
        return airavataAPI.getExecutionManager().runExperiment(workflowName, workflowInputs);
    }


    public Map<String, Object> getWorkflowOutputs(String experimentId) throws AiravataAPIInvocationException, URISyntaxException, ExperimentLazyLoadedException {
        Map<String,Object> outputs=new HashMap<String, Object>();
        MonitorWorkflow monitorWorkflow=new MonitorWorkflow();
        monitorWorkflow.monitor(experimentId,airavataAPI);
        airavataAPI.getExecutionManager().waitForExperimentTermination(experimentId);
        ExperimentData experimentData = airavataAPI.getProvenanceManager().getExperimentData(experimentId);
        List<WorkflowExecutionDataImpl> workflowInstanceData = experimentData.getWorkflowExecutionDataList();
        for (WorkflowExecutionDataImpl executionDataImpl : workflowInstanceData) {

            List<NodeExecutionData> nodeDataList = executionDataImpl.getNodeDataList();
            for (NodeExecutionData nodeExecutionData : nodeDataList) {
                List<OutputData> outputData = nodeExecutionData.getOutputData();
                for (OutputData data : outputData) {
                     outputs.put(data.getName(),data.getValue());
                }
            }
        }
        return outputs;
    }
}
