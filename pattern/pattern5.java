import java.util.*;
public class pattern5{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of n=");
        int n=sc.nextInt();
        char name='a';
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                
                System.out.print(name);
                name++;
            }
        System.out.println(" ");} 

    }
}