public class tryCatch {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};
            int res = 100 / 0;

            System.out.println(arr[5]);
            System.out.println("Result: " + res);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception occurred");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("General Exception occurred");
            System.out.println(e);
        }

        System.out.println("Program Terminated Successfully");
    }
}