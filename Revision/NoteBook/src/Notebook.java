/**
 * Created by Osama Halabi on 2020/09/29.
 */
public class Notebook {
    private Processor processor = new Processor();
    private Disk disk = new Disk();
    private String brand;
    private double price;//in $US

    public Notebook() {
    }

    public Notebook(String brand, double price) {
        setBrand(brand);
        setPrice(price);
    }


    public String toString() {
        return "Notebook [processor=" + processor + ", disk=" + disk + ", brand=" + brand + ", price=" + price + "]";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }
}


