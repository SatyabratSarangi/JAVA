import java.util.Scanner;

class ComplexNum {
    int real, img;

    ComplexNum(int r, int i) {
        this.real = r;
        this.img = i;
    }

    void display() {
        System.out.println(real + "+" + img + "i");
    }

    ComplexNum add(ComplexNum c) {
        return new ComplexNum(real + c.real, img + c.img);
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first complex number (real imaginary): ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        System.out.print("Enter second complex number (real imaginary): ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        ComplexNum c1 = new ComplexNum(r1, i1);
        ComplexNum c2 = new ComplexNum(r2, i2);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        ComplexNum sum = c1.add(c2);
        System.out.print("Sum of Complex Numbers: ");
        sum.display();
    }
}
