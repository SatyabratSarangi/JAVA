/*4.	Write a program to implement multiple inheritance using interface. */
import java.util.*;
interface eat {
    void eat();
}
interface walk {
    void walk();
}
interface drink{
    void drink();
}
class human implements eat,walk,drink{
    public void eat(){
        System.out.println("eats food");
    }
    public void walk(){
        System.out.println("walks in two legs");
    }
    public void drink(){
        System.out.println("drinks water");
    }
}
public class Q4 {
    public static void main(String[] args) {
        human h=new human();
        h.eat();
        h.drink();
        h.walk();
    }
}
