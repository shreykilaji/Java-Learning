package com.testpackage.collections.set;

//HashSet store unique elements in Set, but not in order.
import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {
    public static void main(String[] args){

        Set<Integer> set = new HashSet<>();

        //adding values in Set
        set.add(20);
        set.add(40);
        set.add(35);
        set.add(55);
        System.out.println(set);

        //Remove element from Set
        set.remove(40);
        System.out.println(set);
        //Check if element is present or not in Set-> return True/False based on checking
        System.out.println(set.contains(35));

        //check if Set is empty or not-> return True/False based on checking
        System.out.println(set.isEmpty());
    }

}
