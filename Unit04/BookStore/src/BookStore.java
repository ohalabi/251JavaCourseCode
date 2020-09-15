/**
 * Created by Osama Halabi on 2020/09/15.
 */
public class BookStore {
    private String name;
    private Book bestSeller;

    public BookStore(String name, Book bestSeller) {
        this.name = name;
        this.bestSeller = bestSeller;
    }

    public boolean equalsTo(BookStore bookStore) {
        return this.name.equals(bookStore.name) &&
                this.bestSeller.equalsTo(bookStore.bestSeller);

    }

}
