import java.util.Arrays;
import java.util.Collections;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        // 0 olmayan sayıları koyacağımız pozisyonu tutan işaretçi
        int insertPos = 0;

        // Diziyi baştan sona gez
        for (int i = 0; i < nums.length; i++) {
            // Eğer sayı 0 DEĞİLSE işlem yapacağız
            if (nums[i] != 0) {

                // Swap (Takas) Mantığı
                // nums[i] ile nums[insertPos] yer değiştirir.
                // Bu sayede 0 olmayanlar sola, 0'lar sağa geçer.

                // Gereksiz takasları (kendi kendine takas) önlemek için if eklenebilir
                if (i != insertPos) {
                    int temp = nums[insertPos];
                    nums[insertPos] = nums[i];
                    nums[i] = temp;
                }

                // Bir sonraki 0 olmayan sayı bir yan kutuya gelmeli
                insertPos++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
