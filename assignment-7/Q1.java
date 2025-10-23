import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter n1: ");
        n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        n2 = sc.nextInt();
        try {
            System.out.println("Result: " + n1 / n2);
        } catch (Exception e) {
            System.out.println("Division by zero not allowed. Enter n2 again:");
            n2 = sc.nextInt();
            System.out.println("Result: " + n1 / n2);
        }
    }
}