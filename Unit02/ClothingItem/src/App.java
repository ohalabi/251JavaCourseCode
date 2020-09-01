import java.text.NumberFormat;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        ClothingItem item = new ClothingItem(ClothingItem.SHIRT,
                ClothingSize.S,
                199.99,
                200); // call the default constructor

//        item.setType("Shirt");
//        item.setSize("M");
//        item.setPrice(199.99);
//        item.setQuantity(5);

        System.out.println(item.getType());
        System.out.println(item.getSize());
        System.out.println(item.getPrice());
        System.out.println(item.getQuantity());

        // calling constructor #1
        var item2 = new ClothingItem();
        System.out.println(item2.getType());
        System.out.println(item2.getSize());
        System.out.println(item2.getPrice());
        System.out.println(item2.getQuantity());

        //calling constructor #3 with one parameter
//        ClothingItem.PANTS = "Shoes";
        var item3 = new ClothingItem(ClothingItem.PANTS);
        System.out.println(item3.getType());
        System.out.println(item3.getSize());
        System.out.println(item3.getPrice());
        System.out.println(item3.getQuantity());


        // Formatted printing
        var totalPrice = item.getPrice() * item.getQuantity();

        //var locale = Locale.UK;
        var locale = new Locale("ar", "QA");
        var numberFormatter = NumberFormat.getNumberInstance(locale);
        var currencyForamtter = NumberFormat.getCurrencyInstance(locale);
        var output = String.format("Your %s %S order will cost %s",
                item.getSize(),
                item.getType(), currencyForamtter.format(totalPrice));
        System.out.println(output);

        //Iterate through the enum
        for (var size : ClothingSize.values()) {
            System.out.println( size.toString());
        }


    }
}
