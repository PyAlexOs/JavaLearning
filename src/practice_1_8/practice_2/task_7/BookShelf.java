package practice_1_8.practice_2.task_7;

import java.util.ArrayList;
import java.util.Collections;

public class BookShelf {
    int amount;
    ArrayList<Book> books;

    public BookShelf(int amount) {
        this.amount = amount;
        this.books = new ArrayList<>();
    }

    public boolean add(String name, String author, String publishing_house, int released){
        if (books.size() == this.amount){
            return false;
        }

        boolean status = true;
        for (Book book : books){
            if (book.getName().equals(name) && book.getPublishing_house().equals(publishing_house) &&
                    book.getAuthor().equals(author) && book.getReleased() == released){
                status = false;
            }
        }

        if (status){
            books.add(new Book(name, author, publishing_house, released));
        }

        return status;
    }

    public Book getEarliest(){
        ArrayList<Book> copy = new ArrayList<>(books);
        Collections.sort(copy);
        return copy.get(0);
    }

    public Book getLatest(){
        ArrayList<Book> copy = new ArrayList<>(books);
        Collections.sort(copy);
        return copy.get(copy.size() - 1);
    }

    public void sort(){
        Collections.sort(books);
    }

    @Override
    public String toString() {
        if (books.isEmpty()){
            return "There isn't any books yet.\n";
        }

        StringBuilder line = new StringBuilder("There is " + books.size() + " books on your shelf:\n");
        for (Book book : books){
            line.append(book.toString()).append("\n");
        }

        return line.toString();
    }
}
