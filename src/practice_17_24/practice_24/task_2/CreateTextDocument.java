package practice_17_24.practice_24.task_2;

public class CreateTextDocument implements CreateDocument{

    @Override
    public Document createNew() {
        System.out.print("New ");
        return new TextDocument();
    }

    @Override
    public Document createOpen() {
        return new TextDocument();
    }
}


// Конкретная фабри