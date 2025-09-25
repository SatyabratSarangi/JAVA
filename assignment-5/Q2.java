import java.util.Scanner;
class Figure{
    double dim1,dim2;
    Figure(double d1,double d2){
        dim1=d1;
        dim2=d2;
    }
    double area(){
        return 0;
    }
}
class Rectangle extends Figure{
    Rectangle(double l,double b){
        super(l,b);
    }
    double area(){
        return dim1*dim2;
    }
}
class Triangle extends Figure{
    Triangle(double b,double h){
        super(b,h);
    }
    double area(){
        return 0.5*dim1*dim2;
    }
}
class Square extends Figure{
    Square(double side){
        super(side,side);
    }
    double area(){
        return dim1*dim2;
    }
}
public class Q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Figure f;
        System.out.print("Enter length and breadth of rectangle: ");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        f=new Rectangle(l,b);
        System.out.println("Area of Rectangle = "+f.area());
        System.out.print("Enter base and height of triangle: ");
        double base=sc.nextDouble();
        double h=sc.nextDouble();
        f=new Triangle(base,h);
        System.out.println("Area of Triangle = "+f.area());
        System.out.print("Enter side of square: ");
        double side=sc.nextDouble();
        f=new Square(side);
        System.out.println("Area of Square = "+f.area());
        
    }
}

