import java.util.Scanner;
class OddIndexThread extends Thread{
    int[] a,b,result;
    OddIndexThread(int[] a,int[] b,int[] result){
        this.a=a;
        this.b=b;
        this.result=result;
    }
    public void run(){
        for(int i=1;i<a.length;i+=2){
            result[i]=a[i]*b[i];
        }
    }
}
class EvenIndexThread extends Thread{
    int[] a,b,result;
    EvenIndexThread(int[] a,int[] b,int[] result){
        this.a=a;
        this.b=b;
        this.result=result;
    }
    public void run(){
        for(int i=0;i<a.length;i+=2){
            result[i]=a[i]*b[i];
        }
    }
}
public class Q9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] result=new int[n];
        System.out.println("Enter elements of first array:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter elements of second array:");
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        EvenIndexThread t1=new EvenIndexThread(a,b,result);
        OddIndexThread t2=new OddIndexThread(a,b,result);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Product of elements:");
        for(int i=0;i<n;i++)
            System.out.print(result[i]+" ");
    }
}
