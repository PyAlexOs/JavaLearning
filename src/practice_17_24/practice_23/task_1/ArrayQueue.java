package practice_17_24.practice_23.task_1;

import java.util.Arrays;

public class ArrayQueue extends ArrayQueueADT {
    ArrayQueue(int capacity){
        super(capacity);
    }

    @Override
    public void enqueue(ArrayQueueModule newModule) {
        if (size == capacity){
            System.out.println("The queue is full.");
            return;
        }

        if (size == 0){
            this.head = this.tail = newModule;
        }
        this.modules[size] = newModule;
        this.tail.setNextModule(newModule);
        this.tail = newModule;
        newModule.setNextModule(this.head);
        ++size;
    }

    @Override
    public ArrayQueueModule element() {
        return this.head;
    }

    @Override
    public ArrayQueueModule dequeue() {
        if (this.head == null){
            return null;
        }
        if (head.getNextModule() == null){
            ArrayQueueModule toReturn = this.head;
            this.head = this.tail = null;
            this.modules[--size] = null;
            return toReturn;
        }
        ArrayQueueModule toReturn = this.head;
        --size;
        for (int i = 0; i < size; i++) {
            this.modules[i] = this.modules[i + 1];
        }
        this.modules[size] = null;
        this.modules[size - 1].setNextModule(this.modules[0]);
        this.head = this.modules[0];
        return toReturn;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.head = this.tail = null;
        this.modules = new ArrayQueueModule[capacity];
    }

    @Override
    public String toString(){
        return Arrays.toString(this.modules);
    }
}
