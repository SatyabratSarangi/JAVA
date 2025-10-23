// import btech.Student;

// public class Test {
//     public static void main(String[] args) {
//         Student s = new Student("Satya", 16, 85, 95, 90);
//         s.display();
//     }
// }
import btech.arithmetic.MyMath;
public class Test {
    public static void main(String[] args) {
        MyMath m = new MyMath();
        System.out.println("Add: " + m.add(14, 4));
        System.out.println("Sub: " + m.sub(15, 9));
        System.out.println("Mul: " + m.mul(11, 3));
        System.out.println("Div: " + m.div(60, 30));
        System.out.println("Mod: " + m.mod(20, 4));
    }
}
