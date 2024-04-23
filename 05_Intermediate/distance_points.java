//Calculate Distance Between Two Points
import java.util.*;
public class distance_points {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter x1: ");
    int x1 = scan.nextInt();
    System.out.println("Enter y1: ");
    int y1 = scan.nextInt();
    System.out.println("Enter x2: ");
    int x2 = scan.nextInt();
    System.out.println("Enter y2: ");
    int y2 = scan.nextInt();
    double distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y2-y1, 2));
    System.out.println("Distance is :"+String.format("%.2f",distance));
    scan.close();
  }
}
