
//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.Scanner;

public class numbers {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int positiveEven = 0,
        positiveOdd = 0,
        negative = 0;
    int n = in.nextInt();
    while (n != 0) {
      if (n < 0)
        negative++;
      else if (n % 2 == 0)
        positiveEven++;
      else
        positiveOdd++;
        n = in.nextInt();
    }
    System.out.println("Positive evens: " + positiveEven);
    System.out.println("Positive odds: " + positiveOdd);
    System.out.println("Negatives: " + negative);
    in.close();
  }
}
