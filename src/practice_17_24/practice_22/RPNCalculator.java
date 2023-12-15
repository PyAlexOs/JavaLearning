package practice_17_24.practice_22;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class RPNCalculator {
    public static void main(String[] args) {
        System.out.print("Enter the expression in Reverse Polish Notation: ");  // 2 3 4 5 6 * + - /
        Scanner scanner = new Scanner(System.in);
        String[] expr = scanner.nextLine().split(" ");

        Stack<Double> number = new Stack<>();
        try {
            for (String s : expr) {
                if (s.matches("^\\d+$")) {
                    number.add(Double.parseDouble(s));
                } else {
                    switch (s) {
                        case "+" -> number.add(number.pop() + number.pop());
                        case "*" -> number.add(number.pop() * number.pop());
                        case "-" -> {
                            double a = number.pop();
                            double b = number.pop();
                            number.add(b - a);
                        }
                        case "/" -> {
                            double a = number.pop();
                            double b = number.pop();
                            if (a == 0) {
                                number.add(.0);
                            } else {
                                number.add(b / a);
                            }
                        }
                    }
                }
            }
            if (number.size() > 1){
                throw new Exception("Extra number: " + number.pop());
            }
            System.out.printf("Expression result: %.4f", number.pop());
        }
        catch (Exception e){ // 8 8 * 9 + 8
            System.out.println("Invalid reverse polish notation record. Broken at:");
            System.err.println(e.toString());
        }
    }
}
