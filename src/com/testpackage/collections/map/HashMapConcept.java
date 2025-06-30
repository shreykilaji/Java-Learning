package com.testpackage.collections.map;

/*HashMap is a class that implements Map Interface to store data in key-value pair.
uses hashing from fast insertion, lookup and deletion of data.
*/

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args){

        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("One",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);

        System.out.println(numbers); // Printed Key-Value pairs will not be in order.

        //To print keys from Map
        for(String key: numbers.keySet())
            System.out.println(key);

        //To print values from Map
        for(Integer value: numbers.values())
            System.out.println(value);

        //To check if any key-value is present or not in Map
        System.out.println(numbers.containsKey("One")); //checking based on Key that is passed.
        System.out.println(numbers.containsValue(8)); //checking based on Value that is passed.

    }
}
