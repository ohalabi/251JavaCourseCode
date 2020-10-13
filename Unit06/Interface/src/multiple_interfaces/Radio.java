package multiple_interfaces;

/**
 * Created by Osama Halabi on 2020/10/13.
 */
public interface Radio {
    public void startRadio();
    public void stopRadio();

    //add a method with same signature in MusicPlayer interface
    default void next () {
        System.out.println("Next from Radio");
    }
}
