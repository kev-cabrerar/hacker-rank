package Java;

import java.util.Scanner;

public class Java_Output_Formatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line
            String cant = String.valueOf(x);
            if (cant.length() <= 1) {
                System.out.format("%-14s 00%-14s\n", s1, x);
            } else if (cant.length() <= 2) {
                System.out.format("%-14s 0%-14s\n", s1, x);
            } else {
                System.out.format("%-14s %-14s\n", s1, x);
            }

        }
        System.out.println("================================");

    }
}
