import java.util.*;
public class pattern9{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no of row=");
        int r= sc.nextInt();
        int n=1;
        for (int row=1;row<=r;row++){
            for (int col=1;col<=(row);col++){
                System.out.print(n++ +" ");

}
System.out.println();
        

        }
    }
}