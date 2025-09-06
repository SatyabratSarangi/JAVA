// 5. Write a program to check a number is odd or even
import java.util.*;
public class Q5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter another number");
        double a=sc.nextDouble();
        if(a%2==0){
            System.out.println("no is even");
        }else{
            System.out.println("no is odd");
        }
    }
}