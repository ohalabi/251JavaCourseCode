/**
 * Created by Osama Halabi on 2020/09/13.
 */
public class PCTest {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(60, 50, 25);
        Case theCase = new Case("220T", "iCUE", "240", dimensions);

        Monitor theMonitor = new Monitor("25inch Beast", "BenQ", 25,
                new Resolution(2980, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-240", "Asus",
                4, 6, "v2.33");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        // How to access methods in composition
//        thePC.getTheCase().pressPowerButton();
//        thePC.getMotherboard().loadProgram("Windows Pro 10");
//        thePC.getMonitor().drawPixelAt(2500, 400, "red");

        thePC.powerUp();
    } //end main
} // end PC class
