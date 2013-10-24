package org.dhara.wps.filter;

import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: newair
 * Date: 10/18/13
 * Time: 6:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class FileHandle {

    private static String fileName = "output.xml";


    public static String read( String filePath){

        String content = null;


        try {
            content = new Scanner(new File(filePath)).useDelimiter("\\Z").next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

             return content;
    }

     public static void write(String content, String previousPath){

         File file = new File(previousPath);

        String newPath= file.getParent()+File.separator+ fileName;
         System.out.println(newPath);
         // if file doesnt exists, then create it
          file = new File(newPath);
         try {
             file.createNewFile();


             FileWriter fw = new FileWriter(file.getAbsoluteFile());
             BufferedWriter bw = new BufferedWriter(fw);
             bw.write(content);
             bw.close();

         } catch (IOException e) {
             e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
         }
         System.out.println(newPath);

     }

    public static void main(String[] args) {
        String path = "E:\\FYP\\Other\\GMLfilename.txt";
        System.out.println(read(path));
        write("connntent",path);



    }


}
