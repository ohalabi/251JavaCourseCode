/**
 * Created by Osama Halabi on 2020/09/13.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //add method
    public void powerUp() {
        theCase.pressPowerButton();
        motherboard.loadProgram("OSX 15.5");
        drawLogo();
    }
    private void drawLogo() {
        monitor.drawPixelAt(1800, 500, "green");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
