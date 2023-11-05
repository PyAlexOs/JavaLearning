package practice_1_8.practice_1;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to count factorial: ");
        int number = input.nextInt();

        if (number < 0){
            System.out.println("The number must be positive.");
            System.exit(0);
        }

        long factorial = count_factorial(number);
        System.out.printf("Factorial: %d", factorial);
    }

    public static long count_factorial(int number){
        long factorial = 1;
        while (number > 1){
            factorial *= number;
            number -= 1;
        }

        return factorial;
    }
}
