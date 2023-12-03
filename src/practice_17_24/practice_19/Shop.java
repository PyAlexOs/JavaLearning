package practice_17_24.practice_19;

import java.util.regex.Pattern;
import java.util.Scanner;

public class Shop {
    private final static Pattern pattern = Pattern.compile("^(\\d{10}|\\d{12})$");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter username: ");
        String name = scan.next();
        System.out.print("Enter individual tax number: ");
        String individualTaxNumber = scan.next();

        try {
            boolean isValid = isValidIndividualTaxNumber(individualTaxNumber);
            if (!isValid){
                throw new invalidIndividualTaxNumberException("Invalid individual tax number from '"
                        + individualTaxNumber + "'");
            }
            System.out.println("Payment successfully done.");

        } catch (invalidIndividualTaxNumberException e) {
            System.out.println(e.toString());
        }
    }

    public static boolean isValidIndividualTaxNumber(String IndividualTaxNumber) {
        return pattern.matcher(IndividualTaxNumber.trim()).matches();
    }
}
