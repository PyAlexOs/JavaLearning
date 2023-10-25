package practice_2;

import java.util.ArrayList;

public class Task_8 {
    public static void main(String[] args) {
        String[] array = {"aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg"};
        show(array);

        String temp;
        for (int i = 0; i < array.length / 2; ++i){
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        show(array);
    }

    public static void show(String[] array){
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + "   ");
        }
        System.out.print("\n");
    }
}
