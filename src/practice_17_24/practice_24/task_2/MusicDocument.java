package practice_17_24.practice_24.task_2;

public class MusicDocument implements Document{
    @Override
    public void open() {
        System.out.println("Music document opened.");
    }

    @Override
    public void save() {
        System.out.println("Music document saved.");
    }
}
