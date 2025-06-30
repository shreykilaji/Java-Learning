package com.testpackage.arraysclass;
import java.util.Arrays;

public class ArraysClassConcept {
    public static void main(String[] args){

        int[] numbers= {10,20,30,40,50,60,70,80,90,100};
        int index= Arrays.binarySearch(numbers,40);

        //printing Index of Searched element from array
        System.out.println("Index of the element 40 is "+ index);

        //Sorting Array ascending order.
        int[] number = {30,44,20,78,96,62,21};
        Arrays.sort(number);

        //printing sorted array
        for(int i : number)
            System.out.print(i + " ");

    }
}
