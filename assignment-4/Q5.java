/*5.	Write a program to declare a class employee with data members empid, ename, dept, sal. Add a method getData(), putData() to accept and display the details of n employees. Define a driver class to create the objects of employee class and perform basic operations. */

import java.util.Scanner;

class Employee {
    int empid;
    String ename;
    String dept;
    double sal;

    void getData(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empid = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        ename = sc.next();

        System.out.print("Enter Department: ");
        dept = sc.next();

        System.out.print("Enter Salary: ");
        sal = sc.nextDouble();
    }

    void putData() {
        System.out.println("ID: " + empid + ", Name: " + ename + ", Dept: " + dept + ", Salary: " + sal);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].getData(sc);
        }

        for (int i = 0; i < n; i++) {
            employees[i].putData();
        }
    }
}
