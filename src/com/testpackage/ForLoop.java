// we have three item in Array we try to print using for loop.
package com.testpackage;

public class ForLoop {
    public static void main (String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};

        //Printing Array of String type
        System.out.println("Printing Array Of String Type");
        for (int i = 0; i < fruits.length; i++)
        System.out.println(fruits[i]);

        //Reverse Printing Array of String type
        System.out.println("Reverse Printing Array Of String Type");
        for (int i = fruits.length -1 ; i >= 0 ; i--)
            System.out.println(fruits[i]);
    }
}
