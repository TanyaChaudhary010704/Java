//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

public class largest_of_three {
  public static void main(String[] args) {
    //Enter three numbers
    int num1 = 20;
    int num2 = 10;
    int num3 = 30;
    //output
    System.out.println("Max: " + maximum(num1, num2, num3));
    System.out.println("Min: " + minimum(num1, num2, num3));
  }
  //function to find the minimum of three integers
  public static int maximum(int num1, int num2, int num3) {
    int max = num1;
    max = num1 > num2 ? num1 : num2;
    max = num3 > max ? num3 : max;
    return max;
  }
  //function to find the maximum of three integers
  public static int minimum(int num1, int num2, int num3) {
    int min = num1;
    min=num1<num2?num1:num2;
    min = num3 < min ? num3 : min;
    return min;
  }
}
