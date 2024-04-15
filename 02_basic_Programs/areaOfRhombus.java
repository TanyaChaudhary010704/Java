
//Area Of Rhombus Java Program
import java.util.*;

public class areaOfRhombus {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter height 1: ");
    Double h1 = in.nextDouble();
    System.out.print("Enter Height 2: ");
    Double h2 = in.nextDouble();
    Double area = 0.5 * h1 * h2;
    System.out.println(" Area: " + area);
    in.close();
  }
}
