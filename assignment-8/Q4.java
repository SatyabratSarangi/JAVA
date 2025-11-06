import java.util.Scanner;
class PalindromeThread extends Thread{
    int num;
    PalindromeThread(int num){
        this.num=num;
    }
    public void run(){
        int n=num,rev=0,r;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==num)
            System.out.println(num+" is a Palindrome number");
        else
            System.out.println(num+" is not a Palindrome number");
    }
}
public class Q4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        boolean isPrime=true;
        if(number<=1)
            isPrime=false;
        else{
            for(int i=2;i<=number/2;i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime)
            System.out.println(number+" is a Prime number");
        else
            System.out.println(number+" is a Composite number");
        PalindromeThread t=new PalindromeThread(number);
        t.start();
    }
}

