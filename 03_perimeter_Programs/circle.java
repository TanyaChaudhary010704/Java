//Perimeter Of Circle
import java.util.*;
public class circle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter radius: ");
    Double r = in.nextDouble();
    Double perimeter = Math.PI*2 * r;
    System.out.println(" Perimeter: " + perimeter);
    in.close();
  }
}
