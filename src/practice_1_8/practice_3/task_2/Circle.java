package practice_1_8.practice_3.task_2;

public class Circle implements Comparable<Circle>{
    Point center;
    double radius;
    char colour;

    public Circle(double x, double y, double radius, char colour) {
        this.center = new Point(x, y);
        this.radius = radius;
        this.colour = colour;
    }

    public Circle(double radius, char colour) {
        this.center = new Point();
        this.radius = radius;
        this.colour = colour;
    }

    public Circle(double radius) {
        this.center = new Point();
        this.radius = radius;
        this.colour = '-';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public char getColour() {
        return colour;
    }

    public void setColour(char colour) {
        this.colour = colour;
    }

    @Override
    public int compareTo(Circle object){
        return ((int) (this.radius * 1000) - (int) (object.getRadius() * 1000));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center={" + center.getX() + ", " + center.getY() + "}" +
                ", radius=" + radius +
                ", colour=" + colour +
                '}';
    }
}
