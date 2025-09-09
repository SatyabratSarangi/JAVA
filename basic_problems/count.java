import java.util.*;

public class count{
public static int countv(String str){
    
    int count=0;
    for (int i=0;i<str.length();i++){
        char n=str.charAt(i);
        if ( n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){
            count++;

        }
    }

return count;}

public static void main(String args[]){
    String str="abcdeiou";
    System.out.print(countv(str));
}}