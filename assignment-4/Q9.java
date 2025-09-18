import java.util.Scanner;

class Point {
    int xCo, yCo;

    Point(int x, int y) {
        this.xCo = x;
        this.yCo = y;
    }

    double distanceBetPoints(Point p) {
        return Math.sqrt(Math.pow(this.xCo - p.xCo, 2) + Math.pow(this.yCo - p.yCo, 2));
    }
}

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coordinates of first point (x y): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter coordinates of second point (x y): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        double dist = p1.distanceBetPoints(p2);
        System.out.println("Distance between points: " + dist);
    }
}
