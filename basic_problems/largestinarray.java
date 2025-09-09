import java.util.*;
public class largestinarray{
    public static int largestarray(int array[]){
        int largest=Integer.MIN_VALUE;
        int i;
        for (i=0;i<array.length;i++){
            if (array[i]>largest){
                largest=array[i];
            }

        }
        return largest;
    }
    public static void main(String args[]){
        int array[]=new int[10];
        Scanner sc= new Scanner(System.in);
        for (int j=0;j<10;j++){
            System.out.print("enter the element of array=");
            int s=sc.nextInt();
            array[j]=s;
        }
        System.out.print("largest no in array is ="+largestarray(array));
    }
}