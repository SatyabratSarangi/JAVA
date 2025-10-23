import org.shapes.*;
import java.util.Scanner;
public class TestShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape: 1. Square 2. Triangle 3. Circle");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Enter side of square: ");
                double side = sc.nextDouble();
                Square sq = new Square(side);
                System.out.println("Area: " + sq.area());
                System.out.println("Perimeter: " + sq.perimeter());
                break;
            case 2:
                System.out.print("Enter base of triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = sc.nextDouble();
                System.out.print("Enter three sides of triangle: ");
                double s1 = sc.nextDouble();
                double s2 = sc.nextDouble();
                double s3 = sc.nextDouble();
                Triangle tr = new Triangle(base, height, s1, s2, s3);
                System.out.println("Area: " + tr.area());
                System.out.println("Perimeter: " + tr.perimeter());
                break;
            case 3:
                System.out.print("Enter radius of circle: ");
                double r = sc.nextDouble();
                Circle c = new Circle(r);
                System.out.println("Area: " + c.area());
                System.out.println("Perimeter: " + c.perimeter());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
