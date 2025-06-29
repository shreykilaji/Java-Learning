package com.testpackage.collections.queue;

/*We can Implement Queue Interface using LinkedList Class
 import Queue in code
 import LinkedList class-> this class has three main methods to be used
 offer() ->to add element in queue
 poll() -> Delete/ remove element from queue
 peek() -> returns which next element to be deleted/removed from queue.
 */
import java.util.Queue;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Adding element in Queue-> using offer() method of linkedList class
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue);

        //Returns Delete/remove element from Queue-> using poll() method
        System.out.println(queue.poll());

        System.out.println(queue);

        //Returns which next element to be removed/deleted-> using peek() method
        System.out.println(queue.peek());
    }
}
