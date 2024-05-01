//Define a program to find out whether a given number is even or odd.

public class EvenOdd {
  public static void main(String[] args) {
    int num = 12;
    System.out.println(num + " is " + isEven(num));
  }

  public static String isEven(int num) {
    if (num % 2 == 0)
      return "even";
    return "odd";
  }
}
