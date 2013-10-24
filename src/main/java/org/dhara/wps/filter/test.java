package org.dhara.wps.filter;

/**
 * Created with IntelliJ IDEA.
 * User: harsha
 * Date: 8/23/13
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class test {
    public static String input0="\n" +
          "<ns:ExecuteResponse service=\"WPS\" serviceInstance=\"http://localhost:8093/wps/WebProcessingService?REQUEST=GetCapabilities&amp;SERVICE=WPS\" version=\"1.0.0\" xml:lang=\"en-US\" xsi:schemaLocation=\"http://www.opengis.net/wps/1.0.0 http://schemas.opengis.net/wps/1.0.0/wpsExecute_response.xsd\" xmlns:ns=\"http://www.opengis.net/wps/1.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
            "  <ns:Process ns:processVersion=\"1.0.0\">\n" +
            "    <ns1:Identifier xmlns:ns1=\"http://www.opengis.net/ows/1.1\">org.n52.wps.server.algorithm.SimpleBufferAlgorithm</ns1:Identifier>\n" +
            "    <ns1:Title xmlns:ns1=\"http://www.opengis.net/ows/1.1\">org.n52.wps.server.algorithm.SimpleBufferAlgorithm</ns1:Title>\n" +
            "  </ns:Process>\n" +
            "  <ns:Status creationTime=\"2013-10-23T22:04:40.219+05:30\">\n" +
            "    <ns:ProcessSucceeded>Process has succeeded</ns:ProcessSucceeded>\n" +
            "  </ns:Status>\n" +
            "  <ns:ProcessOutputs>\n" +
            "    <ns:Output>\n" +
            "      <ns1:Identifier xmlns:ns1=\"http://www.opengis.net/ows/1.1\">result</ns1:Identifier>\n" +
            "      <ns1:Title xmlns:ns1=\"http://www.opengis.net/ows/1.1\">result</ns1:Title>\n" +
            "      <ns:Data>\n" +
            "        <ns:ComplexData mimeType=\"application/WFS\"><![CDATA[<?xml version=\"1.0\" encoding=\"UTF-8\"?><OWSResponse type=\"WFS\"><ResourceID>N52:Shape_ad92f5ec-68fd-4b77-9624-ea5d8651e4f2</ResourceID><GetCapabilitiesLink>http://localhost:8094/geoserver/wfs?Service=WFS&amp;Request=GetCapabilities&amp;Version=1.1.0</GetCapabilitiesLink></OWSResponse>]]></ns:ComplexData>\n" +
            "      </ns:Data>\n" +
            "    </ns:Output>\n" +
            "  </ns:ProcessOutputs>\n" +
            "</ns:ExecuteResponse>";
}