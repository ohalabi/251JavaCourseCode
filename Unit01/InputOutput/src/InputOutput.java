import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.println("Welcome to Input & Output");

        //Input & Output
        float x = 10.555555555f;
        String name = "Ali";
        System.out.printf("\n His name is %s and he has QAR %.3f \n", name, x);
        System.out.println("\n" + "His name is " + name + " QAR " + x + "\n");

        // Another way to format output
        var item = "Car";
        var type = "Sport";
        var price = 25000.513;
        var color = "Red";

        String template = "Vehicle item: %s, type %s, color %s, price %.2f ";
        var itemString = String.format(template, item, type, color, price);
        System.out.println(itemString);

        randomNums();
    }

    public static void randomNums() {
        System.out.print("How many random nums? ");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Random num " + i +
                    " is " + Math.random());
        }
    }

}
