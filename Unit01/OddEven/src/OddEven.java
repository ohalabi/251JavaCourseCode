import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        //Get input
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Enter an integer: ");
        x = input.nextInt();

        // call function isEven
        isEven(x);

    }

    public static void isEven(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is even number");
        else
            System.out.println(num + " is odd number");
    }
}
