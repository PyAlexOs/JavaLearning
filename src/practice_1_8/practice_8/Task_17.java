package practice_1_8.practice_8;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getMax(scanner, 0);
    }

    public static void getMax(Scanner scanner, int max){
        int number = scanner.nextInt();
        if (number != 0){
            if (max < number) {
                max = number;
            }
            getMax(scanner, max);
        }
        else {
            System.out.println("Largest number: " + max);
        }
    }
}
