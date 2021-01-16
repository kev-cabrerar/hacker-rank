package Java;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Subarray_Division {

    // Complete the birthday function below.
    static int birthday(List<Integer> lista, int d, int m) {

        int count = 0;
        int res = 0;

        for (int i = 0; i <= lista.size() - m; i++) {
            count = 0;
            List<Integer> first = new ArrayList<>(lista.subList(i, i + m));

            for (int k : first) {
                count += k;
            }

            if (count == d) {
                res++;
            }
            System.out.println(i + " -> " + (i + m) + " " + first + " => " + count + " => " + (count == d));
        }

        return (res);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
