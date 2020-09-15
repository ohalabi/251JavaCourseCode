import java.util.ArrayList;

/**
 * Created by Osama Halabi on 2020/09/15.
 */
public class Library {
    ArrayList<Book> books;

    Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle))
                return book;
        }
        return null;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

}
