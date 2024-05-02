//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
public class pythagoreanTriplet {
  public static void main(String[] args) {
    int side1 = 6;
    int side2 = 4;
    int side3 = 5;
    if (pytharogus(side1, side2, side3)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean pytharogus(int side1, int side2, int side3) {
    int maxSide = side1>side2 ? side1 : side2;
    maxSide = side3 > maxSide ? side3 : maxSide;
    if (maxSide == side1 && maxSide*maxSide == (side2*side2 + side3*side3)) {
      return true;
    }
    else if (maxSide == side2 && maxSide*maxSide == (side1*side1 + side3*side3)) {
      return true;
    }
    else if (maxSide == side3 && maxSide * maxSide == (side2 * side2 + side1 * side1)) {
      return true;
    }
    return false;
  }
}
