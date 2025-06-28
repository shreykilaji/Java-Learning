package com.testpackage;

import java.io.File;

public class FileHandlingDeleteFileAndFolder {
    public static void main(String[] args){

        // To Delete File-------------->
        File newObj1 = new File("E:\\JavaFileHandlingFolder\\TestFile1.txt");
        if(newObj1.delete())
            System.out.println("File delete Successfully: " +newObj1.getName());
        else
            System.out.println("Failed to delete File");

        // To delete folder------------->
        File newObj2 = new File("E:\\JavaFileHandlingFolder");
        if(newObj1.delete())
            System.out.println("File delete Successfully: " +newObj2.getName());
        else
            System.out.println("Failed to delete File");
    }
}
