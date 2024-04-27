//Calculate CGPA Java Program
import java.util.*;

public class cgpa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] scores = {90,80,70,80,90};
    double cgpa =0;
    for (double score : scores) {
      cgpa += score / 10;
    }
    System.out.println("CGPA: ");
    System.out.println(cgpa / scores.length);
    System.out.println("Percentage of CGPA:");
    System.out.println(String.format("%.1f",9.5 *cgpa / scores.length ));
    sc.close();
  }
}