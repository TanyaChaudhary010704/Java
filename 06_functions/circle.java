//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.Scanner;
public class circle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Radius: ");
    double r = in.nextDouble();
    circumference(r);
    in.close();
  }

  private static void circumference(double r) {
    System.out.println("Circumference: "+ 3.14*r*2);
    System.out.println("Area: "+ 3.14*r*r);
  }
}
