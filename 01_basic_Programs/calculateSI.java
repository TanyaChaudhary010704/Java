
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;

public class calculateSI {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    float principal = in.nextFloat();
    float rate = in.nextFloat();
    float time = in.nextFloat();
    float amount = principal * rate * time / 100;
    System.out.println(amount);
    in.close();
  }
}
