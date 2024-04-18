//Volume Of Prism Java Program
import java.util.*;
public class vol_prism {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter base area: ");
    Double b = in.nextDouble();
    System.out.print("Enter height: ");
    Double h = in.nextDouble();
    Double volume = b*h;
    System.out.println(" Volume: " + volume);
    in.close();
  }
}
