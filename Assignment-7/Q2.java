import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();
        try {
            int diff = x - y;
            if (diff == 0)
                throw new Exception("x - y is zero, division not possible.");
            int result = x / diff;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}