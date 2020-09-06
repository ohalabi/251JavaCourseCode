import java.util.Arrays;

public class ArraysManipulations {
    public static void main(String[] args) {

        // sort doubleArray into ascending order
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        System.out.printf("%ndoubleArray before sort: ");
        for (double value : doubleArray) {
            System.out.printf("%.1f ", value);
        }

        Arrays.sort(doubleArray);

        System.out.printf("%ndoubleArray after sort: ");
        for (double value : doubleArray) {
            System.out.printf("%.1f ", value);
        }

        // fill 10-element array with 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 9);
        displayArray(filledIntArray, "filledIntArray");

        // copy array intArray into array intArrayCopy
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
//        intArrayCopy = Arrays.copyOf(intArray, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // compare intArray and intArrayCopy for equality
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n",
                (b ? "==" : "!="));

        // compare intArray and filledIntArray for equality
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray%n",
                (b ? "==" : "!="));

        // search intArray for the value 5
        int location = Arrays.binarySearch(intArray, 8);

        if (location >= 0) {
            System.out.printf(
                    "Found 5 at element %d in intArray%n", location);
        }
        else {
            System.out.println("8 not found in intArray");
        }
    } // end for main

    // output values in each array
    public static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);

        for (int value : array) {
            System.out.printf("%d ", value);
        }
    }
} //end class
