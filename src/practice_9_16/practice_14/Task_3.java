package practice_9_16.practice_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {
    public static void main(String[] args) {
        String[] dates = {
                "29/02/2000",
                "30/04/2003",
                "29/02/2001",
                "30-04-2003",
                "1/1/1899"
        };

        Pattern pattern = Pattern.compile("^(0[1-9]|1[0-9]|2[0-8]|30(?!/02)|31(?=/0[13578]|/1[02])|29(?!/02)|29(?=/02/[13579][26]00|/02/[2468][048]00|/02/\\d{2}[2468][048]|/02/\\d{2}0[48]|/02/\\d{2}[13579][26]))/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})$");
        for (String date : dates) {
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches()){
                System.out.printf("Validated: %s\n", date);
            }
            else{
                System.out.printf("Invalid date: %s\n", date);
            }
        }
    }
}
