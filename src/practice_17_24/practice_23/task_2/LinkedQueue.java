package practice_17_24.practice_23.task_2;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedQueue implements Queue{
    private LinkedList<ArrayQueueModule> list = new LinkedList<>();

    @Override
    public void enqueue(ArrayQueueModule newModule) {
        list.add(newModule);
    }

    @Override
    public ArrayQueueModule element() {
        return list.getFirst();
    }

    @Override
    public ArrayQueueModule dequeue() {
        return list.remove(0);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public void clear() {
        list = new LinkedList<ArrayQueueModule>();
    }

    @Override
    public String toString(){
        return this.list.toString();
    }
}
