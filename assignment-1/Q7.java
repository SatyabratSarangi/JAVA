/*  7. Write a program to input the time value in seconds and then display it in the hour: minute: second format using the modulus operator (%).
For example, INPUT: Enter the time in second: 3610 
 OUTPUT: 1 hour: 0 minutes: 10 seconds*/

 import java.util.*;
 public class Q7{
    public static void main(String argd[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int seconds = sc.nextInt();
        
        int hrs=seconds/3600;
        int min=(seconds%3600)/60;
        int sec=(seconds%3600)%60;
        System.out.println("hrs :"+hrs+"min :"+min+"sec :"+sec);
        

    }
 }