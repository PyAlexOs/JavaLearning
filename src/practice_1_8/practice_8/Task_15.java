package practice_1_8.practice_8;

public class Task_15 {
    public static void main(String[] args) {
        print(123456);
    }

    public static void print(int number){
        if (number > 0) {
            System.out.print(number % 10);
            print(number / 10);
        }
    }
}

