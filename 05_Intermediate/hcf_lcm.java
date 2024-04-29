
//Fing HCf & LCM of Two numbers Program
import java.util.*;

public class hcf_lcm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number 1: ");
    int n1 = sc.nextInt();
    System.out.println("Enter number 2 : ");
    int n2 = sc.nextInt();
    System.out.println("HCF :" + hcf(n1, n2));
    System.out.println("LCM :" + lcm(n1, n2));
    sc.close();
  }

  public static int lcm(int a, int b) {
    int ans = (a > b) ? a : b;
    while (true) {
      if (ans % a == 0 && ans % b == 0)
        break;
      ans++;
    }
    return ans;
  }

  public static int hcf(int a, int b) {
    int hcf = 0;
    for (int i = 1; i <= a || i <= b; i++) {
      if (a % i == 0 && b % i == 0)
        hcf = i;
    }
    return hcf;
  }

}
