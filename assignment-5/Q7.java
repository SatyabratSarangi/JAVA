import java.util.Scanner;
class Person{
    String name;
    Person(String n){name=n;}
    void display(){System.out.println("Name : "+name);}
}
class Employee extends Person{
    private int empid;
    Employee(String n,int id){super(n);empid=id;}
    void display(){System.out.println("EmpID : "+empid);}
}
class HourlyEmployee extends Employee{
    private double hourlyRate,hoursWorked;
    HourlyEmployee(String n,int id,double rate,double hours){super(n,id);hourlyRate=rate;hoursWorked=hours;}
    double getGrossPay(){return hourlyRate*hoursWorked;}
    void display(){super.display();System.out.println("Hourly Rate : "+hourlyRate+"\nHours worked : "+hoursWorked+"\nGross pay : "+getGrossPay());}
}
public class Q7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=sc.nextLine();
        System.out.print("Enter EmpID: ");
        int id=sc.nextInt();
        System.out.print("Enter Hourly Rate: ");
        double rate=sc.nextDouble();
        System.out.print("Enter Hours Worked: ");
        double hours=sc.nextDouble();
        HourlyEmployee he=new HourlyEmployee(name,id,rate,hours);
        he.display();
    }
}

