
// Take in two numbers and an operator (+, -, *, /) and calculate the value.
import java.util.*;

public class calculator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char op = in.next().trim().charAt(0);
    int ans = 0;
    if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
      int num1 = in.nextInt();
      int num2 = in.nextInt();

      if (op == '+') {
        ans = num1 + num2;
      }
      if (op == '-') {
        ans = num1 - num2;
      }
      if (op == '*') {
        ans = num1 * num2;
      }
      if (op == '/') {
        ans = num1 / num2;
      }
      if (op == '%') {
        ans = num1 % num2;
      }
      System.out.println(ans);
    } else {
      System.out.println("Invalid Operator");
    }
    in.close();
  }
}
