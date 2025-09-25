class Account {
    String customerName;
    int accountNumber;

    Account(String customerName, int accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
    }
}

class Savings_Account extends Account {
    final double min_bal = 1000.0;
    double saving_bal;

    Savings_Account(String customerName, int accountNumber, double saving_bal) {
        super(customerName, accountNumber);
        this.saving_bal = saving_bal;
    }

    void show() {
        super.display();
        System.out.println("Minimum Balance: " + min_bal);
        System.out.println("Savings Balance: " + saving_bal);
    }
}

class Account_details extends Savings_Account {
    double deposit;
    double withdrawal;

    Account_details(String customerName, int accountNumber, double saving_bal,
            double deposit, double withdrawal) {
        super(customerName, accountNumber, saving_bal);
        this.deposit = deposit;
        this.withdrawal = withdrawal;
    }

    void show1() {
        super.show();
        System.out.println("Deposit Amount: " + deposit);
        System.out.println("Withdrawal Amount: " + withdrawal);
        double finalBalance = saving_bal + deposit - withdrawal;
        System.out.println("Final Balance: " + finalBalance);

    }
}

public class Q1 {
    public static void main(String[] args) {
        Account_details obj = new Account_details("Satya Sarangi", 123456, 5000.0, 2000.0, 1500.0);
        obj.show1();
    }
}
