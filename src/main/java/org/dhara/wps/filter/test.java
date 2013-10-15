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
            "    <ns1:Identifier xmlns:ns1=\"http://www.opengis.net/ows/1.1\">org.n52.wps.server.algorithm.intersection.IntersectionAlgorithm</ns1:Identifier>\n" +
            "    <ns1:Title xmlns:ns1=\"http://www.opengis.net/ows/1.1\">org.n52.wps.server.algorithm.intersection.IntersectionAlgorithm</ns1:Title>\n" +
            "  </ns:Process>\n" +
            "  <ns:Status creationTime=\"2013-08-23T18:55:48.211+05:30\">\n" +
            "    <ns:ProcessSucceeded>Process has succeeded</ns:ProcessSucceeded>\n" +
            "  </ns:Status>\n" +
            "  <ns:ProcessOutputs>\n" +
            "    <ns:Output>\n" +
            "      <ns1:Identifier xmlns:ns1=\"http://www.opengis.net/ows/1.1\">intersection_result</ns1:Identifier>\n" +
            "      <ns1:Title xmlns:ns1=\"http://www.opengis.net/ows/1.1\">intersection_result</ns1:Title>\n" +
            "      <ns:Data>\n" +
            "        <ns:ComplexData mimeType=\"text/xml\" schema=\"http://schemas.opengis.net/gml/2.1.1/feature.xsd\">\n" +
            "          <wfs:FeatureCollection xsi:schemaLocation=\"http://openplans.org/2010/04/topp-is-now-open-plans/ http://localhost:8094/geoserver/Dhara/wfs?service=WFS&amp;version=1.0.0&amp;request=DescribeFeatureType&amp;typeName=Dhara%3ARd_Bulathsinhala http://www.opengis.net/wfs http://schemas.opengis.net/wfs/1.0.0/WFS-basic.xsd\" xmlns=\"http://www.opengis.net/wfs\" xmlns:Rd_Bulathsinhala2=\"http://openplans.org/2010/04/topp-is-now-open-plans/\" xmlns:gml=\"http://www.opengis.net/gml\" xmlns:wfs=\"http://www.opengis.net/wfs\">\n" +
            "            <gml:featureMember>\n" +
            "               <gml:test>test</gml:test>"+
            "            </gml:featureMember>\n" +
            "          </wfs:FeatureCollection>\n" +
            "        </ns:ComplexData>\n" +
            "      </ns:Data>\n" +
            "    </ns:Output>\n" +
            "  </ns:ProcessOutputs>\n" +
            "</ns:ExecuteResponse>\n";
}
