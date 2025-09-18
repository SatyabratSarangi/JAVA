import java.util.Scanner;

class Average {
    void calculateAverage(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("The average is: " + avg);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        Average obj = new Average();
        obj.calculateAverage(num1, num2, num3);
    }
}
