package Java;

import java.util.Scanner;

public class Java_Static_Initializer_Block {

    static boolean flag = false;
    static int B = 0;
    static int H = 0;
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;
        }

    }

}
