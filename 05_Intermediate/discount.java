//Calculate Discount Of Product
import java.util.*;
public class discount {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Marked Price: ");
    double m = scan.nextDouble();
    System.out.println("Enter Selling Price: ");
    double s = scan.nextDouble();
    double discount = (m - s) / m * 100;
    System.out.println("Discount is :"+String.format("%.2f",discount)+"%");
    scan.close();
  }
}
