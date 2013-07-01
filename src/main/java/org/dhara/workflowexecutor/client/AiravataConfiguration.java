package org.dhara.workflowexecutor.client;

/**
 * Created with IntelliJ IDEA.
 * User: harsha
 * Date: 6/26/13
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class AiravataConfiguration {
    private static int port=8080;
    private static String serverUrl="localhost";
    private static String serverContextName="airavata-registry";
    private static String username="admin";
    private static String password="admin";
    private static String gateway="default";
    private static String registryURL = "http://" + getServerUrl() + ":" + getPort() + "/" + getServerContextName() + "/api";

    public static int getPort() {
        return port;
    }

    public static void setPort(int port) {
        AiravataConfiguration.port = port;
    }

    public static String getServerUrl() {
        return serverUrl;
    }

    public static void setServerUrl(String serverUrl) {
        AiravataConfiguration.serverUrl = serverUrl;
    }

    public static String getServerContextName() {
        return serverContextName;
    }

    public static void setServerContextName(String serverContextName) {
        AiravataConfiguration.serverContextName = serverContextName;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        AiravataConfiguration.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        AiravataConfiguration.password = password;
    }

    public static String getGateway() {
        return gateway;
    }

    public static void setGateway(String gateway) {
        AiravataConfiguration.gateway = gateway;
    }

    public static String getRegistryURL() {
        return registryURL;
    }

    public static void setRegistryURL(String registryURL) {
        AiravataConfiguration.registryURL = registryURL;
    }
}
