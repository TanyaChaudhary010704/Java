// Vowel or Consonant

public class vowel {
  public static void main(String[] args) {
    String s = "Tanya";
    for (char ch : s.toLowerCase().toCharArray()) {
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        System.out.println(ch + " is a vowel");
      }
      else {
        System.out.println(ch + " is a consonant");
      }
    }
  }
}
