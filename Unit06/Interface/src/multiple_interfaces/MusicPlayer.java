package multiple_interfaces;

/**
 * Created by Osama Halabi on 2020/10/13.
 */
public interface MusicPlayer extends Player {
//    public void start();
//    public void pause();
//    public void stop();

    default public void next() {
        System.out.println("Next from Music Player");
    }

    //add static method
    public static void commercial(String sponsor) {
        System.out.println("Now for a message brought to you by " + sponsor);
    }
}
