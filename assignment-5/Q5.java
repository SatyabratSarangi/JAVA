import java.util.Scanner;
class Point2D{
    double x,y;
    Point2D(){x=0;y=0;}
    Point2D(double a,double b){x=a;y=b;}
    void display(){System.out.println("Point2D: ("+x+","+y+")");}
}
class Point3D extends Point2D{
    double z;
    Point3D(){super();z=0;}
    Point3D(double a,double b,double c){super(a,b);z=c;}
    void show(){System.out.println("Point3D: ("+x+","+y+","+z+")");}
}
public class Q5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x and y for Point2D: ");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        Point2D p2=new Point2D(x,y);
        p2.display();

        System.out.print("Enter x, y and z for Point3D: ");
        double x3=sc.nextDouble();
        double y3=sc.nextDouble();
        double z3=sc.nextDouble();
        Point3D p3=new Point3D(x3,y3,z3);
        p3.show();
        
    }
}

