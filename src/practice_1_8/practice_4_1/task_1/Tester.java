package practice_1_8.practice_4_1.task_1;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Random random = new Random();

        String[] colors = {"yellow", "red", "green", "blue", "white", "black"};
        for (int i = 0; i < 3; ++i) {
            Shape a = new Rectangle(random.nextDouble(0, 100), random.nextDouble(0, 100),
                    colors[random.nextInt(0, 6)], random.nextBoolean());
            Shape b = new Square(random.nextDouble(0, 100), colors[random.nextInt(0, 6)],
                    random.nextBoolean());
            Shape c = new Circle(random.nextDouble(0, 100), colors[random.nextInt(0, 6)],
                    random.nextBoolean());

            System.out.print(a.toString());
            System.out.print(b.toString());
            System.out.print(c.toString());
        }
    }
}
