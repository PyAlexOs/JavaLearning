package practice_9_16.practice_9.task_3;

public class Task_3 {
    public static void main(String[] args) {
        Student[] students1 = new Student[3];
        Student[] students2 = new Student[3];
        students1[0] = new Student(150, "Петр Галопов", 4.95);
        students1[1] = new Student(78, "Валентин Алазаев", 3.8);
        students1[2] = new Student(122, "Глеб Петров", 4.2);
        students2[0] = new Student(3, "Александр Бургулов", 5.0);
        students2[1] = new Student(14, "Павел Васильев", 2.96);
        students2[2] = new Student(41, "Дмитрий Иванов", 4.72);

        System.out.println("Students from first class:");
        print(students1);
        System.out.println("Students from second class:");
        print(students2);

        StudentComparator comparator = new StudentComparator();
        Student[] students = comparator.sort(students1, students2);

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
