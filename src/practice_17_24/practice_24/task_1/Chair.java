package practice_17_24.practice_24.task_1;

import java.util.concurrent.atomic.AtomicInteger;

public interface Chair {
    static final AtomicInteger uniqueKey = new AtomicInteger(0);
    final int serialNumber = uniqueKey.incrementAndGet();
    void sit();
}
