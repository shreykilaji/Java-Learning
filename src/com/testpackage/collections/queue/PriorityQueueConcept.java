package com.testpackage.collections.queue;

/*
Priority queue is queue where elements are ordered based on priority,
not in the order they were added.
by Default, it gives smallest (natural order) element first, but we can customize order
using Comparator
 */
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueConcept {
    public static void main(String[] args){

        //by Default, it gives smallest (natural order) element first(Mean heap) using below syntax
        //Queue<Integer> pq = new PriorityQueue<>();

        //OR

        //To Reverse order from MEAN heap to MAX heap using-> Comparator.reverseOrder()
        Queue<Integer> pq =new PriorityQueue<>(Comparator.reverseOrder());

        //add element in Priority queue.
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        //removing element from Queue based on priority(12 will be removed)

        pq.poll();
        System.out.println(pq);

        //peek method to check which element will be removed next
        System.out.println(pq.peek());
    }
}
