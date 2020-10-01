
/**
 * Created by Osama Halabi on 2020/09/29.
 */
public class Disk {
    private String type; //HDD, SSD, HDD
    private int capacity; //in GB

    public Disk() {
    }

    public Disk(String type, int capacity) {
        setType(type);
        setCapacity(capacity);
    }

    public String toString() {
        return "Disk [type=" + type + ", capacity=" + capacity + "]";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}

