//Write a function that returns all prime numbers between two given numbers.
public class allPrime {
  public static void main(String[] args) {
    //Enter the range
    int start = 0;
    int end = 100;
    //Output the result
    primes(start,end);
  }
  //function to find out if a number is prime or not.
  private static void primes(int start, int end) {
    
    for (int num = start; num < end; num++) {
      
      boolean flag = true;
      if(num<2) flag = false;
    //checking upto the square root of the number
    for (int i = 2; i < num; i++) {
      //if num is divisible by i then it is not prime
      if (num % i == 0) {
        flag= false;
      }
    }
    //othwise it is prime
    if (flag) {
      System.out.println(num);
    }
    }
    
  }
}
