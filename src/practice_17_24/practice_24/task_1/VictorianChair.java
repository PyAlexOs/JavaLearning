package practice_17_24.practice_24.task_1;

public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void sit() {
        System.out.println("Victorian chair");
    }
}
