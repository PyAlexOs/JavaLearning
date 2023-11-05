package practice_9_16.practice_13.task_3;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Task_3 {
    // D:/МИРЭА/Java Projects/Learning/files/words.txt
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input filename: ");
        String filename = scanner.nextLine();

        StringBuilder words = new StringBuilder();
        try (BufferedReader file = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = file.readLine()) != null){
                words.append(line);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Words from file:");
        for (String word : words.toString().split(" ")){
            System.out.printf("%s\t", word);
        }

        words = getLine(words.toString().split(" "));
        System.out.println("\nSorted words:");
        for (String word : words.toString().split(" ")){
            System.out.printf("%s\t", word);
        }
    }

    public static StringBuilder getLine(String[] words) {
        ArrayList<String> list = new ArrayList<>(List.of(words));
        StringBuilder sb = new StringBuilder();

        sb.append(list.get(0));
        list.remove(0);
        char next = sb.toString().toLowerCase().charAt(sb.length() - 1);
        sb.append(" ");

        while (!list.isEmpty()) {
            boolean haveMore = false;
            for (String str : list) {
                char ch = str.toLowerCase().charAt(0);
                if (ch == next) {
                    sb.append(str).append(" ");
                    list.remove(str);
                    next = str.toLowerCase().charAt(str.length() - 1);
                    haveMore = true;
                    break;
                }
            }
            if (!haveMore) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb;
    }
}
