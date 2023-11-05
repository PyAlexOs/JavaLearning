package practice_9_16.practice_11;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year: ");
        int year = scanner.nextInt();

        System.out.print("Month: ");
        int month = scanner.nextInt() - 1;

        System.out.print("Day of month: ");
        int day = scanner.nextInt();

        System.out.print("Hours: ");
        int hours = scanner.nextInt();

        System.out.print("Minutes: ");
        int minutes = scanner.nextInt();


        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);
        Date date = calendar.getTime();

        System.out.println("Date object: " + date);
    }
}