import java.util.Scanner;
class TableThread extends Thread{
    int num;
    TableThread(int num){
        this.num=num;
    }
    public void run(){
        System.out.println("Multiplication Table of "+num+":");
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
class FactorialThread extends Thread{
    int num;
    FactorialThread(int num){
        this.num=num;
    }
    public void run(){
        long fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}
public class Q7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        TableThread t1=new TableThread(number);
        FactorialThread t2=new FactorialThread(number);
        t1.start();
        t2.start();
    }
}
