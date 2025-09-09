/* Q6. Write a program that will take employee id, employee name, department number, salary from the command prompt. If the user does not
		provide exactly two numbers of arguments then the program should display error message. Use methods display() to display the record of
		employee.*/
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("give four command line argument");
            return;
        }
        String empid = args[0];
        String empname = args[1];
        int departmentNo = Integer.parseInt(args[2]);
        double salary = Double.parseDouble(args[3]);
        display(empid, empname, departmentNo, salary);
    }

    public static void display(String empid, String empname, int departmentNo, double salary) {
        System.out.println("ID: " + empid);
        System.out.println("Name: " + empname);
        System.out.println("Department No.: " + departmentNo);
        System.out.println("Salary: " + salary);
    }
}
