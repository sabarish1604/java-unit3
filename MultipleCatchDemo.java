public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            int x = 10 / 0;
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}
