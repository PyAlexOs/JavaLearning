package practice_1_8.practice_4_1.task_1;

public abstract class Shape {
    protected String color;
    protected Boolean filled;

    public String getColor() {
        return color;
    }
    public Boolean isFilled(){ return filled; }

    Shape() {
        this.color = "None";
        this.filled = false;
    }

    Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public abstract String getType();

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        String way = "circled in ";
        if (filled){
            way = "filled with ";
        }

        return getType() + " " + way + color + " color.";
    }
}
