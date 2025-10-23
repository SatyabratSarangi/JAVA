import java.util.*;
class MinimumBalanceException extends Exception {
    MinimumBalanceException(String message) {
        super(message);
    }
}
class Account {
    String name;
    int acc_no;
    double balance;
    Account(String name,int acc_no,double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }
    void deposit(double amt) {
        balance += amt;
        System.out.println("Amount deposited: "+amt+", New balance: "+balance);
    }
    void withdraw(double amt) throws MinimumBalanceException {
        if(balance - amt < 500)
            throw new MinimumBalanceException("Withdrawal denied! Balance cannot go below 500.");
        balance -= amt;
        System.out.println("Amount withdrawn: "+amt+", Remaining balance: "+balance);
    }

    void transfer(Account acc2,double amt) throws MinimumBalanceException {
        if(balance - amt < 500)
            throw new MinimumBalanceException("Transfer denied! Balance cannot go below 500.");
        this.balance -= amt;
        acc2.balance += amt;
        System.out.println("Amount transferred: "+amt+" from "+this.name+" to "+acc2.name);
        System.out.println(this.name+" balance: "+this.balance+", "+acc2.name+" balance: "+acc2.balance);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first account holder name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter first account number: ");
        int acc_no1 = sc.nextInt();
        System.out.print("Enter initial balance: ");
        double balance1 = sc.nextDouble();
        Account acc1 = new Account(name1, acc_no1, balance1);

        sc.nextLine();
        System.out.print("Enter second account holder name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter second account number: ");
        int acc_no2 = sc.nextInt();
        System.out.print("Enter initial balance: ");
        double balance2 = sc.nextDouble();
        Account acc2 = new Account(name2, acc_no2, balance2);

        System.out.print("Enter amount to deposit in first account: ");
        double dep = sc.nextDouble();
        acc1.deposit(dep);

        System.out.print("Enter amount to withdraw from first account: ");
        double wd = sc.nextDouble();
        try {
            acc1.withdraw(wd);
        } catch(MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter amount to transfer from first account to second account: ");
        double trf = sc.nextDouble();
        try {
            acc1.transfer(acc2, trf);
        } catch(MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
