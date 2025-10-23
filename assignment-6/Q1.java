/*1.	Create a abstract class Bank that has abstract method getROI(). Create two classes SBI, PNB, BOI inherited from Bank. Create a driver class that prints the rate of interest of each bank using super class memory reference */
abstract class Bank {
    abstract double getROI();
}

class SBI extends Bank {
    double getROI() {
        return 9.0;
    }
}

class PNB extends Bank {
    double getROI() {
        return 8.5;
    }
}

class BOI extends Bank {
    double getROI() {
        return 7.5;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getROI() + "%");

        b = new PNB();
        System.out.println("PNB Rate of Interest: " + b.getROI() + "%");

        b = new BOI();
        System.out.println("BOI Rate of Interest: " + b.getROI() + "%");
    }
}

