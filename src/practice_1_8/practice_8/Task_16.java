package practice_1_8.practice_8;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        countMax(scanner, 0, 0);
    }

    public static void countMax(Scanner scanner, int max, int count){
        int number = scanner.nextInt();
        if (number != 0){
            if (max < number){
                max = number;
                count = 1;
            }
            else if (max == number){
                count++;
            }
            countMax(scanner, max, count);
        }
        else {
            System.out.println("Number " + max + " met " + count + " times.");
        }
    }
}
