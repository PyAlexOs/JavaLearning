package practice_1_8.practice_3;

import java.util.ArrayList;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 4; ++i){
            nums.add(random.nextInt(10, 100));
        }

        System.out.println("Nums: " + nums.toString());
        if (nums.stream().sorted().toList().equals(nums)){
            System.out.println("Nums already sorted.");
            System.exit(0);
        }
        System.out.println("Nums not sorted.");
    }
}
