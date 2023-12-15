package practice_17_24.practice_24.task_1;

public class MultifunctionalChair implements Chair {
    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Multifunctional chair");
    }
}
