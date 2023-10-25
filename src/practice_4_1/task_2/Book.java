package practice_4_1.task_2;

public class Book {
    private String name;
    private String author;

    Book(){
        this.name = "undefined";
        this.author = "undefined";
    }

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
