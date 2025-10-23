/*3.	Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods. */
abstract class Shape {
    abstract void RectangleArea(double l, double b);
    abstract void SquareArea(double s);
    abstract void CircleArea(double r);
}
class Area extends Shape {
    void RectangleArea(double l, double b) {
        System.out.println("Rectangle Area: " + (l * b));
    }
    void SquareArea(double s) {
        System.out.println("Square Area: " + (s * s));
    }
    void CircleArea(double r) {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}
public class Q3 {
    public static void main(String[] args) {
        Area a = new Area();
        a.RectangleArea(20, 6);
        a.SquareArea(9);
        a.CircleArea(7);
    }
}
 

