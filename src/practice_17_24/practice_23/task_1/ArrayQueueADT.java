package practice_17_24.practice_23.task_1;

public abstract class ArrayQueueADT {
    protected int capacity;
    protected int size;
    protected ArrayQueueModule head;
    protected ArrayQueueModule tail;
    protected ArrayQueueModule[] modules;


    public ArrayQueueADT(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Queue size must be greater than zero.");
        }
        this.capacity = capacity;
        this.size = 0;
        this.head = null;
        this.tail = null;
        this.modules = new ArrayQueueModule[this.capacity];
    }


    public abstract void enqueue(ArrayQueueModule newModule);
    public abstract ArrayQueueModule element();
    public abstract ArrayQueueModule dequeue();
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract void clear();
}
