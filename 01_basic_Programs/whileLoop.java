//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;
public class whileLoop {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int sum = num;
    while (num != 0) {
      num = in.nextInt();
      sum += num;
    }
    System.out.println("Sum: "+ sum);
    in.close();
  }
}
