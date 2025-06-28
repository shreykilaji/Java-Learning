package com.testpackage.filehandling;
/* We need 'Scanner' class to read data from a file. Also need 'File' class from where we get the file details.
from where data is to be read.

first create obj of 'File' class and pass file name in it.
then create obj of 'Scanner' class and pass the obj of 'File' class in it to access file for reading.
 */
import java.io.File;
import java.util.Scanner;

public class FileHandlingReadFile {
    public static void main(String[] args){

        try {
            File myNewObj = new File("E:\\JavaFileHandlingFolder\\TestFile1.txt");
            Scanner myReader = new Scanner(myNewObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch(Exception e){
         System.out.println("Error occurred.");
         e.printStackTrace();
        }
    }
}
