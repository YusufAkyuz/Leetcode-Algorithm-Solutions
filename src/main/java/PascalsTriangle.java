import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {

            // Bir önceki satırı referans al (üçgenin son eklenen elemanı).
            List<Integer> previousRow = triangle.get(i - 1);

            // İçinde bulunduğumuz yeni (geçerli) satırı oluştur.
            List<Integer> currentRow = new ArrayList<>();

            // 4. Her satırın başı her zaman '1'dir.
            currentRow.add(1);

            // 5. Ortadaki elemanları hesapla.
            //    Bu döngü, satırın 2. elemanından (j=1) sondan bir öncekine kadar çalışır.
            //    Her eleman, bir önceki satırdaki [j-1] ve [j] indekslerinin toplamıdır.
            for (int j = 1; j < i; j++) {
                int sum = previousRow.get(j - 1) + previousRow.get(j);
                currentRow.add(sum);
            }

            // 6. Her satırın sonu her zaman '1'dir.
            currentRow.add(1);

            // 7. Tamamlanan geçerli satırı ana üçgen listesine ekle.
            triangle.add(currentRow);
        }

        // 8. Tüm satırlar oluşturulduğunda, üçgenin tamamını döndür.
        return triangle;
    }

    public static void main(String[] args) {

    }
}
