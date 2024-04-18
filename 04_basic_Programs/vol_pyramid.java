//Volume Of Pyramid Java Program
import java.util.*;
public class vol_pyramid {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter base area: ");
    Double b = in.nextDouble();
    System.out.print("Enter height: ");
    Double h = in.nextDouble();
    Double volume = b*h/3;
    System.out.println(" Volume: " + volume);
    in.close();
  }
}
