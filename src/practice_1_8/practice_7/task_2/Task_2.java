package practice_1_8.practice_7.task_2;

public class Task_2 {
    public static void main(String[] args) {
        StringHandler handler = new StringHandler();
        String str = "ABCDEF";
        System.out.println("String length: " + handler.length(str));
        System.out.println("Odd chars string: " + handler.getOddChars(str));
        System.out.println("Reversed: " + handler.reverse(str));
    }
}
