package org.dhara.wps.filter;


import org.apache.axiom.om.*;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: harsha
 * Date: 8/23/13
 * Time: 4:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Filter {
    public static String getResourceId(String wpsOut) {
      String everything=test.input0 ;

        OMElement omElement= null;
        try {
            omElement = AXIOMUtil.stringToOM(everything);
        } catch (XMLStreamException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        //  OMElement description=omElement.getFirstChildWithName(new QName("http://airavata.apache.org/schemas/wft/2011/08", "description", "ns"));
      //  OMElement executeResponse=documentElement.getFirstChildWithName(new QName("http://www.opengis.net/wps/1.0.0", "ExecuteResponse", "ns"));
        OMElement processOuts=omElement.getFirstChildWithName(new QName("http://www.opengis.net/wps/1.0.0","ProcessOutputs","ns"));
        OMElement outPut=processOuts.getFirstElement();
        OMElement data=outPut.getFirstChildWithName(new QName("http://www.opengis.net/wps/1.0.0","Data","ns"));
        String complexData=data.getFirstElement().toString();


      String resourceId= complexData.replace("&lt;","<").split("<ResourceID>")[1].split("</ResourceID>")[0];           //replace("&lt;","<").

       return resourceId;

       /* OMElement featureCollection=complexData.getFirstElement();
        OMFactory factory= OMAbstractFactory.getOMFactory();
        OMNamespace poNs= factory.createOMNamespace("http //www.w3.org/1999/xhtml", "xmlns");*/
       // featureCollection.addAttribute("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance",null);
            /*File file = new File("gmlOut.xml");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(featureCollection.toString());
            output.close();*/
      //  FileHandle.write(featureCollection.toString(),args[0]);


        //System.out.println(featureCollection.toString());
    }


    public static void main(String[] args) {


        System.out.println(getResourceId("<ns:ExecuteResponse service=\"WPS\" serviceInstance=\"http://localhost:8093/wps/WebProcessingService?REQUEST=GetCapabilities&amp;SERVICE=WPS\" version=\"1.0.0\" xml:lang=\"en-US\" xsi:schemaLocation=\"http://www.opengis.net/wps/1.0.0 http://schemas.opengis.net/wps/1.0.0/wpsExecute_response.xsd\" xmlns:ns=\"http://www.opengis.net/wps/1.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "  <ns:Process ns:processVersion=\"1.0.0\">\n" +
                "    <ns1:Identifier xmlns:ns1=\"http://www.opengis.net/ows/1.1\">org.n52.wps.server.algorithm.intersection.IntersectionAlgorithm</ns1:Identifier>\n" +
                "    <ns1:Title xmlns:ns1=\"http://www.opengis.net/ows/1.1\">org.n52.wps.server.algorithm.intersection.IntersectionAlgorithm</ns1:Title>\n" +
                "  </ns:Process>\n" +
                "  <ns:Status creationTime=\"2013-10-24T14:47:29.924+05:30\">\n" +
                "    <ns:ProcessSucceeded>The service succesfully processed the request.</ns:ProcessSucceeded>\n" +
                "  </ns:Status>\n" +
                "  <ns:ProcessOutputs>\n" +
                "    <ns:Output>\n" +
                "      <ns1:Identifier xmlns:ns1=\"http://www.opengis.net/ows/1.1\">intersection_result</ns1:Identifier>\n" +
                "      <ns1:Title xmlns:ns1=\"http://www.opengis.net/ows/1.1\">intersection_result</ns1:Title>\n" +
                "      <ns:Data>\n" +
                "        <ns:ComplexData mimeType=\"application/WFS\"><![CDATA[<?xml version=\"1.0\" encoding=\"UTF-8\"?><OWSResponse type=\"WFS\"><ResourceID>N52:Shape_bb623178-6521-4f2b-a103-93b338c84226</ResourceID><GetCapabilitiesLink>http://localhost:8094/geoserver/wfs?Service=WFS&amp;Request=GetCapabilities&amp;Version=1.1.0</GetCapabilitiesLink></OWSResponse>]]></ns:ComplexData>\n" +
                "      </ns:Data>\n" +
                "    </ns:Output>\n" +
                "  </ns:ProcessOutputs>\n" +
                "</ns:ExecuteResponse>\n"));
    }

}
