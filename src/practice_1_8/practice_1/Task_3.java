package practice_1_8.practice_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter average of numbers: ");

        int size = input.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter numbers: ");

        float sum = 0f;
        for (int i = 0; i < size; ++i) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        System.out.printf("Sum of numbers: %.0f\n", sum);
        System.out.printf("Mean of numbers: %.2f", sum / size);
    }
}
