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
        ArrayList<Book> myLibrary = new ArrayList<>();
        Book a = new Book("Java");
        myLibrary.add(a);
        Book b = new Book("Python");
        myLibrary.add(b);

        display(myLibrary, "Library list contains: ");

        //add in another way
        myLibrary.add(new Book("C#"));
        myLibrary.add(new Book("C++"));
        myLibrary.add(new Book("Fortan"));

        display(myLibrary, "Library list contains new three books: ");

        // remove using object
        myLibrary.remove(a);
        display(myLibrary, "list after remove Java: ");

        //remove using index
        myLibrary.remove(2);
        display(myLibrary, "list after remove index 2 (C++): ");

        //remove by search for title and get the index of the object that contain the title
        int indexOfBookToDelete = -1; // -1 mean not found
        for (Book temp: myLibrary) {
            if (temp.getBookTitle().equalsIgnoreCase("fortan")){
                indexOfBookToDelete = myLibrary.indexOf(temp);
            }
        }
        if (indexOfBookToDelete == -1) {
            display(myLibrary, "book not found!");
        }else{
            myLibrary.remove(indexOfBookToDelete);
            display(myLibrary, "Libraby after fortan C#:");
        }
        myLibrary.set(0, new Book("Objective C"));
        display(myLibrary, "after setting new element at 0: ");

        System.out.printf("Size: %s%n", myLibrary.size());

    }//end main

    // display the Arraylist's elements
    public static void display (ArrayList<Book> books, String header) {
        System.out.printf(header);

        for (Book item: books) {
            System.out.printf(" %s", item.getBookTitle());
        }
        System.out.println();
    }
}//end class
