package org.dhara.workflowexecutor.client;

import org.apache.airavata.client.AiravataAPIFactory;
import org.apache.airavata.client.api.AiravataAPI;
import org.apache.airavata.client.api.exception.AiravataAPIInvocationException;
import org.apache.airavata.registry.api.PasswordCallback;
import org.apache.airavata.rest.client.PasswordCallbackImpl;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created with IntelliJ IDEA.
 * User: harsha
 * Date: 6/27/13
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class AiravataAPIService {
    /**
     * Build the airavata API
     * @return
     * @throws URISyntaxException
     * @throws AiravataAPIInvocationException
     */
    public static AiravataAPI getAiravataAPI() throws URISyntaxException, AiravataAPIInvocationException {
        AiravataAPI airavataAPI;
        PasswordCallback passwordCallback = new PasswordCallbackImpl(AiravataConfiguration.getUsername(), AiravataConfiguration.getPassword());
        airavataAPI = AiravataAPIFactory.getAPI(new URI(AiravataConfiguration.getRegistryURL()), AiravataConfiguration.getGateway(),AiravataConfiguration.getUsername(),
                passwordCallback);
        return airavataAPI;
    }
}
