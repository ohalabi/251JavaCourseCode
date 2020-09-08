import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private String bookTitle;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public static void main(String[] args) {
        Book[] myLibrary = new Book[3]; // array of objects

        Book a = new Book("Java Programming");
        myLibrary[0] = a;

        Book b = new Book("Python Programming");
        myLibrary[1] = b;

        myLibrary[2] = new Book("C++ Programming");

        for (var temp: myLibrary) {
            System.out.println(temp.getBookTitle());
        }
    }
}
