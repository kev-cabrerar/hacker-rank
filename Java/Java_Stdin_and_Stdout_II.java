package Java;

import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Java_Stdin_and_Stdout_II {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = "";

        while (scan.hasNextLine()) {
            s += scan.nextLine();
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
