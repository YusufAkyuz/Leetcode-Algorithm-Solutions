public class Sqrt {
    public static int mySqrt(int x) {
        if (x < 2) return x; // 0 ve 1 için direkt sonucu döndür

        int left = 1;
        int right = x / 2;  // karekök x/2'den büyük olamaz (x > 1 için)
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // mid * mid yaparken taşma (overflow) riskine karşı long kullanıyoruz
            long square = (long) mid * mid;

            if (square == x) {
                return mid; // tam karekök bulundu
            } else if (square < x) {
                ans = mid;  // olası cevap
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans; // tam karekök bulunamadıysa, aşağı yuvarlanmış sonuç
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
