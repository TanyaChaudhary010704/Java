//Area Of Circle Java Program
import java.util.*;
public class areaOfCircle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter radius: ");
    Double r = in.nextDouble();
    Double area = Math.PI*r * r;
    System.out.println(" Area: " + area);
    in.close();
  }
}
