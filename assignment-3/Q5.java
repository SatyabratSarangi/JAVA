/* Q5. Write a program that will take two integer numbers from the command prompt and find their GCD. If the user does not provide exactly two
        numbers of arguments then the program should display error message */
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Provide exactly two command line argument");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int gcd=1;
        int largest=num1>num2?num1:num2;

        for(int i=1;i<=largest;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        System.out.println("The gcd of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
