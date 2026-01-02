import java.lang.Math;

public class BinarySum {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder(); // sonucu ters ekleyeceğiz
        int i = a.length() - 1; // a'nın son basamağı
        int j = b.length() - 1; // b'nin son basamağı
        int carry = 0; // elde (0 veya 1)

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry; // önce carry ekle

            if (i >= 0) {
                // char -> int (ör. '1' -> 1)
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // sum 0,1,2 veya 3 olabilir
            // yeni basamak = sum % 2, yeni carry = sum / 2
            sb.append((char) ('0' + (sum % 2))); // 0 veya 1 karakterini ekle
            carry = sum / 2;
        }

        // sb şu an ters sırada (en düşük basamak ilk). Ters çevir.
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
