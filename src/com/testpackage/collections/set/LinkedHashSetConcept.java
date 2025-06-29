package com.testpackage.collections.set;

//LinkedHashSet store unique elements in Set, but in order.

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcept {
    public static void main(String[] args){

        Set<Integer> set = new LinkedHashSet<>();

        //adding values in Set
        set.add(21);
        set.add(42);
        set.add(35);
        set.add(60);
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
