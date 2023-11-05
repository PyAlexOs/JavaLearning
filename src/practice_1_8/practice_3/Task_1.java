package practice_1_8.practice_3;

import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(1, 10);
        double[] mas_1 = new double[size];
        double[] mas_2 = new double[size];

        for (int i = 0; i < size; ++i){
            mas_1[i] = random.nextDouble(0, 100);
            mas_2[i] = Math.random();
        }

        System.out.println("1-st: " + Arrays.toString(mas_1));
        System.out.println("2-nd: " + Arrays.toString(mas_2));

        Arrays.sort(mas_1);
        Arrays.sort(mas_2);

        System.out.println("\n1-st sorted: " + Arrays.toString(mas_1));
        System.out.println("2-nd sorted: " + Arrays.toString(mas_2));
    }
}
