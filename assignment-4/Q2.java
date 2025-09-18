/*2.	Write a program to create a class named 'Student' with members 'name', 'roll_no', ‘branch’. Declare two methods to input the student details and display the details of the student. Create a driver class to test the functionalities of the above class. */

import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String branch;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter branch: ");
        branch = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch : " + branch);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputDetails();
        s1.displayDetails();
    }
}

