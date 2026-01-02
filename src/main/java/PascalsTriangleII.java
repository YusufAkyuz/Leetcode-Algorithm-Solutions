import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = generatePascalTriangle(34);
        return triangle.get(rowIndex);
    }
    public static List<List<Integer>> generatePascalTriangle(int rows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (rows == 0) {
            return triangle;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < rows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> previousRow = triangle.get(i-1);
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                int sum = previousRow.get(j-1) + previousRow.get(j);
                currentRow.add(sum);
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }
    public static void main(String[] args) {

    }
}
