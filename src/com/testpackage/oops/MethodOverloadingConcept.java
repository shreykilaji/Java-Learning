package com.testpackage.oops;

//created class with same name methods with different number and types of parameters

class Calculator{

    int add(int a, int b){
        return a+b;
    }
    double add(double a,double b, double c){
        return a+b+c;
    }
}

public class MethodOverloadingConcept{
    public static void main(String[] args){

        Calculator calc= new Calculator();

        //same name methods 'add()' with different number and types of parameters
        System.out.println("Total of int: "+ calc.add(5,10));  //add() method with two parameter a & b.
        System.out.println("Total of double: "+ calc.add(12,13,14)); //add() method with three parameter a , b & c.
    }
}