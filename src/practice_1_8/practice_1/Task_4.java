package practice_1_8.practice_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args){
        with_while();
        //with_do_while();
    }

    public static void with_while(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");

        int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        byte index = 0;
        int[] numbers = new int [100];
        while (input.hasNextInt()){
            numbers[index] = input.nextInt();
            sum += numbers[index];

            if (max < numbers[index]){
                max = numbers[index];
            }
            if (min > numbers[index]){
                min = numbers[index];
            }
            index++;
        }

        System.out.printf("Sum of numbers: %s\n", sum);
        System.out.printf("Max number: %s\nMin number: %s", max, min);
    }

    public static void with_do_while(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");

        ArrayList<Integer> numbers = new ArrayList<>();
        do {
            numbers.add(input.nextInt());
        } while (input.hasNextInt());

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        int sum = 0;
        for (Integer num : numbers){
            sum += num;
        }

        System.out.printf("Sum of numbers: %s\n", sum);
        System.out.printf("Max number: %s\nMin number: %d", max, min);
    }
}
