package practice_2.task_6;

import java.sql.Array;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class CircleTest {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of circles: ");
        int amount = input.nextInt();

        boolean status = false;
        ArrayList<Circle> list = new ArrayList<Circle>();
        for (int i = 0; i < amount; ++i) {
            list.add(new Circle(random.nextDouble(-100, 100), random.nextDouble(-100, 100),
                    random.nextDouble(0.5, 10)));
            for (int j = 0; j < i; ++j){
                if (list.get(i).equals(list.get(j))) {
                    status = true;
                    break;
                }
            }
        }

        Collections.sort(list);
        for (Circle circle : list){
            System.out.println(circle.toString());
        }

        if (status){
            System.out.println("Wow! Here is few similar circles!");
        }
        else{
            System.out.println("There is no similar circles(");
        }
    }
}
