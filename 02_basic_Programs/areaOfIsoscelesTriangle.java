
//Area Of Triangle Java Program
import java.util.*;

public class areaOfIsoscelesTriangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter side1: ");
    Double a = in.nextDouble();
    System.out.print("Enter siide2: ");
    Double b = in.nextDouble();
    Double area =0.25*Math.sqrt(((a*a - b*b) /4) * b);
    System.out.println(" Area: " + area);
    in.close();
  }
}
