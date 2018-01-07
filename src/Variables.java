/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

  public static void main(String args[]) {

    System.out.println(greatestCommonFactor(54, 24));

  }

  public static boolean isOdd(int input) {
    if (input % 2 == 0) {
      return true;
    }
    return false;
  }

  public static void printHelloWorld() {
    System.out.println("Hello World");
  }

  public static int greatestCommonFactor(int a, int b) {

    while(b != 0){
      int c = a % b;
      a = b;
      b = c;
    }
    return a;

  }
}


