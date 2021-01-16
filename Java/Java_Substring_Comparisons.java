package Java;

public class Java_Substring_Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int aux = 0;
        String[] auxArray = new String[s.length() - (k - 1)];
        String[] res = new String[s.length() - (k - 1)];

        for (int i = 1; i <= s.length() - k + 1; i++) {
            auxArray[aux] = s.substring(aux, k + aux);
            aux++;
        }
        aux = 0;
        smallest = auxArray[0];
        largest = auxArray[0];

        for (int j = 1; j <= auxArray.length - 1; j++) {
            // largest
            if (auxArray[aux].compareTo(largest) > 0) {
                largest = auxArray[aux];
            }

            // smallest
            if (auxArray[j].compareTo(smallest) < 0) {
                smallest = auxArray[j];
            }
            aux++;
        }

        return smallest + "\n" + largest;
    }

}
