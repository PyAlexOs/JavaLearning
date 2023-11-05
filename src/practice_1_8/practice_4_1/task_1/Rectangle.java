package practice_1_8.practice_4_1.task_1;

public class Rectangle extends Shape{
    private double width;
    private double length;

    Rectangle(){
        super();
        this.width = 0.0;
        this.length = 0.0;
    }

    Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Width: " + width +
                ". Length: " + length +
                ". Area: " + getArea() +
                ". Perimeter: " + getPerimeter() +
                ".\n";
    }

    public String _toString(){
        return super.toString();
    }
}
