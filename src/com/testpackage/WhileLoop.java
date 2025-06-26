//exercise for while loop,
//Take UserInput until user provide quit as an input.
package com.testpackage;
import java.util.Scanner;

public class WhileLoop {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        String input="";
        while(!input.equals("quit")) {
          System.out.print("Input: ");
          input= scanner.next().toLowerCase();
          System.out.println(input);
        }
    }
}
