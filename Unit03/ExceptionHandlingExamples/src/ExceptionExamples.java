public class ExceptionExamples {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException
        try {
            int[] a = new int[5];
            a[10] = 50; //exception program will quit
        } catch (ArrayIndexOutOfBoundsException e) { //handling you need to fix the error
            System.err.println(e.getMessage()); // output in red to indicate error
        }

        // NullPointerException
        try {
            int[] nums = null;
            System.out.println("nums size: " + nums.length); //exception
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

        //ArithmeticException
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        //NumberFormatException
        try {
            String s = "abc";
            int i = Integer.parseInt(s); //exception
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }

        //Multiple catch
        try {
            int a = 10 / 0;
            String s = "abc";
            int i = Integer.parseInt(s); //exception
            System.out.println(i);
        }
        catch (NumberFormatException e) {
            System.err.println(e);
        }
        catch (ArithmeticException e) {
            System.err.println(e);
        }

        System.out.println("rest of the code");
    }
}
