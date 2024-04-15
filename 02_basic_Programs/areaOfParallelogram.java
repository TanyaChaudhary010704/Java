
//Area Of TParallelogram Java Program
import java.util.*;

public class areaOfParallelogram {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter height: ");
    Double h = in.nextDouble();
    System.out.print("Enter base: ");
    Double b = in.nextDouble();
    Double area =b * h;
    System.out.println(" Area: " + area);
    in.close();
  }
}

