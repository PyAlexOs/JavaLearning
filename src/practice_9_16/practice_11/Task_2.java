package practice_9_16.practice_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(now);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input date and time (pattern: dd/MM/yyyy HH:mm:ss): ");
        String input = scanner.nextLine();

        Date inputDate = null;
        try {
            inputDate = dateFormat.parse(input);
        } catch (ParseException e){
            System.out.println("Incorrect date format.");
            System.exit(0);
        }

        int result = now.compareTo(inputDate);
        if (result > 0) {
            System.out.println("Input date was earlier.");
        }
        else if (result < 0) {
            System.out.println("Input date will be soon.");
        }
        else{
            System.out.println("Input date is actually real time.");
        }
    }
}
