//Factorial Program In Java
import java.util.*;

public class factorial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number :");
    int n = scan.nextInt();
    System.out.println("Factorial is :"+ Factorial(n));
    scan.close();
  }

  public static int Factorial(int n) {
    if (n == 0 || n == 1)
      return 1;
    return n*Factorial(n-1);
  }
}