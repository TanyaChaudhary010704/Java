//Define a method to find out if a number is prime or not.
public class prime {
  public static void main(String[] args) {
    //Enter the number
    int num =3;
    //Output the result
    if (isprime(num)) {
      System.out.println("Number is prime");
    }
    else {
      System.out.println("Number is not prime");
    }
  }
  //function to find out if a number is prime or not.
  private static boolean isprime(int num) {
    if(num<2) return false;
    //checking upto the square root of the number
    for (int i = 2; i < num; i++) {
      //if num is divisible by i then it is prime
      if (num % i == 0) {
        return false;
      }
    }
    //othwise it is not prime
    return true;
  }
}
