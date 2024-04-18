//Volume Of Sphere Java Program
import java.util.*;
public class vol_sphere {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter radius: ");
    Double r = in.nextDouble();
    Double volume =4*Math.PI * r*r*r/3;
    System.out.println(" Volume: " + volume);
    in.close();
  }
}
