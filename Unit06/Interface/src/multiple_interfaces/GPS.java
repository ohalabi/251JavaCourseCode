package multiple_interfaces;

/**
 * Created by Osama Halabi on 2020/10/13.
 */
public interface GPS {
    public void getCoordinates ();

    //add default method
    default public void getRoughCoordinates() {
        System.out.println("Fetching rough coordinates...");
    }
}
