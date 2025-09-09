import java.util.*;
public class insertionsorting{
    public static void  insertion(int array[]){
        for (int i=1;i<array.length;i++){
            int curr=array[i];
            int prev=i-1;
            while(prev>=0 && array[prev]>curr){
                    array[prev+1]=array[prev];

              prev--; }
            
       array[prev+1] = curr;
         } 
         }
    
    public static void main (String args[]){
        int arr[]={1,4,2,5,3,9,10,8,6,7};
        insertion(arr);
        
         for (int i : arr){ 
            System.out.print(i+" ");}
        

    }
}