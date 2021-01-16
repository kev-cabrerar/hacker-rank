package Java;

import java.util.*;

public class Plus_Minus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int plus = 0;
        int minus = 0;
        int zeros = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                zeros++;
                continue;
            }

            if (arr[i] == Math.abs(arr[i])) {
                plus++;
                continue;
            }

            if (arr[i] != Math.abs(arr[i])) {
                minus++;
                continue;
            }

        }
        System.out.println((float) plus / size);
        System.out.println((float) minus / size);
        System.out.println((float) zeros / size);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
