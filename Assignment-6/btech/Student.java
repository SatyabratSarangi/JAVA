package btech;
public class Student {
    String name;
    int roll;
    int m1, m2, m3;

    public Student(String name, int roll, int m1, int m2, int m3) {
        this.name = name;
        this.roll = roll;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public void display() {
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
