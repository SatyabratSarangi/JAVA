import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 22, 32, 55};
        try {
            System.out.print("Enter a number to divide :");
            int num = sc.nextInt();
            int divResult = 1000 / num;
            System.out.println("Division Result: " + divResult);

            System.out.print("Enter array index to access: ");
            int index = sc.nextInt();
            int arrValue = arr[index];
            System.out.println("Array Value: " + arrValue);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound.");
        }
    }
}
