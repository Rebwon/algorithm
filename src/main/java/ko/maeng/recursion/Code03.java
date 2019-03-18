package ko.maeng.recursion;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        System.out.println(length("apple"));
        printchars("recursive");
        System.out.println();
        printcharsReverse("heaven");
        System.out.println();
        printInBinary(8);
    }

    public static int length(String str) {
        if (str.equals(""))
            return 0;
        else
            return 1 + length(str.substring(1));
    }

    public static void printchars(String str) {
        if (str.length() == 0)
            return;
        else {
            System.out.print(str.charAt(0));
            printchars(str.substring(1));
        }
    }

    public static void printcharsReverse(String str) {
        if (str.length() == 0)
            return;
        else {
            printcharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    public static void printInBinary(int n) {
        if (n < 2)
            System.out.print(n);
        else {
            printInBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    public static int sum(int n, int[] data) {
        if (n <= 0)
            return 0;
        else
            return sum(n - 1, data) + data[n - 1];
    }

    public static void readFrom(int n, int[] data, Scanner in) {
        if (n == 0)
            return;
        else {
            readFrom(n - 1, data, in);
            data[n - 1] = in.nextInt();
        }
    }
}
