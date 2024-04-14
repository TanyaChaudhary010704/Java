
//Area Of Triangle Java Program
import java.util.*;

public class areaOfTriangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter base: ");
    Double b = in.nextDouble();
    System.out.print("Enter Height: ");
    Double h = in.nextDouble();
    Double area = 0.5 * b * h;
    System.out.println(" Area: " + area);
    in.close();
  }
}
