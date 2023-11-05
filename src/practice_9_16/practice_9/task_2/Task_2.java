package practice_9_16.practice_9.task_2;

public class Task_2 {
    // Относительное сравнение compareTo и абсолютное compare
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(150, "Петр Галопов", 4.95);
        students[1] = new Student(78, "Валентин Алазаев", 3.8);
        students[2] = new Student(122, "Глеб Петров", 4.2);
        students[3] = new Student(3, "Александр Бургулов", 5.0);
        students[4] = new Student(14, "Павел Васильев", 2.96);

        System.out.println("Students:");
        print(students);

        StudentComparator comparator = new StudentComparator();
        comparator.quickSort(students, 0, students.length - 1);

        System.out.println("Sorted students:");
        print(students);
    }

    public static void print(Student[] students){
        for (Student student : students){
            System.out.printf("%-5s%30s%10.2f\n", (student.getId() + ":"), student.getName(), student.getRate());
        }
        System.out.println();
    }
}
