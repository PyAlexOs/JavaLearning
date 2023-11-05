package practice_9_16.practice_9.task_1;

public class Task_1 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(150, "Петр Галопов");
        students[1] = new Student(78, "Валентин Алазаев");
        students[2] = new Student(122, "Глеб Петров");
        students[3] = new Student(3, "Александр Бургулов");
        students[4] = new Student(14, "Павел Васильев");

        System.out.println("Students:");
        print(students);

        //Arrays.sort(students, Student::compareTo);
        sort(students);

        System.out.println("Sorted students:");
        print(students);
    }

    public static void sort(Student[] students){
        for (int i = 1; i < students.length; ++i){
            Student temp = students[i];
            int j = i;

            while (j > 0 && students[j - 1].compareTo(temp) > 0){
                students[j] = students[j - 1];
                j--;
            }
            students[j] = temp;
        }
    }

    public static void print(Student[] students){
        for (Student student : students){
            System.out.printf("%-5s%30s\n", (student.getId() + ":"), student.getName());
        }
        System.out.println();
    }
}
