package practice_17_24.practice_18;

import java.util.Scanner;

public class ExceptionWhileInput {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        /*catch (Exception ignored){
            System.out.println("Broken(");
        }*/
        catch (NumberFormatException e){
            System.out.println("Ohhh... not an integer... " + e.toString() + " caught");
        }
        catch (ArithmeticException e){
            System.out.println("Uhhh... couldn't count this... " + e.toString() + " caught");
        }
        finally{
            System.out.println("Who cares...");
        }
    }
}
