//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;
public class sum {
  public static void main(String[] args) {
    Sum();
  }

  public static void Sum() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter num1");
    int num1 = in.nextInt();
    System.out.println("Enter num2");
    int num2 = in.nextInt();
    in.close();
    int sum=num1+num2;
    System.out.println("Sum :"+sum);
    
  }
}
