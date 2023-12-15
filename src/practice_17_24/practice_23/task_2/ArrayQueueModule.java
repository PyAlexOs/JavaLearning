package practice_17_24.practice_23.task_2;

public class ArrayQueueModule {
    private int value;
    private ArrayQueueModule nextModule;

    public ArrayQueueModule(int value) {
        this.value = value;
        this.nextModule = null;
    }

    public int getValue() {
        return value;
    }

    public ArrayQueueModule getNextModule() {
        return nextModule;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNextModule(ArrayQueueModule nextModule) {
        this.nextModule = nextModule;
    }

    @Override
    public String toString(){
        return String.valueOf(this.value);
    }
}
