/*5.	Create an interface Servicing that has abstract methods getServiceTime(). Create two class Car, Bike that implement interface. Create a driver class that creates the objects of two class and displays the service time */
interface Servicing {
    void getServiceTime();
}
class Car implements Servicing {
    public void getServiceTime() {
        System.out.println("Car service time: 6 months");
    }
}
class Bike implements Servicing {
    public void getServiceTime() {
        System.out.println("Bike service time: 3 months");
    }
}
public class Q5 {
    public static void main(String[] args) {
        Servicing s;
        s = new Car();
        s.getServiceTime();
        s = new Bike();
        s.getServiceTime();
    }
}
