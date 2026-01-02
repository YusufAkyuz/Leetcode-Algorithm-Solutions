import java.util.Stack;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // 1. İşaretçileri ayarla
        int left = 0;
        int right = s.length() - 1;

        // 2. Ana Döngü: İşaretçiler ortada buluşana kadar devam et
        while (left < right) {

            // 3. Soldaki işaretçiyi (left) geçerli bir karaktere ilerlet
            //    (Harf veya rakam olmayanı atla)
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // 4. Sağdaki işaretçiyi (right) geçerli bir karaktere ilerlet
            //    (Harf veya rakam olmayanı atla)
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // 5. Karakterleri Karşılaştır (küçük harfe çevirerek)
            //    Eğer iki işaretçi de geçerli karakterdeyken eşleşmezlerse,
            //    bu bir palindrom değildir.
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // 6. Karakterler eşleşti, işaretçileri merkeze doğru birer adım kaydır
            left++;
            right--;
        }

        // 7. Eğer döngü hiç "false" döndürmeden biterse,
        //    bu bir palindromdur.
        return true;
    }

    public static void main(String[] args) {

    }
}
