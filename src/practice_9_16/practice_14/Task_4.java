package practice_9_16.practice_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_4 {
    public static void main(String[] args) {
        String[] emails = {
                "user@example.com",
                "root@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String"
        };

        Pattern pattern = Pattern.compile("^(?!\\.|.*\\.\\.)[a-zA-Z0-9.]+(?!\\.)@[a-zA-Z0-9.]+\\.?[a-zA-Z]+$");
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()){
                System.out.printf("Validated: %s\n", email);
            }
            else{
                System.out.printf("Invalid email: %s\n", email);
            }
        }
    }
}
