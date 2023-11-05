package practice_1_8.practice_2;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        if (args.length != 0){
            System.out.printf("You entered %d word(-s).", args.length);
        }

        else {
            Scanner input = new Scanner(System.in);
            String[] words = (input.nextLine()).split(" +");

            System.out.printf("You entered %d word(-s).", words.length);
        }
    }
}
