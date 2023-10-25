package practice_2.task_1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Author first = new Author("Stephen Edwin King", "stKing@en.com", 'm');
        System.out.println(first.toString());

        System.out.print("You can add your author. Enter name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Gender (m/f): ");
        char gender = input.next().charAt(0);

        Author second = new Author(name, email, gender);
        System.out.println("Here it is.");
        System.out.println(second.toString());
    }
}
