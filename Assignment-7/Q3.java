import java.util.*;
public class Q3  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,11,33,55,56};
        System.out.print("Enter index position: ");
        int index = sc.nextInt();
        try {
            System.out.println("Value at index " + index + " is " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Index out of bound");
        }
    }
}