package practice_17_24.practice_21;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    public static <T> List<T> convert(T[] arr){
        List<T> list = new ArrayList<>();
        for (T a : arr){
            list.add(a);
        }
        return list;
    }


    public static void main(String[] args){
        String[] arr1 = {"word1", "word2", "word3"};
        Integer[] arr2 = {1, 2, 3};
        List<String> newArr1 = convert(arr1);
        List<Integer> newArr2 = convert(arr2);
        System.out.println(newArr1);
        System.out.println(newArr2);
    }
}
