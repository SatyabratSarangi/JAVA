import java.util.*;
public class Q6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter full name: ");
        String s=sc.nextLine();
        String[] words=s.split(" ");
        String initials="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>0)
                initials+=Character.toUpperCase(words[i].charAt(0));
        }
        System.out.println("Initials: "+initials);
    }
}
