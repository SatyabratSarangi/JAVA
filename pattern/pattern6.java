import java.util.*;
public class pattern6{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no of row=");
        int r= sc.nextInt();
        System.out.print("enter the column=");
        int c=sc.nextInt();
        for (int row=1;row<=r;row++){
            for (int col=1;col<=c;col++){
                if (row==1||row==r || col==1||col==c){

                
                System.out.print("*");}
            else{
                System.out.print(" ");

            }}System.out.println();
        

        }
    }
}