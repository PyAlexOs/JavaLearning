package practice_17_24.practice_23.task_2;

import practice_17_24.practice_23.task_1.ArrayQueue;

public class Task_2 {
    public static void main(String[] args) {
        int[] toPush = {1, 5, 7, 3, 2, 8};
        LinkedQueue queue = new LinkedQueue();

        System.out.println(queue.isEmpty() ? "Queue is empty" : "Queue isn't empty");
        for (int number : toPush){
            System.out.println("Trying to push to queue: " + number);
            queue.enqueue(new ArrayQueueModule(number));
        }

        System.out.println("\n" + (queue.isEmpty() ? "Queue is empty" : "Queue isn't empty"));
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue: " + queue);

        System.out.println("\nFirst element pop: " + queue.dequeue().getValue());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue: " + queue);

        System.out.println("\nNew first element: " + queue.element().getValue());
        System.out.println("Clear queue");
        queue.clear();
        System.out.println(queue.isEmpty() ? "Queue is empty" : "Queue isn't empty");
    }
}
