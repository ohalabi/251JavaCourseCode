public class Arrays {

    public static void main(String[] args) {
        System.out.println("Welcome to Arrays");

        //Arrays
        final int SIZE = 5;
        int[] values = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            values[i] = i * i;
        }

        for (int x : values) {
            System.out.print(" " + x);
        }
    }
}
