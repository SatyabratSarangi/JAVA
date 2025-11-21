import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        String words[] = s.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (w.length() > 0)
                w = w.substring(0,1).toUpperCase() + w.substring(1);
            result = result + w + " ";
        }
        System.out.println(result.trim());
    }
}
