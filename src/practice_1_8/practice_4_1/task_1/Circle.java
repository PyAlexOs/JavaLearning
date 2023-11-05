package practice_1_8.practice_4_1.task_1;

import java.lang.Math;

public class Circle extends Shape {
    private double radius;

    Circle(){
        super();
        this.radius = 0.0;
    }

    Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Radius: " + radius +
                ". Area: " + getArea() +
                ". Perimeter: " + getPerimeter() +
                ".\n";
    }
}
