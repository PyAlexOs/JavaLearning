package practice_17_24.practice_23.task_2;

public interface Queue {
    void enqueue(ArrayQueueModule newModule);
    ArrayQueueModule element();
    ArrayQueueModule dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
