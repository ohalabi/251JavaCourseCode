/**
 * Created by Osama Halabi on 2020/09/15.
 */
public class BookStoreTest {
    public static void main(String[] args) {

        Book orgBook = new Book("Hunger Game");
        BookStore orgStore = new BookStore("Jarir", orgBook);

        Book copybook = new Book("Hunger Games");
        BookStore copyStore = new BookStore("Jarir", copybook);

        if (orgStore == copyStore)
        {
            System.out.println("They have the same values");
        }

        if (orgStore.equalsTo(copyStore)) {
            System.out.println("the two book stores have same value");
        }
        else {
            System.out.println("the two book stores do not have the same value");
        }
    }
}

