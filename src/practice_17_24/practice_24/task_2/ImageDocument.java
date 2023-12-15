package practice_17_24.practice_24.task_2;

public class ImageDocument implements Document{

    @Override
    public void open() {
        System.out.println("Image document opened.");
    }

    @Override
    public void save() {
        System.out.println("Image document saved.");
    }
}
