// 4. Write a program to swap two numbers without using a third variable.

import java.util.*;
public class Q4{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        double a =sc.nextDouble();
        System.out.println("enter another number");
        double b =sc.nextDouble();
        System.out.println("no before swapping "+a+"and"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("no after swapping "+a+"and"+b);

    }
}