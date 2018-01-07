/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {
        printNums();
        printMoreNums();
        printToN(16);
        printEvensToN(27);
        printSum();
        printSumToN(24);
        printSumOneToOneThousand();
        printString(10, "hello");
        printFibonacciNums();

    }

    public static void printNums() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
    }

    public static void printMoreNums() {
        int x = 1;
        while (x <= 10) {
            System.out.println(x++);

        }
    }

    public static void printToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);

        }
    }

    public static void printEvensToN(int n) {
        int x = 2;
        while (x <= n) {
            System.out.println(x);
            x += 2;


        }
    }

    public static void printSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printSumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        System.out.println(sum);
    }

    public static void printSumOneToOneThousand() {
        printSumToN(1000);
    }

    public static void printString(int n, String s) {
        for (int i = 0; i <= n; i++) {
            System.out.println(s);
        }
        if (n < 0) {
            System.out.println("");
        }

    }

    public static void printFibonacciNums() {
        int n;
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 1; i <= 10; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + " ");

        }
    }


}
