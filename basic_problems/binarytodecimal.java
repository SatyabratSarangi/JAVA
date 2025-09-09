import java.util.*;
public class binarytodecimal{
    public static int bina(int no){
        int pw=0;
        int dec=0;
        while(no>0){
        int lastdig=no%10;

        dec= dec + (int)(lastdig*Math.pow(2,pw));
        pw++;
        no=no/10;}
        return dec;

    }
    public static void main(String args[]){
        System.out.print("enter the binary no=");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(bina(num));
    }
}