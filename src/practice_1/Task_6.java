package practice_1;

public class Task_6 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; ++i) {
            System.out.printf("1/%d     ", i);
        }

        for (int j = 0; j < 3; ++j) {
            System.out.print("\n");
            for (int i = 1; i < 11; ++i) {
                if (j == 0) {
                    System.out.print("1   ");
                } else if (j == 1) {
                    if (i != 10) {
                        System.out.print("- + ");
                    }
                    else{
                        System.out.print("-");
                    }
                } else {
                    System.out.print(i + "   ");
                }
            }
        }
    }
}