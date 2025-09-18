/*7.	Define a class ‘Box’ that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities[use this keyword]. */


import java.util.Scanner;

class Box {
    double width, height, depth;

    
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return this.width * this.height * this.depth;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width of box: ");
        double w = sc.nextDouble();

        System.out.print("Enter height of box: ");
        double h = sc.nextDouble();

        System.out.print("Enter depth of box: ");
        double d = sc.nextDouble();

        Box b1 = new Box(w, h, d);

        System.out.println("Volume of the box: " + b1.volume());
    }
}
