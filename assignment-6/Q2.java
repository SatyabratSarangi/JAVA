/*2.	Define an interface Calculator which has the basic methods add(), sub( ), mul() and div(). Define a concrete class named as DemoCalculator that implements the interface. Define the driver class, which create object reference of the interface Calculator and perform all basic operation of the calculator. */
import java.util.*;
interface calculator{
    double add(double a,double b);
    double sub(double a,double b);
    double mul(double a,double b);
    double div(double a,double b);
}
class DemoCalculator implements calculator{
    
    public double add(double a,double b){
        return (a+b);
    }
    public double sub(double a,double b){
        return (a-b);
    }
    public double mul(double a,double b){
        return (a*b);
    }
    public double div(double a,double b){
        return (a/b);
    }

}

public class Q2 {
    public static void main(String[] args) {
        DemoCalculator dc=new DemoCalculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first number");
        int a=sc.nextInt();
        System.out.println("enter your second number");
        int b=sc.nextInt();
        System.out.println(dc.add(a,b));
        System.out.println(dc.sub(a,b));
        System.out.println(dc.mul(a,b));
        System.out.println(dc.div(a,b));
    }
}