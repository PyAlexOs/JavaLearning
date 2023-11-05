package practice_9_16.practice_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {
    public static void main(String[] args) {
        String text = "(1 + 8) - 9 / 4";
        Pattern pattern = Pattern.compile("(\\d)(?!\\s*\\+)");
        Matcher matcher = pattern.matcher(text);

        boolean status = false;
        while (matcher.find()){
            if (!status){
                System.out.println("There is some digits without \"+\" after itself:");
            }
            status = true;
            System.out.println(matcher.group(0));
        }

        if (!status){
            System.out.println("There is not any digits without \"+\" after itself.");
        }
    }
}
