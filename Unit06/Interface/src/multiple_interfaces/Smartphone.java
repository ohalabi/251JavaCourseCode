package multiple_interfaces;

/**
 * Created by Osama Halabi on 2020/10/13.
 */
public class Smartphone implements GPS, Radio, MusicPlayer {

    @Override
    public void getCoordinates() {
        System.out.println("Return some coordinates...");
    }

    @Override
    public void startRadio() {
        System.out.println("start Radio");
    }

    @Override
    public void stopRadio() {
        System.out.println("stop Radio");
    }

    // no need to implement default method getRoughCoordinates

    //two methods with same signature
//    @Override
//    public void next() {
//        System.out.println("Next from Radio");//suppose you want Radio
//    }

    //second way to use super
    @Override
    public void next() {
        MusicPlayer.super.next();
    }
}
