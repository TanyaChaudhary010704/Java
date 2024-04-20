
import java.util.*;

public class electricityBill {
  public static void main(String args[]) {
    int units;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of units for calculating electricity bill.");
    units = sc.nextInt();
    sc.close();
    double billToPay = 0;
    if (units < 100) {
      billToPay = units * 1.20;
    } else if (units < 300) {
      billToPay = 100 * 1.20 + (units - 100) * 2;
    } else{
      billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
    }
    System.out.println("The electricity bill for " + units + " is : " + billToPay);
  }
}
