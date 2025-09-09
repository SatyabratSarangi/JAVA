import java.util.*;
public class pattern7{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no of row=");
        int r= sc.nextInt();
        for (int row=1;row<=r;row++){
            for (int col=1;col<=(r-row);col++){
                System.out.print(" ");

}
for(int col=1;col<=row;col++){System.out.print("*");}System.out.println();
        

        }
    }
}