import java.util.*;
class InvalidInputException extends Exception {
    InvalidInputException(String msg) {
        super(msg);
    }
}
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter feet: ");
            double feet = sc.nextDouble();
            System.out.print("Enter inches: ");
            double inches = sc.nextDouble();
            if (feet < 0 || inches < 0)
                throw new InvalidInputException("Feet or inches cannot be negative.");
            double cm = (feet * 12 + inches) * 2.54;
            System.out.println("Length in centimetres: " + cm);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Please enter valid numeric values.");
        }
    }
}
