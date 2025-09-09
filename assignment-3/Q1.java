/*1.	Write a program to search an element present in the array. */
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println(key + " was found at index " + i);
                return;
            }
        }
        System.out.println(key + " was not found in the array");
    }
    
}
