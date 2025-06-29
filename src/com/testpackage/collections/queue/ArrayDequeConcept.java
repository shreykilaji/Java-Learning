package com.testpackage.collections.queue;

import java.util.ArrayDeque;

public class ArrayDequeConcept {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offer(10); // Queue's method to add element at rear end
        deque.offerFirst(20); //ArrayDeque's method  to add element at front end
        deque.offerLast(30); //ArrayDeque's method  to add element at last end
        deque.offer(40); // Queue's method to add element at rear end

        System.out.println(deque);

        //peek element in Queue using ArrayDeque & Queue methods
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque);

        //delete element from Queue using ArrayDeque & Queue methods
        System.out.println(deque.poll());// Queue's method to delete element
        System.out.println(deque.pollFirst()); //ArrayDeque's method  to delete element at front end
        System.out.println(deque.pollLast()); //ArrayDeque's method  to delete element at rear end
        System.out.println(deque);
    }
}
