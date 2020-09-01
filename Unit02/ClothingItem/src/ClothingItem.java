public class ClothingItem {

    // add static variables
    public static final String SHIRT = "Shirt";
    public static final String PANTS = "Pants";
    public static final String SHOES = "Shoes";

    private String type;
    private ClothingSize size;
    private double price;
    private int quantity;

    //Constructors

    //constructor #1
    public ClothingItem (){
    }

    // constructor #2
    public ClothingItem(String type, ClothingSize size, double price, int quantity) {
        this.type = type;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    // contstructor #3
    public ClothingItem(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
