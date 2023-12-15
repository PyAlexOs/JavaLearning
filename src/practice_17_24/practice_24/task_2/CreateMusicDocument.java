package practice_17_24.practice_24.task_2;

public class CreateMusicDocument implements CreateDocument{

    @Override
    public Document createNew() {
        System.out.print("New ");
        return new MusicDocument();
    }

    @Override
    public Document createOpen() {
        return new MusicDocument();
    }
}
