
// To calculate Fibonacci Series up to n numbers.
import java.util.*;

public class fabonacii {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a1 = 0;
    int a2 = 1;
    int count = 2;
    if (n == 1) {
      System.out.println(a1);
    } else if (n == 2) {
      System.out.print(a1 + " ");
      System.out.print(a2 + " ");
    } else {
      System.out.print(a1 + " ");
      System.out.print(a2 + " ");
    }
    while (count < n) {
      int temp = a2;
      a2 = a1 + a2;
      a1 = temp;
      count++;
      System.out.print(a2 + " ");
      in.close();
    }
  }
}
