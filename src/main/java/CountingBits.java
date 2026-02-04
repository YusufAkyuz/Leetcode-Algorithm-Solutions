public class CountingBits {
    ////////////////////////////////////////////////////////////////////////
    // Eski Çözüm Bu: Hem çok yavaş hem bellek tüketimi çok
    ////////////////////////////////////////////////////////////////////////
    public int[] countBits(int n) {
        String[] binaryReps = new String[n + 1];
        int[] result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            String binary = getBinaryRep(i);
            binaryReps[i] = binary;
        }

        for (int i = 0; i < binaryReps.length; i++) {
            int numberOfOnes = 0;
            char[] arr = binaryReps[i].toCharArray();
            for (Character character : arr) {
                if (character == '1') {
                    numberOfOnes++;
                }
            }
            result[i] = numberOfOnes;
        }
        return result;
    }

    static String getBinaryRep(int n) {
        String ans = "";
        // 32 bitlik integer'ı kontrol et
        for (int i = 31; i >= 0; i--) {
            if ((n & (1 << i)) != 0) ans += '1';
            else ans += '0';
        }
        return ans;
    }

    //////////////////////////////////////////////////////////////////////////////////////
    // Yeni Çözüm Bu: Hem çok hızmı hem bellek tüketimi az çünkü sadece matematiksel işlem
    //////////////////////////////////////////////////////////////////////////////////////

    public int[] countBitsFast(int n) {

        int[] result = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            result[i] =findNumberOfbits(i);
        }
        return result;
    }

    public int findNumberOfbits(int n)
    {
        int count=0;
        //Aşağıdaki döngü her defasında en sağdaki 1 bitini silecektir
        while(n!=0)
        {
            n= n&n-1;
            count++;

        }
        return count;
    }

    public static void main(String[] args) {

    }
}
