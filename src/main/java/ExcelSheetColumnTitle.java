public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        /*
        columnNumber--
        Excel’de A=1, B=2, ..., Z=26 olduğu için sayı bazlı algı sıfırlanıyor.
        Yani 0=A, 25=Z şeklinde kullanılabilir hale geliyor.

        int remainder = columnNumber % 26
        Her adımda 0–25 arası bir değer çıkar.
        Bu değer hangi harfin geleceğini belirler.

        char letter = (char)('A' + remainder)
        0 → 'A'
        25 → 'Z'

        result.insert(0, letter)
        Bulunan harf string’in en soluna eklenir.
        Çünkü en sondan en başa doğru buluyoruz.

        columnNumber /= 26
        Bir üst basamağa geçilir.

        Örnek Çalışma
        Input: 28

        Döngü:

        28-1 = 27 → 27 % 26 = 1 → 'B'

        27/26 = 1

        1-1 = 0 → 0 % 26 = 0 → 'A'

        sonuç: "AB"
         */
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // 1 bazlı sistemi 0 bazlı hale getir
            int remainder = columnNumber % 26; // son harf
            char letter = (char) ('A' + remainder); // harfe çevir
            result.insert(0, letter); // başa ekle
            columnNumber /= 26; // bir üst basamağa geç
        }

        return result.toString();
    }
}
