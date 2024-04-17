//Volume Of Cone Java Program
import java.util.*;
public class vol_cone {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter radius: ");
    Double r = in.nextDouble();
    System.out.print("Enter height: ");
    Double h = in.nextDouble();
    Double volume = Math.PI * r*r*h/3;
    System.out.println(" Volume: " + volume);
    in.close();
  }
}
