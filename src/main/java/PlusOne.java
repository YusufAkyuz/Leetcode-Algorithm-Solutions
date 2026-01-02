public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Diziyi sondan başa doğru tara
        for (int i = n - 1; i >= 0; i--) {
            // Mevcut basamağı 1 artır
            digits[i]++;

            // Eğer basamak 10'dan küçükse, "elde" yoktur, işlem bitti.
            if (digits[i] < 10) {
                return digits;
            }

            // Eğer basamak 10 olduysa, onu 0 yap ve döngü devam etsin ("elde" bir sonrakine geçsin).
            digits[i] = 0;
        }

        // Eğer döngü buraya kadar geldiyse, tüm basamaklar 9'du demektir ([9,9,9] -> [1,0,0,0]).
        // Orijinal diziden bir büyük yeni bir dizi oluştur.
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // İlk elemanı 1 yap (kalanlar zaten 0).

        return newNumber;
    }

    public static void main(String[] args) {
        for (int value : plusOne(new int[] {1,2,9})) {
            System.out.print(value);
        }

    }
}
