public class FindTheIndexOfTheFirstOccurrenceInString {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        // Döngüyü, haystack'te needle'ın sığabileceği son yere kadar kuruyoruz.
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // haystack'in i'den başlayan alt string'ini needle ile karşılaştır.
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // Eşleşme bulundu, indeksi döndür.
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}
