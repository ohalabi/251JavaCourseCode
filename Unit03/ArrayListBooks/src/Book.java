import java.util.ArrayList;

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
        ArrayList<Book> myLibrary = new ArrayList<>(); // create ArrayList
        Book a = new Book("Java");
        myLibrary.add(a);
        Book b = new Book("Python");
        myLibrary.add(b);

        display(myLibrary, "Library list contains: ");

        myLibrary.add(new Book("C#"));
        myLibrary.add(new Book("C++"));
        myLibrary.add(new Book("Fortan"));

        display(myLibrary, "Library list contents with new three books: ");

        //remove using object
        myLibrary.remove(a);
        display(myLibrary, "Library after removing Java: ");

        //remove using index
        myLibrary.remove(2);
        display(myLibrary, "Library after removing index 2 (C++): ");

        //remove by search for title and get the index of object
        int indexOfBookToDelete = -1; // -1 means not found
        for (var temp : myLibrary) {
            if (temp.getBookTitle().equalsIgnoreCase("Python")) {
                indexOfBookToDelete = myLibrary.indexOf(temp);
            }
        }
        if (indexOfBookToDelete == -1) {
            display(myLibrary, "book not found!");
        } else {
            myLibrary.remove(indexOfBookToDelete);
            display(myLibrary, "List after removing Python:");
        }

        System.out.printf("size: %s%n", myLibrary.size());

    }

    //display the ArrayList's elements
    public static void display(ArrayList<Book> books, String header) {
        System.out.printf(header);

        for (Book item : books) {
            System.out.printf(" %s", item.getBookTitle());
        }
        System.out.println();
    }
}//end class

