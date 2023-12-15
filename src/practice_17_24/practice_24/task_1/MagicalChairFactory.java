package practice_17_24.practice_24.task_1;

public class MagicalChairFactory implements ChairAbstractFactory {
    @Override
    public Chair createChair() {
        return new MagicalChair();
    }
}
