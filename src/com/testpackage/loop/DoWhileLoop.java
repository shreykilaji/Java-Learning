//exercise for do-while loop,
//Take UserInput until user provide quit as an input.
package com.testpackage.loop;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main (String [] args){
        Scanner scanner= new Scanner(System.in);
        String input ="";

        do{
            System.out.print("User Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }while(!input.equals("quit"));
        //Loop will execute until above condition will be false
    }
}
