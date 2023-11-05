package practice_9_16.practice_11;

import java.util.Calendar;
import java.util.Date;

public class Task_1 {
    public static void main(String[] args) {
        String developer  = "Osnovin";
        Date start = new Date(123, Calendar.OCTOBER, 22, 17, 24, 21);
        Date end = new Date();

        System.out.printf("Developer %s:\n\t%s task taken\n\t%s task passed", developer, start.toString(), end.toString());
    }
}
