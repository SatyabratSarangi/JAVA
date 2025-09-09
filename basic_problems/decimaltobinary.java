import java.util.*;
public class decimaltobinary{
    public static int deci(int dec){
        int pw=0;
        int bin=0;
        
        while(dec>0){
            int rem=dec%2;
            bin=bin+(int)(rem * Math.pow(10,pw));
            pw++;
            dec=dec/2;

        }return bin;
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no =");
        int num=sc.nextInt();
        System.out.print(deci(num));

     }}