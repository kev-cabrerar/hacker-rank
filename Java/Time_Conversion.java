package Java;

import java.io.*;
import java.util.*;

public class Time_Conversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String type = s.substring(s.length() - 2);
        String hourA = s.substring(0, s.length() - 2);
        String[] parts = hourA.split(":");
        String res = "";
        if (type.equals("PM")) {
            if (parts[0].equals("12") && type.equals("PM")) {
                res = hourA;
            } else {
                res = Integer.parseInt(parts[0]) + 12 + ":" + parts[1] + ":" + parts[2];
            }

        }

        if (type.equals("AM")) {
            if (parts[0].equals("12") && type.equals("AM")) {
                res = "00:" + parts[1] + ":" + parts[2];
            } else {
                res = hourA;
            }
        }

        System.out.println(res);
        System.out.println(parts[0].equals("12") && type.equals("AM"));
        System.out.println(parts[0]);
        System.out.println(type);
        return res;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
