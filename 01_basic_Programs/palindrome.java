
// To find out whether the given String is Palindrome or not.
import java.util.*;

public class palindrome {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    int left = 0;
    int right = s.length() - 1;
    boolean flag = true;
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        flag = false;
        break;
      }
      left++;
      right--;
    }
    if (flag) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
    in.close();
  }
}
