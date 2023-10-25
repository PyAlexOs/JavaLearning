package practice_2.task_3;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Random random = new Random();
        int average = random.nextInt(2, 15);
        Circle[] balls = new Circle[average];
        for (int i = 0; i < average; ++i) {
            balls[i] = new Circle(random.nextDouble(-10, 10), random.nextDouble(-10, 10),
                    random.nextDouble(0, 10), (char) random.nextInt(97, 122));
            System.out.println(balls[i].toString());
        }
    }
}
