package com.testpackage;

import java.util.Scanner;

/*throw concept custom throw exception if age is less than 18(Print Access Denied)
if age is equal or greater than 18 (print Access Granted)
*/
public class ThrowConcept {

    static void getAge(int age){
    if(age<18){
        throw  new ArithmeticException("Access Denied: Age is less than 18");
    }
    else
        System.out.println("Access Granted: You are old enough");
    }

    public static void main(String[] args){
        System.out.println("Enter Age: ");
        Scanner scanner= new Scanner(System.in);
        int age= scanner.nextInt();

        //calling getAge() method
        getAge(age);
    }
}
