/**
 * Created by Osama Halabi on 2020/09/29.
 */
public class Processor {
    private String type; // Core i3, Core i5, Core i7 private double speed; //in GHz 1.3, 2.1
    private int cacheSize; //in MB 2, 4, 8
    private double speed;

    public Processor() {
    }

    public Processor(String type, double speed, int cacheSize) {
        setType(type);
        setSpeed(speed);
        setCacheSize(cacheSize);
    }

    public String toString() {
        return "Processor [type=" + type + ", speed=" + speed + ", cacheSize=" + cacheSize + "]";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
