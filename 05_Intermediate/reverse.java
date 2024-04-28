//Reverse A String In Java
import java.util.*;
public class reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String rev = new String();
    for (char c : s.toCharArray()) {
      rev = c + rev;
    }
    System.out.println("Reversed String : "+rev);
    sc.close();
  }
}
