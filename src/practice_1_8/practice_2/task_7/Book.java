package practice_1_8.practice_2.task_7;

public class Book implements Comparable<Book>{
    private String author;
    private String name;
    private String publishing_house;
    private int released;

    public Book(String author, String name, String publishing_house, int released) {
        this.author = author;
        this.name = name;
        this.publishing_house = publishing_house;
        this.released = released;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishing_house() {
        return publishing_house;
    }

    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }

    @Override
    public int compareTo(Book object){
        return this.released - object.released;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", publishing_house='" + publishing_house + '\'' +
                ", released=" + released +
                '}';
    }
}
