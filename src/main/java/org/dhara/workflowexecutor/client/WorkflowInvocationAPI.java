package org.dhara.workflowexecutor.client;

import org.apache.airavata.client.api.exception.AiravataAPIInvocationException;
import org.apache.airavata.registry.api.exception.worker.ExperimentLazyLoadedException;

import java.net.URISyntaxException;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: harsha
 * Date: 6/26/13
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public interface WorkflowInvocationAPI {
    public String executeWorkflow(Map<String,Object> inputs,String workflowId) throws Exception;
    public Map<String,Object> getWorkflowOutputs(String experimentId) throws AiravataAPIInvocationException, URISyntaxException, ExperimentLazyLoadedException;
}
