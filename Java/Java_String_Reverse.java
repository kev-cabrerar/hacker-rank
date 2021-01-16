package Java;

import java.util.*;

public class Java_String_Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int size = A.length();
        String flag = "Yes";

        for (int i = 0; i <= A.length() - 1; i++) {
            String auxA = A.substring(i, i + 1);
            String auxB = A.substring(size - 1, size);

            if (!auxA.equals(auxB)) {
                flag = "No";
            }

            size--;

        }
        System.out.print(flag);

    }
}
