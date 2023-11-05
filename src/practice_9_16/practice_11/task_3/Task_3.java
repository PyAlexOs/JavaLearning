package practice_9_16.practice_11.task_3;

import java.time.LocalDate;

public class Task_3 {
    public static void main(String[] args){
        Student student = new Student("Антонов", LocalDate.of(2008, 4, 7));
        System.out.println(student);

        student.setBirthDate(LocalDate.of(2002, 9, 16));
        System.out.println(student);
    }
}
