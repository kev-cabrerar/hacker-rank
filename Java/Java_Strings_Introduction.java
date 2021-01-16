package Java;

import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int p1 = A.length() + B.length();
        String flag = (A.compareTo(B) > 0) ? "Yes" : "No";
        String cam = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
                + B.substring(1);

        System.out.println(p1);
        System.out.println(flag);
        System.out.println(cam);
        /* Enter your code here. Print output to STDOUT. */

    }
}
