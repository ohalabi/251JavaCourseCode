/**
 * Created by Osama Halabi on 2020/09/15.
 */
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean equalsTo(Book book) {

        return this.title.equals(book.title);

    }


}
