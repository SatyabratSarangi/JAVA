/*4.	Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim ()' takes length and breadth of rectangle as parameters and the second method named as 'getArea ()' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard. [use ‘this’ keyword] */

import java.util.Scanner;

class Area {
    int length, breadth;

    void setDim(int length, int breadth) {
        this.length = length; 
        this.breadth = breadth;
    }

    int getArea() {
        return this.length * this.breadth;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Area rect = new Area();

        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int b = sc.nextInt();

        rect.setDim(l, b);

        System.out.println("Area of rectangle: " + rect.getArea());
    }
}
