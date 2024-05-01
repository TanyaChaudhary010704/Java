//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class eligiblity_for_vote {
  public static void main(String[] args) {
    int age = 10;
    System.out.println("Age :" + age + "\n" + eligible(age));
  }

  public static String eligible(int age) {
    if (age >= 18)
      return "Eligible to vote";
    return "Not Eligible to vote";  
  }
}
