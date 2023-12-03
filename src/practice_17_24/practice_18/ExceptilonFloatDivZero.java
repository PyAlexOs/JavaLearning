package practice_17_24.practice_18;

public class ExceptilonFloatDivZero {
    public static void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0);
        }
        catch (ArithmeticException e){
            System.out.println("Float division by zero");
        }
    }
}
