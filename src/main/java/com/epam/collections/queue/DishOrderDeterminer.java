package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> order = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        // Initialize queue with dish numbers
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        // Process dishes
        while (!queue.isEmpty()) {
            // Move (everyDishNumberToEat - 1) dishes to the end of the queue
            for (int i = 1; i < everyDishNumberToEat; i++) {
                queue.add(queue.poll());
            }
            // Eat the selected dish
            order.add(queue.poll());
        }

        return order;
    }
}
