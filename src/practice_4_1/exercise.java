package practice_4_1;

import practice_4_1.task_1.*;

public class exercise {
    public static void main(String[] args) {
        attempt();
    }

    public static void attempt() {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); //Circle version, because in fact this is Circle
        System.out.println(s1.getArea()); // abstract method, using Override
        System.out.println(s1.getPerimeter()); // abstract method, using Override
        System.out.println(s1.getColor()); // super's method
        System.out.println(s1.isFilled()); // super's method
        System.out.println(((Circle) s1).getRadius()); // Casting because superclass hasn't have this method

        Circle c1 = (Circle)s1;// Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape(); cannot be initialized because abstract class can't have entities
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast Rectangle to Shape
        System.out.println(s3); // abstract method, using Override
        System.out.println(s3.getArea()); // abstract method, using Override
        System.out.println(s3.getPerimeter()); // abstract method, using Override
        System.out.println(s3.getColor()); // super's method
        System.out.println(((Rectangle) s3).getLength()); // Casting because superclass hasn't have this method

        Rectangle r1 = (Rectangle) s3; //downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); //Upcast Square to Shape
        System.out.println(s4);
        System.out.println(s4.getArea()); // abstract method, using Override
        System.out.println(s4.getColor()); // super's method
        System.out.println(((Square) s4).getSide()); // Casting because superclass hasn't have this method

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea()); // rectangle method used
        System.out.println(r2.getColor()); // super's method
        System.out.println(((Square) r2).getSide()); // Casting because superclass hasn't have this method
        System.out.println(r2.getLength()); // rectangle method used

        Square sq1 = (Square)r2; // Downcast Rectangle r2 к Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }
}
