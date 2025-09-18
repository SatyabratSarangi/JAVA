/*2.	Write a program to create a class named 'Student' with members 'name', 'roll_no', ‘branch’. Declare two methods to input the student details and display the details of the student. Create a driver class to test the functionalities of the above class. */

import java.util.Scanner;

class Complex {
    int real, imaginary;

    void initialise(int r, int i) {
        real = r;
        imaginary = i;
    }

    void show() {
        System.out.println(real + " + " + imaginary + "i");
    }

    Complex add(Complex c) {
        Complex result = new Complex();
        result.real = real + c.real;
        result.imaginary = imaginary + c.imaginary;
        return result;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.print("Enter first complex number (real imaginary): ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        c1.initialise(r1, i1);

        System.out.print("Enter second complex number (real imaginary): ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        c2.initialise(r2, i2);

        System.out.print("First: ");
        c1.show();

        System.out.print("Second: ");
        c2.show();

        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.show();
    }
}
