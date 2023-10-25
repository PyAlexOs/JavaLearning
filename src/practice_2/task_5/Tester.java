package practice_2.task_5;

public class Tester {
    public static void main(String[] args) {
        DogsHome home = new DogsHome();
        home.add_dog("Peter", 3);

        String[] names = {"Perry", "Alex", "Hugo"};
        int[] ages = {4, 8, 5};
        home.add_dogs(names, ages);
        System.out.print(home.toString());
    }
}
