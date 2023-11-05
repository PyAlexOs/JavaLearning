package practice_1_8.practice_2.task_2;

import java.util.Scanner;
import java.util.Random;

public class TestBall {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Ball ball = new Ball();
        System.out.printf("Initialized: %s\n", ball.toString());
        ball.setXY(10.5, 12.6);
        System.out.printf("Teleported: %s\n", ball.toString());

        for (int i = 0; i < 10; ++i) {
            ball.move(random.nextDouble(-10, 10), random.nextDouble(-10, 10));
            System.out.println(ball.toString());
            Thread.sleep(1000);
        }
    }
}
