// Perfect number in java
import java.util.*;
public class perfectNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number:");
    //input number
    int num = in.nextInt();
    //output reuslt
    System.out.println("Is number perfect?" + isPerfect(num));
    in.close();
  }
  
  static boolean isPerfect(int num) {
      int sum = 0;
      int i = 2;
      while (i <= Math.sqrt(num)) {
        if (num % i == 0) {
          //adding all divisors
          sum += i + num / i;
        }
        i++;
      }
      //for divisor 1
      sum++;
      if (sum == num) {
        return true;
      }
      return false;
    }
}




  


