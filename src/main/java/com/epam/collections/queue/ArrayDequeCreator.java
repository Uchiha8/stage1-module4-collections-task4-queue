package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Initialize deque by adding two cards from each player
        deque.add(firstQueue.poll());
        deque.add(firstQueue.poll());
        deque.add(secondQueue.poll());
        deque.add(secondQueue.poll());

        // Continue moves until one of the queues is empty
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            // First player takes the top card and adds it to the end of their queue
            firstQueue.add(deque.poll());
            // First player adds two cards to deque
            deque.add(firstQueue.poll());
            deque.add(firstQueue.poll());

            // Second player takes the top card and adds it to the end of their queue
            secondQueue.add(deque.poll());
            // Second player adds two cards to deque
            deque.add(secondQueue.poll());
            deque.add(secondQueue.poll());
        }

        return deque;
    }
}
