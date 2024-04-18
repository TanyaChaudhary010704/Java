//Subtract the Product and Sum of Digits of an Integer
import java.util.*;
public class digits {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int sum = 0;
    int product = 1;
    while (num > 0) {
      sum += num % 10;
      product *= num % 10;
      num /= 10;
    }
    System.out.println("Product of digits - Sum of digits is -> ");
    System.out.println(product-sum);
    in.close();
  } 
}
