package com.testpackage.collections.list;

import java.util.ArrayList;
public class ArrayListConcept {
    public static void main(String[] args){

        //Implementing ArrayList
       ArrayList<String> fruits = new ArrayList<>();

       //Adding element in List
        fruits.add("Apple");
        fruits.add("mangoes");
        fruits.add("Pineapple");

        System.out.println("First Fruit: "+ fruits.get(0));
        System.out.println(fruits);

        //Replace element in list
        fruits.set(1,"Banana");
        System.out.println(fruits);
        //Remove element from List
        fruits.remove(2);
        System.out.println(fruits);
        //Size of List
        System.out.println("Size of List: "+fruits.size());
        //To check element exists in list
        System.out.println(fruits.contains("Banana"));
        //To remove all elements from List
        fruits.clear();
        System.out.println(fruits);

    }
}
