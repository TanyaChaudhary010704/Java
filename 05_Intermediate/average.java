// Calculate average of N values
import java.util.*;
public class average {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of values");
    int n = scan.nextInt();
    int sum = 0;
    for (int i = 0; i < n; i++) {
      System.out.println("Enter number");
      sum += scan.nextInt();
    }
    System.out.println("Average is :"+sum/n);
    scan.close();
  }
}
