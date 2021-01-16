package Java;

import java.util.*;

public class Staircase {

    // Complete the staircase function below.

    static void staircase(int n) {

        String spaces = "";
        String a = spaces + "#";
        int cant = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cant; j++) {
                spaces += " ";
            }
            cant--;
            System.out.println(spaces + a);
            a += "#";
            spaces = "";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
