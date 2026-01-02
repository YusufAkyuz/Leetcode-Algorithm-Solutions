import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HappyNumber {
    public static int helper(int number) {
        int result = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            result = result + (digit * digit);
        }
        return result;
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);
            n = helper(n);

            if (n == 1) {
                return true;
            }
        }

        return false; // döngüye girerse
    }


    public static void main(String[] args) {
        System.out.println(helper(23));
    }
}
