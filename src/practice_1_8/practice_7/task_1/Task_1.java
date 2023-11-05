package practice_1_8.practice_7.task_1;

public class Task_1 {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();
        double radius = 22.4;
        System.out.println("Circle with radius: " + radius + " has length " +
                2 * math.PI * radius + "\n");
        double base = 2, i = 1.5;
        System.out.println("|" + base + " + " + i + "i| = " + math.mod(base, i));
    }
}
