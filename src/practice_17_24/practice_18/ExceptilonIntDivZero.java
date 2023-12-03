package practice_17_24.practice_18;

public class ExceptilonIntDivZero {
    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        }
        catch (ArithmeticException e){
            System.out.println("Int division by zero");
        }
    }
}
