import java.util.*;
public class selectionsortdesc{
    public static void selectiondesc(int[] array){
        for (int i=0;i<array.length-1;i++){
            int maxpos=i;
            for (int j=i+1;j<array.length;j++){
                if( array[maxpos]<array[j]){
                    maxpos=j;
                }
            }int temp=array[maxpos];
            array[maxpos]=array[i];
            array[i]=temp;
        }

    }
    public static void main(String args[]){
int array[]={3,5,6,2,1,4};
selectiondesc(array);
for(int i:array){
    System.out.print(i+" ");
}
    }
}