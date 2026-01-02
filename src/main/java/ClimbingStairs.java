import java.lang.Math;
public class ClimbingStairs {

    /*
        1. Dinamik Programlama nedir?
        Dynamic Programming (DP), büyük bir problemi daha küçük alt problemlere bölüp,
        bu alt problemlerin sonuçlarını saklayarak tekrar kullanma tekniğidir.
        Amaç:
          ➡️ Aynı alt problemleri tekrar hesaplamamaktır.
          ➡️ Böylece hem zaman kazanırsın hem verim artar.
    */
    public static int climbStairs(int n) {
        if (n <= 2) return n; // temel durumlar
        int a = 1, b = 2; // a = f(1), b = f(2)
        for (int i = 3; i <= n; i++) {
            int temp = a + b; // f(i) = f(i-1) + f(i-2)
            a = b; // bir adım ilerlet
            b = temp;
        }
        return b; // son hesaplanan değer f(n)
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
