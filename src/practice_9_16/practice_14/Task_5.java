package practice_9_16.practice_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_5 {
    public static void main(String[] args) {
        String[] passwords = {
                "F032_Password",
                "TrySpy11",
                "A007",
                "qwerty"
        };

        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9_]{8,}$");
        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()){
                System.out.println(password + " is cool password!");
            }
            else{
                System.out.println(password + " is bad.");
            }
        }
    }
}
