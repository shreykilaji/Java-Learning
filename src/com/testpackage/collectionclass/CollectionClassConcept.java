package com.testpackage.collectionclass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollectionClassConcept {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(9);
        list.add(9);
        list.add(75);
        list.add(12);

        System.out.println("minimum value in list: " + Collections.min(list));
        System.out.println("maximum value in List: " + Collections.max(list));
        System.out.println("occurrence of value 9 in list: "+ Collections.frequency(list,9));

        //Sorting array (ascending order)
        Collections.sort(list);
        System.out.println(list);

        //reverse array (descending order)
        Collections.reverse(list);
        System.out.println(list);
    }
}
