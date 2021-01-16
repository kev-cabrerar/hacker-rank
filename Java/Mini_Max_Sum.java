package Java;

import java.math.*;
import java.util.*;

public class Mini_Max_Sum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        BigInteger sumMax = new BigInteger("0");
        BigInteger sumMin = new BigInteger("0");
        BigInteger resMax = new BigInteger("0");
        BigInteger resMin = new BigInteger("0");

        for (int i = arr.length - 1; i > arr.length - 5; i--) {
            // resMax += (int)arr[i];
            sumMax = sumMax.add(resMax.valueOf(arr[i]));
        }
        for (int i = 0; i < 4; i++) {
            // resMin += (int)arr[i];
            sumMin = sumMin.add(resMin.valueOf(arr[i]));
        }
        System.out.println(sumMin + " " + sumMax);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
