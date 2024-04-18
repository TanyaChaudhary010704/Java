//Curved Surface Area Of Cylinder
import java.util.*;
public class csa_cylinder {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter radius: ");
    Double r = in.nextDouble();
    System.out.print("Enter height: ");
    Double h = in.nextDouble();
    Double csa = 2*Math.PI * r*h;
    System.out.println(" Curved Surface Area : " + csa);
    in.close();
  }
}
