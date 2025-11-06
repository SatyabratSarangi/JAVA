import java.util.Scanner;
class MinThread extends Thread{
    int start,end;
    int[] arr;
    static int globalMin=Integer.MAX_VALUE;
    MinThread(int s,int e,int[] a){
        start=s;
        end=e;
        arr=a;
    }
    public void run(){
        int localMin=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]<localMin)
                localMin=arr[i];
        }
        synchronized(MinThread.class){
            if(localMin<globalMin)
                globalMin=localMin;
        }
    }
}
public class Q11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("Enter number of threads: ");
        int m=sc.nextInt();
        sc.close();
        MinThread[] threads=new MinThread[m];
        int part=n/m;
        int start=0;
        for(int i=0;i<m;i++){
            int end=(i==m-1)?n-1:start+part-1;
            threads[i]=new MinThread(start,end,arr);
            threads[i].start();
            start=end+1;
        }
        try{
            for(int i=0;i<m;i++)
                threads[i].join();
        }catch(Exception e){}
        System.out.println("Minimum element in array = "+MinThread.globalMin);
    }
}
