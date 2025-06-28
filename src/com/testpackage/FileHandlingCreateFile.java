package com.testpackage;

import java.io.File; //import 'File' class from 'java.io' package.
import java.io.IOException; //Import 'IOException' class from 'java.io' package to handle error.
import java.sql.SQLOutput;

public class FileHandlingCreateFile {
    public static void main(String[] args){

        //use Try catch block because File class throw exceptions
        try{
            //create obj of File class first to create a file.
            File myObj = new File("E:\\JavaFileHandlingFolder\\TestFile1.txt");
            if(myObj.createNewFile()){
                System.out.println("File Created Successfully : "+ myObj.getName());
            }
            else
                System.out.println("File already exists");
        }
        catch(Exception e){
            System.out.println("Error Occurred while creating file.");
            e.printStackTrace();
        }
    }
}
