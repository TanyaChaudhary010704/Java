
//Area Of Equilateral Triangle Java Program
import java.util.*;

public class areaOfEquilateralTriangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter side: ");
    Double a = in.nextDouble();
    Double area =Math.sqrt(3)*a*a/4;
    System.out.println(" Area: " + area);
    in.close();
  }
}
