package practice_17_24.practice_21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task_3{
    public static <T> List<T> dirs(String path){
        List<T> contents = new ArrayList<>();

        File directory = new File(path);
        if (directory.isDirectory()){
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files){
                    contents.add((T) file);
                }
            }
        }
        return contents;
    }

    public static void main(String[] args){
        String path = "./";
        List<File> dirs = dirs(path);

        int limit = Math.min(5, dirs.size());
        for (int i = 0; i < limit; i++) {
            System.out.println(dirs.get(i));
        }
    }
}
