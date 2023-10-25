package practice_4_1.task_1;

public class Square extends Rectangle{
    private double side;

    Square(){
        super();
        this.side = 0.0;
    }

    public Square(double side){
        super(side, side);
        this.side = side;

    }

    Square(double side, String color, Boolean filled){
        super(side, side, color, filled);
        this.side = side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
        this.side = side;
    }

    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
        this.side = side;
    }

    @Override
    public String toString() {
        return super._toString() +
                " Side: " + side +
                ". Area: " + getArea() +
                ". Perimeter: " + getPerimeter() +
                ".\n";
    }
}
