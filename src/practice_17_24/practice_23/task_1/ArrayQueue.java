package practice_17_24.practice_23.task_1;

public class ArrayQueue extends ArrayQueueADT {
    ArrayQueue(int capacity){
        super(capacity);
    }

    @Override
    public void enqueue(ArrayQueueModule newModule) {
        if (size++ == capacity){
            System.out.println("The queue is full");
            return;
        }

        if (size == 0){
            this.head = newModule;
        }
        this.tail.setNext(newModule);
        this.tail = newModule;
        newModule.setNext(this.head);
    }

    @Override
    public ArrayQueueModule element() {
        return null;
    }

    @Override
    public ArrayQueueModule dequeue() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
