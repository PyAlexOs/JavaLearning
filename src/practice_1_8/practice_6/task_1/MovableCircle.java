package practice_1_8.practice_6.task_1;

class MovableCircle implements Movable{
    MovablePoint center;
    private int radius;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp(){
        center.moveUp();
    }

    @Override
    public void moveDown(){
        center.moveDown();
    }

    @Override
    public void moveLeft(){
        center.moveLeft();
    }

    @Override
    public void moveRight(){
        center.moveRight();
    }

    @Override
    public String toString(){
        return "Circle with radius: " + this.radius + ". " + center.toString();
    }
}
