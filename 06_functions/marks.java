//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
import java.util.Scanner;
public class marks {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter marks out of 100");
    float marks = in.nextFloat();
    grade(marks);
    in.close();
  }

  private static void grade(float marks) {
    if (marks <= 40) {
      System.out.println("Fail");
    }
    else if (marks > 40 && marks <= 50) {
      System.out.println("DD");
    }
    else if (marks > 50 && marks <= 60) {
      System.out.println("CD");
    }
    else if (marks > 60 && marks <= 70) {
      System.out.println("BC");
    }
    else if (marks > 70 && marks <= 80) {
      System.out.println("BB");
    }
    else if (marks > 80 && marks <= 90) {
      System.out.println("AB");
    }
    else{
      System.out.println("AA");
    }
  }
}
