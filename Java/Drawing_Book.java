package Java;

import java.io.*;
import java.util.*;

public class Drawing_Book {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int totalPaginas, int paginaObj) {

        int res = 0;
        int asc = 0;
        int des = 0;
        int aux1 = 0;
        int aux2 = 2;

        // Ascendente
        for (int i = 0; i < totalPaginas; i++) {
            if (i > paginaObj) {
                break;
            }
            if (i == aux2) {
                aux2 += 2;
                aux1++;
            }

            System.out.println("i = " + i + " aux1 = " + aux1);

        }
        asc = aux1;
        aux1 = 0;

        if (totalPaginas % 2 == 0) {
            totalPaginas++;
        }
        aux2 = totalPaginas - 2;

        if (aux2 < 0) {
            aux2 = 0;
        }

        // Descendente
        for (int j = totalPaginas; j >= 0; j--) {
            if (j < paginaObj) {
                break;
            }
            if (j == aux2) {
                aux2 -= 2;
                aux1++;
            }

            System.out.println("j = " + j + " aux1 = " + aux1);

        }
        des = aux1;

        res = Math.min(asc, des);

        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
