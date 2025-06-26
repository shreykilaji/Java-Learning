package com.testpackage;


/* Test Exercise---------->
Take UserInput a Number Check if it is divisible by 5 print "Fizz".
if it is divisible by 3 Print "Buzz". If divisible by both print "FizzBuzz".
 */

import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args){
        // taking UserInput
        Scanner scanner= new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        //Logic---> always put most specific conditions on Top & Generic conditions on bottom

        if(number % 5 ==0 && number % 3==0)
            System.out.println("FizzBuzz");
            // We can write statements in IF statement without curly brackets.


        else if (number % 5==0)
            System.out.println("Fizz");

        else if (number % 3==0)
            System.out.println("Buzz");

        else
            System.out.println(number);
    }
}
