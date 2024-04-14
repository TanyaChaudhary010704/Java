
//Area Of Triangle Java Program
import java.util.*;

public class areaOfRectangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter length: ");
    Double l = in.nextDouble();
    System.out.print("Enter breadth: ");
    Double b = in.nextDouble();
    Double area =b * l;
    System.out.println(" Area: " + area);
    in.close();
  }
}
