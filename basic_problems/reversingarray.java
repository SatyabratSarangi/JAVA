// //import java.util.*;
// public class reversingarray{
//     public  static void  revarray(int array[]){
//         int first=0,last=array.length-1;
//         int mid=(first+last)/2;
        
//         while (first<=mid){
//             int temp=array[first];
//             array[first]=array[last-first];
//             array[last-first]=temp;
//             first++;
            
//         }

        
//     }
//     public static void main(String args[]){
//         int array[]={11,2,3,94,15};
//         revarray(array);
// for(int i:array){
//     System.out.print(i+",");
// }
    
// }}
import java.util.*;
public class reversingarray{
    public  static void  revarray(int array[]){
        int first=0,last=array.length-1;
        while (first<=last){
            int temp=array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }

        
    }
    public static void main(String args[]){
        int array[]={11,2,3,94,15};
        revarray(array);
for(int i=0;i<array.length;i++){
    System.out.print(array[i]+",");
}
    
}}