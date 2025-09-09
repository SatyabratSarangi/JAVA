import java.util.*;
public class pattern11{
    public static void patt(int r,int c){
        int row,col;
        for (row=1;row<=r;row++){
            for (col=1;col<=row;col++){
                System.out.print("* ");
            }
            for (col=1;col<=2*r-2*row;col++){
                System.out.print("  ");

            }for (col=1;col<=row;col++){
                System.out.print("* ");
            }
       System.out.println(" "); }
         for (row=r;row>=1;row--){
            for (col=1;col<=row;col++){
                System.out.print("* ");
            }
            for (col=1;col<=2*r-2*row;col++){
                System.out.print("  ");

            }for (col=1;col<=row;col++){
                System.out.print("* ");
            }
       System.out.println(" "); }

    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the  row you want");
        int r=sc.nextInt();
        System.out.print("enter the col you want ");
        int c=sc.nextInt();
        patt(r,c);


    }
}