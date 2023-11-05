package practice_1_8.practice_6.task_1;

class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp(){
        y -= ySpeed;
    }

    @Override
    public void moveDown(){
        y += ySpeed;
    }

    @Override
    public void moveLeft(){
        x -= ySpeed;
    }

    @Override
    public void moveRight(){
        x += ySpeed;
    }

    @Override
    public String toString(){
        return "Point at {" + this.x + ";" + this.y + "} moving with speed: " +
                Math.pow((Math.pow(this.xSpeed, 2) + Math.pow(this.ySpeed, 2)), 0.5) + ".";
    }
}
