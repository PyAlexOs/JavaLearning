package practice_9_16.practice_14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task_1 {
    public static void main(String[] args) {
        String text = "Price list: 25.98 USD,\t1000 RUB,\t44 ERR,\t0.004 EU,\t100 EUR,\t130.25 RUB";
        Pattern pattern = Pattern.compile("(\\d+(\\.\\d{1,4})?) (USD|EUR|RUB)"); // ?=
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group(3) + ": " + matcher.group(1));
        }
    }
}
