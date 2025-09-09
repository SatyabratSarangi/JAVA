import java.util.*;
public class duplicateenteryinarray{
    public static boolean duplicateiarray(int[] array){
        for (int i=0;i<array.length-1;i++){
            for (int j =i+1;j<=array.length-1;j++){
                if (array[i]==array[j]){
                    return true;
                }
            }
        }
    return false;}
    public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the no of array you want to add =");
int obj= sc.nextInt();
int array[]=new int[obj];
for (int i=0;i<=array.length-1;i++){
    System.out.print("enter the element of array=");
    int ele=sc.nextInt();
    array[i]=ele;
}
System.out.print(duplicateiarray(array));
    }
}