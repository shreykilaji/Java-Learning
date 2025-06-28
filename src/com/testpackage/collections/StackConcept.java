package com.testpackage.collections;

//import Stack class of java.util package to implement stack.
import java.util.Stack;

public class StackConcept {
    public static void main (String[] args){

        //creating obj of Stack class
        Stack<String> animals = new Stack<>();

        //Using push() method to enter elements in Stack
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        //Printing Stack
        System.out.println("Stack: "+ animals);

        //Using peek() method to check which element is on top of stack
        System.out.println("Element on top: "+ animals.peek());

        //using pop() method removing top element from Stack
        animals.pop();

        //Printing Stack
        System.out.println(animals);
    }

}
