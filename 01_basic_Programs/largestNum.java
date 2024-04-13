
// Take 2 numbers as input and print the largest number.
import java.util.*;

public class largestNum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int largest = num1 > num2 ? num1 : num2;
    System.out.println(largest);
    in.close();
  }
}
