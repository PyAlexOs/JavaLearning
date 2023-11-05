package practice_1_8.practice_2.task_3;

public class Circle {
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
    public String toString() {
        return "Circle{" +
                "center={" + center.getX() + ", " + center.getY() + "}" +
                ", radius=" + radius +
                ", colour=" + colour +
                '}';
    }
}
