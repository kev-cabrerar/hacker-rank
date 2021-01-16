package Java;

import java.util.*;

class Java_Loops_II {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        double res = 0;
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            res = a;

            for (int j = 0; j < n; j++) {

                res += Math.pow(2, j) * b;
                System.out.print((int) res + " ");

            }
            System.out.println();
        }
        in.close();
    }
}
