
//Input a number and print all the factors of that number (use loops).
import java.util.*;

public class factors {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    System.out.println("Factors: ");
    for (int i = 1; i < Math.sqrt(num); i++) {
      if (num % i == 0) {
        System.out.println(i+" , "+ num / i);
      }
    }
    in.close();
  }
}
