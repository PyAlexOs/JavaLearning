package practice_17_24.practice_24.task_2;

public class CreateImageDocument implements CreateDocument{
    @Override
    public Document createNew() {
        System.out.print("New ");
        return new ImageDocument();
    }

    @Override
    public Document createOpen() {
        return new ImageDocument();
    }
}
