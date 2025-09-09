import java.util.*;
public class bublesort{
    public static void buble(int array[]){
        for (int i=0;i<array.length;i++){
            for (int j =i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
    }
    public static void main(String args[] ){
        int arr[]={2,3,1,5,4};
        buble(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}