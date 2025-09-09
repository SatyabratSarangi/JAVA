import java.util.*;
public class leapyear{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
        if ((year%100==0 && year%400==0)||(year%100!=0 && year%4==0 )){
                System.out.print("leapyear");
        }else{
            System.out.print("not a leapyear");
        }
    }}