/*To Write in File in Java need to import 'FileWriter' Class from 'java.io' package
 Then we create Obj of FileWriter Class & use write() method to write in File.
 after successfully writing we need to close the file using close() method to close file.
*/
package com.testpackage;

import java.io.FileWriter; //import 'FileWriter' class from 'java.io' package.


public class FileHandlingWriteToFile {
    public static void main (String[] args){

        try{
            //Creating object of FileWriter Class
            FileWriter myWriter = new FileWriter("E:\\JavaFileHandlingFolder\\TestFile1.txt");
            myWriter.write("Hello I am Writing this from File Handling Code.");
            myWriter.close();
            System.out.println("Successfully writing completed in File: ");
        }
        catch(Exception e){
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
    }
}
