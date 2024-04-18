//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.*;
public class whileLoop2 {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int max = num;
    while (num != 0) {
      num = in.nextInt();
      max = max>num ? max : num;
    }
    System.out.println("Largest number is: "+ max);
    in.close();
  }
}

