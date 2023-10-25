package practice_2.task_5;

import java.util.ArrayList;

public class DogsHome {
    private ArrayList<Dog> dogs = new ArrayList<>();

    public void add_dog(String name, int age){
        dogs.add(new Dog(name, age));
    }

    public void add_dogs(String[] names, int[] ages){
        for (int i = 0; i < names.length; ++i) {
            dogs.add(new Dog(names[i], ages[i]));
        }
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        for (Dog dog : dogs){
            list.append(dog.toString()).append("\n");
        }

        return list.toString();
    }
}
