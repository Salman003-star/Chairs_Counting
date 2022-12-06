import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ok = new Scanner(System.in);
    // Take input From User
    System.out.println("Enter the String E or L");
    String s = ok.nextLine();
    int c = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'E') {
        c++;
      } else {
        c--;
        if (c < 1) {
          c = 1;
        }
      }
    }
    System.out.println("Count is=" + c);

  }
  /*
   * input s = "EELEE"
   * output = 3;
   * input s = "EL"
   * output = 1;
   */

}
