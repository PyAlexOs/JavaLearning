package practice_17_24.practice_23.task_1;

public class Task_1 {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        System.out.println("Пуста ли очередь: " + queue.isEmpty());
        System.out.println("add in queue");
        queue.enqueue(new ArrayQueueModule(1));
        queue.enqueue(new ArrayQueueModule(5));
        queue.enqueue(new ArrayQueueModule(7));
        queue.enqueue(new ArrayQueueModule(1));
        queue.enqueue(new ArrayQueueModule(5));
        queue.enqueue(new ArrayQueueModule(7));
        System.out.println("Размер очереди: " + queue.size());
        System.out.println("Первый элемент: " + queue.element().getValue());
        System.out.println("Удаление первого элемента: " + queue.dequeue().getValue());
        System.out.println("Размер очереди: " + queue.size());
        System.out.println("Первый элемент: " + queue.element().getValue());
        System.out.println("Пуста ли очередь: " + queue.isEmpty());
        System.out.println("clear queue");
        queue.clear();
        System.out.println("Пуста ли очередь: " + queue.isEmpty());
    }
}
