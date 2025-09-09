import java.util.*;
public class pattern3{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of n=");
        int n=sc.nextInt();
        for (int row=n;row>=1;row--){
            for (int col=1;col<=row;col++){
                System.out.print("*");
            }
        System.out.println(" ");} 

    }
}