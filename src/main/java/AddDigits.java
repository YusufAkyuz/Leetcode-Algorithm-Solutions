public class AddDigits {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;

        /*
        O(1) çzöümü için mod 9'u kullananlar olmuş:
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
         */
    }

    public static void main(String[] args) {

    }
}
