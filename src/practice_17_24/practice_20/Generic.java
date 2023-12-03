package practice_17_24.practice_20;

import java.awt.*;
import java.util.Collection;

public class Generic<T, V, K>{
    private T first;
    private V second;
    private K third;

    Generic(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void printTypes() {
        System.out.println(
                "Имя первого класса: " + first.getClass() + " значение: " + first + "\n" +
                "Имя второго класса: " + second.getClass() + " значение: " + second + "\n" +
                "Имя третьего класса: " + third.getClass() + " значение: " + third + "\n"
        );
    }

    public static void main(String[] args) {
        Generic<String, Integer, Double> gen = new Generic<>("One", 2, 3.0);
        gen.printTypes();
    }
}