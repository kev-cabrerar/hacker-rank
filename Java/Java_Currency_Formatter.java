package Java;

import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Java_Currency_Formatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + currency.format(payment));

        currency = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        System.out.println("India: " + currency.format(payment));

        currency = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + currency.format(payment));

        currency = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + currency.format(payment));
    }
}
