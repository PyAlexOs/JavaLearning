package practice_17_24.practice_24.task_2;

public class TextDocument implements Document{
    @Override
    public void open() {
        System.out.println("Text document opened.");
    }

    @Override
    public void save() {
        System.out.println("Text document saved.");
    }
}
