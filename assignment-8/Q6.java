import java.util.Scanner;
class SquareThread extends Thread{
    int num;
    SquareThread(int num){
        this.num=num;
    }
    public void run(){
        int sq=num*num;
        System.out.println("Square of "+num+" is: "+sq);
    }
}
class SumThread extends Thread{
    int num;
    SumThread(int num){
        this.num=num;
    }
    public void run(){
        int n=num,sum=0,r;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of digits of "+num+" is: "+sum);
    }
}
public class Q6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        SquareThread t1=new SquareThread(number);
        SumThread t2=new SumThread(number);
        t1.start();
        t2.start();
    }
}
