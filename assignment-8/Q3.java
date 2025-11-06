import java.util.Scanner;
class ArmstrongCheck implements Runnable{
    int num;
    ArmstrongCheck(int num){
        this.num=num;
    }
    public void run(){
        int n=num,sum=0,r;
        while(n>0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==num)
            System.out.println(num+" is an Armstrong number");
        else
            System.out.println(num+" is not an Armstrong number");
    }
}
public class Q3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        ArmstrongCheck obj=new ArmstrongCheck(number);
        Thread t=new Thread(obj);
        t.start();
    }
}
