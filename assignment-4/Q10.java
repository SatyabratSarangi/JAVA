/*Design a class ‘Time’ having data members as hour, minute and second. The class should have a parameterized constructor to initialize its data members. It should also have methods displayTime() to display the time in HH:MM:SS format and addTime() to add two times. Test these methods by creating a main method in another class. */


import java.util.Scanner;

class Time {
    int hour, minute, second;

    Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    void displayTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    Time addTime(Time t) {
        int h = this.hour + t.hour;
        int m = this.minute + t.minute;
        int s = this.second + t.second;

        if (s >= 60) {
            m += s / 60;
            s = s % 60;
        }
        if (m >= 60) {
            h += m / 60;
            m = m % 60;
        }

        return new Time(h, m, s);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first time (hour minute second): ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        System.out.print("Enter second time (hour minute second): ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);

        System.out.print("First Time: ");
        t1.displayTime();

        System.out.print("Second Time: ");
        t2.displayTime();

        Time sum = t1.addTime(t2);
        System.out.print("Sum of Times: ");
        sum.displayTime();
    }
}
