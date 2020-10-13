package multiple_interfaces;

/**
 * Created by Osama Halabi on 2020/10/13.
 */
public class TestSmartphone {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone();

        iphone.getCoordinates();
        iphone.startRadio();
        iphone.stopRadio();

        // test after adding default method
        iphone.getRoughCoordinates();

        //testing with having two methods with same signature in interface
        iphone.next();

        //testing with static method in interface
//        iphone.commercial ("Apple");//error
        MusicPlayer.commercial("Apple");

        //testing with interface inheritance
        iphone.start();
        iphone.next();
        iphone.pause();
    }
}
