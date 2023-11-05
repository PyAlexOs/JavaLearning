package practice_1_8.practice_6.task_1;

public class Task_1 {
    public static void main(String[] args) throws InterruptedException {
        Movable point = new MovablePoint(0, 0, 1, 1);
        System.out.println(point.toString());
        point.moveUp();
        System.out.println(point.toString());
        point.moveRight();
        System.out.println(point.toString());
        System.out.println();
        Thread.sleep(1000);

        Movable circle = new MovableCircle(0, 0, 3, 2, 10);
        System.out.println(circle.toString());
        circle.moveUp();
        System.out.println(circle.toString());
        circle.moveRight();
        System.out.println(circle.toString());
        System.out.println();
        Thread.sleep(1000);

        Movable rect = new MovableRectangle(0, 0, 10, 10, 5, 7);
        System.out.println(rect.toString());
        rect.moveUp();
        System.out.println(rect.toString());
        rect.moveRight();
        System.out.println(rect.toString());
    }
}

