//Perimeter Of Equilateral Triangle 
import java.util.*;

public class eq_triangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter side: ");
    Double a = in.nextDouble();
    Double perimeter = 3*a;
    System.out.println(" Perimeter: " + perimeter);
    in.close();
  }
}