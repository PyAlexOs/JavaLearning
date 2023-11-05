package practice_9_16.practice_13.task_2;

public class PhoneNumber {
    public static String convert(String number){
        return new StringBuilder().append("+").append(number.charAt(0) == '+' ? number.substring(1, number.length() - 10 + 3) : number.substring(0, number.length() - 10 + 3)).append("-").append(number, number.length() - 10 + 3, number.length() - 10 + 6).append("-").append(number.substring(number.length() - 10 + 6)).toString();
    }
}
