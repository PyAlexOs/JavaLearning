package practice_9_16.practice_13.task_1;

public class Task_1 {
    public static void main(String[] args) {
        // null not equals ""
        Person[] people = {
                new Person("Основин", "Александр", "Игоревич"),
                new Person("Суховилов", "Павел", null),
                new Person(null, "Илья", "Михайлович"),
                new Person(null, "Максим", null)
        };

        for (Person p : people){
            System.out.println(p.getFullname());
        }
    }
}
