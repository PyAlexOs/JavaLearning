package practice_17_24.practice_24.task_1;

import java.util.Optional;

public class ChairFactory {
    public static Chair getChair(ChairAbstractFactory chairAbstractFactory) {
        return chairAbstractFactory.createChair();
    }
}
