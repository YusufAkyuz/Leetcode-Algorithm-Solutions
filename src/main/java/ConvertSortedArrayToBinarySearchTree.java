public class ConvertSortedArrayToBinarySearchTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        // Özyinelemeyi tüm dizi için başlat (0'dan son indekse kadar).
        return buildTreeHelper(nums, 0, nums.length - 1);
    }

    private TreeNode buildTreeHelper(int[] nums, int left, int right) {
        // Temel Durum (Base Case): Eğer sol indeks sağ indeksi geçerse,
        // bu aralıkta eleman kalmamıştır, bu yüzden null döndür.
        if (left > right) {
            return null;
        }

        // 1. Ortadaki elemanı bul. Bu, mevcut alt ağacın kökü olacak.
        //    (left + right) / 2 yerine bu yöntem, olası integer taşmasını önler.
        int mid = left + (right - left) / 2;

        // 2. Kök düğümü oluştur.
        TreeNode root = new TreeNode(nums[mid]);

        // 3. Sol alt ağacı, dizinin sol yarısını kullanarak özyinelemeli olarak oluştur.
        //    Orta elemanın solundaki aralık: [left, mid - 1]
        root.left = buildTreeHelper(nums, left, mid - 1);

        // 4. Sağ alt ağacı, dizinin sağ yarısını kullanarak özyinelemeli olarak oluştur.
        //    Orta elemanın sağındaki aralık: [mid + 1, right]
        root.right = buildTreeHelper(nums, mid + 1, right);

        // Oluşturulan kökü (ve ona bağlı alt ağaçları) geri döndür.
        return root;
    }

    public static void main(String[] args) {

    }
}
