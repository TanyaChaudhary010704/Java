// To find Armstrong Number between two given number.
import java.util.*;

public class armstong {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    getArmNumber(100,200);
    in.close();
  }
  
  static void getArmNumber(int start, int end) {
    for (int num = start; num < end; num++) {
      int digit = 0;
      int sum = 0;
      int copy = num;
      while (copy > 0) {
        digit = copy % 10;
        copy = copy / 10;
        sum += digit*digit*digit;
      }
      if (sum == num) {
        System.out.println(num);
      }
    }
  }
}
