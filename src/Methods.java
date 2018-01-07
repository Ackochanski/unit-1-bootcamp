import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    public static void main(String args[]) {
        System.out.println(calculateSquare(4));
        System.out.println(calculateSquareRoot(100));
        System.out.println(toLowerCase("Hello There!"));
        System.out.println(isMultiple(2, 3));
        prettyInteger(8);
        System.out.println(returnRandom(5, 50));


    }

    public static int calculateSquare(int input) {
        int square = input * input;
        return square;
    }

    public static double calculateSquareRoot(int input) {
        return Math.sqrt(input);
    }

    public static String toLowerCase(String input) {
        return input.toLowerCase();
    }

    public static boolean isMultiple(int x, int y) {
        if (y % x == 0) {
            return true;
        }
        return false;

    }

    public static void prettyInteger(int input) {
        char myChar = '*';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input; i++) {
            sb.append(myChar);
        }
        sb.append(input);
        for (int i = 0; i < input; i++) {
            sb.append(myChar);
        }
        System.out.println(sb);


    }

    public static int returnRandom(int min, int max) {

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;


    }

}