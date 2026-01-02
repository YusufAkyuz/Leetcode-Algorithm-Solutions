public class Numberof1Bits {
    public int hammingWeight(int n) {
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;

        // Number should be positive
        while (n > 0) {
            binary[id++] = n % 2;
            n = n / 2;
        }

        int result = 0;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 1) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
