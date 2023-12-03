package practice_17_24.practice_17;

import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private static final AtomicInteger uniqueKey = new AtomicInteger(0);
    private final int id;
    private String role;
    private String name;

    public Student(String role, String name) {
        this.role = role;
        this.name = name;
        id = uniqueKey.incrementAndGet();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {return id; }
}
