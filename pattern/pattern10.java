import java.util.*;
public class pattern10{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number of row you want=");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                for (int col=1;col<=i;col++){
                    if (col%2!=0){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }
            }else{
                for (int  col=1;col<=i;col++){
                    if(col%2!=0){
                        System.out.print("0");
                    }else{
                        System.out.print("1");
                    }
                }
            }
       System.out.println(); }}}
