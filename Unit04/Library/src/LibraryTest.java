import java.util.ArrayList;

/**
 * Created by Osama Halabi on 2020/09/15.
 */
public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        // Creating the Objects of Book class.
//        Book book = new Book("Effective Java", "Joshua Bloch");
        library.addBook(new Book("Effective Java", "Joshua Bloch"));

//        book = new Book("Thinking in Java", "Bruce Eckel");
        library.addBook(new Book("Thinking in Java", "Bruce Eckel"));

//        book = new Book("Java: The Complete Reference", "Herbert Schildt");
        library.addBook(new Book("Java: The Complete Reference", "Herbert Schildt"));

        Book abook = library.getBook("Thinking in Java");

        System.out.printf("%s is authored by %s \n", abook.getTitle(),
                abook.getAuthor());

        ArrayList<Book> books = library.getBooks();
        for (Book b : books) {
            System.out.println(b);
//        }
        }
    } //end main
}//end class
