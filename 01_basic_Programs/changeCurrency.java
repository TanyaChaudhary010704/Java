
// Input currency in rupees and output in USD.
import java.util.*;

public class changeCurrency {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    float currency = in.nextFloat();
    String usd = String.format(java.util.Locale.US, "%.2f", currency * 0.012);
    ;
    System.out.println("$ " + usd);
    in.close();
  }
}
