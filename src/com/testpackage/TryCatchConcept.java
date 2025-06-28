package com.testpackage;

//Try Catch concept with finally statement for exception handling
public class TryCatchConcept {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
            //above statement throws ArrayOutOfBound exception to handle error we implement catch block below
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }

        finally{
            System.out.println("The try catch is finished");
            //finally used to execute code after try and catch, regardless of results
        }
    }
}
