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
    public static void main(String[] args) {
        String everything=FileHandle.read(args[0]) ;



        /*    BufferedReader br = new BufferedReader(new FileReader("out3.txt"));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append('\n');
                    line = br.readLine();
                }
                everything = sb.toString();
            } finally {
                br.close();
            }*/



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
        OMElement complexData=data.getFirstElement();
        OMElement featureCollection=complexData.getFirstElement();
        OMFactory factory= OMAbstractFactory.getOMFactory();
        OMNamespace poNs= factory.createOMNamespace("http //www.w3.org/1999/xhtml", "xmlns");
       // featureCollection.addAttribute("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance",null);
            /*File file = new File("gmlOut.xml");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(featureCollection.toString());
            output.close();*/
        FileHandle.write(featureCollection.toString(),args[0]);


        //System.out.println(featureCollection.toString());
    }
}
