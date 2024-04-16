//Perimeter Of Rectangle
import java.util.*;

public class rectangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter side1: ");
    Double a = in.nextDouble();
    System.out.print("Enter side2: ");
    Double b = in.nextDouble();
    Double perimeter = 2*(a+b);
    System.out.println(" Perimeter: " + perimeter);
    in.close();
  }
}
