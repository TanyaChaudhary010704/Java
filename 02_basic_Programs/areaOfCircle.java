//Area Of Circle Java Program
import java.util.*;
public class areaOfCircle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter radius: ");
    float r = in.nextInt();
    double area = 2 * Math.PI * r;
    System.out.println(" Area: " + area);
    in.close();
  }
}
