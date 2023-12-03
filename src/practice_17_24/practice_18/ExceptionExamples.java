package practice_17_24.practice_18;

public class ExceptionExamples {
    public static void main(String[] args) {
        TryCatchArithmeticException();
        TryCatchExceptionWhileInput();
    }

    public static void TryCatchArithmeticException(){
        ExceptilonIntDivZero.exceptionDemo();
        ExceptilonFloatDivZero.exceptionDemo();
    }

    public static void TryCatchExceptionWhileInput(){
        ExceptionWhileInput.exceptionDemo();
    }
}
