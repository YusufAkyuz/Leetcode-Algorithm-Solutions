import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        // 1. Dizinin boş olması durumunu kontrol et
        if (nums == null || nums.length == 0) {
            return result;
        }

        // 2. Diziyi baştan sona gezmek için bir döngü kur
        for (int i = 0; i < nums.length; i++) {
            // Mevcut aralığın başlangıç sayısını tut
            int start = nums[i];

            // 3. Ardışık sayıları bul:
            // Bir sonraki sayı, mevcut sayıdan tam olarak 1 fazla olduğu sürece ilerle
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            // 4. Aralığı formatla ve listeye ekle
            // Eğer i ilerlemişse (yani start != nums[i]), "a->b" formatını kullan
            if (start != nums[i]) {
                result.add(start + "->" + nums[i]);
            } else {
                // Eğer sadece tek bir sayı varsa, sadece o sayıyı ekle
                result.add(String.valueOf(start));
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
