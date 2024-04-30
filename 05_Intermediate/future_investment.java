//Future Investment Value

public class future_investment {
  public static void main(String[] args) {
    //Present value
    double p = 1000;
    //number of months
    int n = 10;
    //monthly rate interest in %
    int r = 1;
    //future value
    double fv = p * Math.pow(r + 1, n);
    System.out.println("Future value : "+ fv);
  }
}