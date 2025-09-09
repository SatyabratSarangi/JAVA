//	Q2. Write a program to sort the array of n elements.

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n - 1; i++) {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
                }
                arr[prev+1]=curr;
            }
        
        System.out.print("The sorted array is: ");

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
