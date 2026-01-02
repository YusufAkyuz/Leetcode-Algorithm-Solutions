import java.util.Arrays;
import java.util.Collections;

public class ReverseBits {

    public static String intToBinary(int n)
    {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
            n = n / 2;
        }
        return s;
    }
    public int reverseBits(int n) {
        String binaryString = intToBinary(n);
        String reverse = new StringBuffer(binaryString).reverse().toString();
        return Integer.parseInt(reverse);
    }

    public static void main(String[] args) {

    }
}
