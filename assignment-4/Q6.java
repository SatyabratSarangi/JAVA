/*6.	Define a class Student having the attribute regNo,  stdName,  branch and CGPA. Write 2 methods to accept and display the student details.  Read the details of 50 students using an array of Student class object. Display the student details who has secured the highest CGPA. */

import java.util.Scanner;

class Student {
    int regNo;
    String stdName;
    String branch;
    double cgpa;

    void accept(Scanner sc) {
        System.out.print("Enter RegNo: ");
        regNo = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        stdName = sc.nextLine();

        System.out.print("Enter Branch: ");
        branch = sc.nextLine();

        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    void display() {
        System.out.println("RegNo   : " + regNo);
        System.out.println("Name    : " + stdName);
        System.out.println("Branch  : " + branch);
        System.out.println("CGPA    : " + cgpa);
        
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].accept(sc);
        }

        
        Student top = students[0];
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa > top.cgpa) {
                top = students[i];
            }
        }

        System.out.println("\nStudent with Highest CGPA:");
        top.display();
    }
}
