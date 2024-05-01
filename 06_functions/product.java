//Write a program to return the product of two numbers entered by user by defining your own method.
import java.util.Scanner;
public class product {
  public static void main(String[] args) {
    System.out.println("Product :"+Product());
  }

  public static int Product() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter num1");
    int num1 = in.nextInt();
    System.out.println("Enter num2");
    int num2 = in.nextInt();
    in.close();
    return num1 * num2;
    
  }
}
