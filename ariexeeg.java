public class ariexeeg {
    public static void main(String[] args) {
        try {
            int t = 0;
            int result = 10 / t;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        }

        try {
            String name = " ";
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("cannot access null object ");
        }

        try {
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println("number = " + num);
        } catch (NumberFormatException e) {
            System.out.println("not a valid number format");
        }

        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } finally {
            System.out.println("all exceptions runs");
        }
    }
}