package Java;

import java.util.*;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String[] res = s.split("[!,?.*_'@\\ ]+");

        if (s.length() == 0) {
            System.out.println(0);
            return;
        } else if (s.length() > 400000) {
            return;
        } else {
            int size = res.length;
            System.out.println(size);
            for (String word : res) {
                System.out.println(word);

            }
        }

        scan.close();
    }
}
