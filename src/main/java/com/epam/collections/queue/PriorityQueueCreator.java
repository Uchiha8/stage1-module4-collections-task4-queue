package com.epam.collections.queue;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements from both lists to the priority queue
        priorityQueue.addAll(firstList);
        priorityQueue.addAll(secondList);

        return priorityQueue;
    }
}
