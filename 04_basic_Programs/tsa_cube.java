//Total Surface Area Of Cube
import java.util.*;
public class tsa_cube {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter side: ");
    Double a = in.nextDouble();
    Double tsa = 6*a*a;
    System.out.println(" Total Surface Area : " + tsa);
    in.close();
  }
}
