import java.util.Scanner;
class SumThread extends Thread{
    int start,end;
    static int sum=0;
    static Object lock=new Object();
    SumThread(int start,int end){
        this.start=start;
        this.end=end;
    }
    public void run(){
        int tempSum=0;
        for(int i=start;i<=end;i++){
            tempSum+=i;
        }
        synchronized(lock){
            sum+=tempSum;
        }
    }
}
public class Q10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();
        System.out.print("Enter number of threads m: ");
        int m=sc.nextInt();
        SumThread[] threads=new SumThread[m];
        int range=n/m;
        int start=1;
        int end=range;
        for(int i=0;i<m;i++){
            if(i==m-1)
                end=n;
            threads[i]=new SumThread(start,end);
            threads[i].start();
            start=end+1;
            end+=range;
        }
        try{
            for(int i=0;i<m;i++)
                threads[i].join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Sum of first "+n+" natural numbers is: "+SumThread.sum);
    }
}
