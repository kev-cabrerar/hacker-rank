package Java;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {
        int cantA = 0;
        int cantB = 0;

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            cantA = 0;
            cantB = 0;
            String actual = a.substring(i, i + 1);

            // contar en a
            for (int j = 0; j < a.length(); j++) {
                String comparador = a.substring(j, j + 1);
                if (actual.equalsIgnoreCase(comparador)) {
                    cantA++;
                }
            }

            // contar en b
            for (int k = 0; k < a.length(); k++) {
                String comparador = b.substring(k, k + 1);
                if (actual.equalsIgnoreCase(comparador)) {
                    cantB++;
                }
            }

            if (cantA != cantB) {
                return false;
            }

            // System.out.println(actual+" ==> "+cantA+" -> "+cantB);
        }
        return true;
    }

}
