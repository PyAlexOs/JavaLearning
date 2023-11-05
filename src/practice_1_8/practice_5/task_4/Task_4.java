package practice_1_8.practice_5.task_4;

public class Task_4 {
    public static void main(String[] args) {
        App app = new App();
        Thread animation = new Thread(app);
        animation.start();
    }
}
