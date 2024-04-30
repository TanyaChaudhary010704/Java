
//Fing ncr and npr
import java.util.*;

public class ncr_npr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //ncr = n! / (r! * (n-r)!)
    //npr = n! / (n-r)!
    System.out.println("Enter the vlaue of n : ");
    int n = sc.nextInt();
    System.out.println("Enter the vlaue of r : ");
    int r = sc.nextInt();

    // Driver code
    System.out.println("nCr :" + nCr(n, r));
    System.out.println("nPr :" + nCr(n, r) * fact(r));
    sc.close();
  }
  
  static long nCr(int n, int r) {
    return fact(n) / (fact(r) *
        fact(n - r));
  }

  // Returns factorial of n
  static long fact(int n) {
    if (n == 0 || n == 1)
      return 1;
    long res = 1;
    for (int i = 2; i <= n; i++)
      res = res * i;
    return res;
  }
}
