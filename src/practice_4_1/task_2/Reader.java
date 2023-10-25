package practice_4_1.task_2;

import java.util.ArrayList;

import static java.lang.Integer.valueOf;

public class Reader {
    private int id;
    private String name;
    private int[] birthday;
    private String phone;
    private String department;

    Reader(int id, String name, int[] birthday, String phone, String department){
        this.id = id;
        this.name = name;

        this.birthday = new int[3];
        System.arraycopy(birthday, 0, this.birthday, 0, 3);

        this.phone = phone;
        this.department = department;
    }

    void takeBook(int average){
        System.out.println(this.name + " взял " + (valueOf(average)).toString() + " книг(-и).");
    }

    void takeBook(String[] books){
        System.out.print(this.name + " взял книги:");
        for (int i = 0; i < books.length; ++i){
            System.out.print(books[i]);
            if (i != books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    void takeBook(Book[] books){
        System.out.print(this.name + " взял книги:");
        for (int i = 0; i < books.length; ++i){
            System.out.print(books[i]);
            if (i != books.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    void returnBook(int average){
        System.out.println(this.name + " вернул " + (valueOf(average)).toString() + " книги.");
    }

    void returnBook(String[] books){
        System.out.print(this.name + " вернул книги:");
        for (int i = 0; i < books.length; ++i){
            System.out.print(books[i]);
            if (i != books.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    void returnBook(Book[] books){
        System.out.print(this.name + " вернул книги:");
        for (int i = 0; i < books.length; ++i){
            System.out.print(books[i]);
            if (i != books.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
