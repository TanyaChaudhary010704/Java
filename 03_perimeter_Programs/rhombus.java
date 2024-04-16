//Perimeter Of Rhombus
import java.util.*;
public class rhombus {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter side: ");
    Double a = in.nextDouble();
    Double perimeter = 4*a;
    System.out.println(" Perimeter: " + perimeter);
    in.close();
  }
}
