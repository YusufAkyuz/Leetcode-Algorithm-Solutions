import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static class TreeNode {
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
    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {

            // Reach the left most TreeNode of the curr TreeNode
            while (curr != null) {

                // Place pointer to a tree TreeNode on
                // the stack before traversing
                // the TreeNode's left subtree
                stack.push(curr);
                curr = curr.left;
            }

            // Current must be NULL at this point
            curr = stack.pop();
            result.add(curr.val);

            // we have visited the TreeNode and its
            // left subtree. Now, it's right
            // subtree's turn
            curr = curr.right;
        }

        return result;
    }

    //Solution 2
    public List<Integer> inorderTraversalRecursiveSolution(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    /**
     * Bu, asıl özyinelemeli işi yapan yardımcı metottur.
     * @param node Mevcut olarak ziyaret edilen düğüm.
     * @param list Sonuçların eklendiği liste.
     */
    private void inorderHelper(TreeNode node, List<Integer> list) {
        // Temel durum: Eğer düğüm null ise, dalın sonuna gelinmiştir, geri dön.
        if (node == null) {
            return;
        }

        // 1. Adım: Önce sol alt ağacı tamamen dolaş.
        inorderHelper(node.left, list);

        // 2. Adım: Sol taraf bitince, mevcut düğümün değerini listeye ekle.
        list.add(node.val);

        // 3. Adım: En son sağ alt ağacı tamamen dolaş.
        inorderHelper(node.right, list);
    }

    public static void main(String[] args) {
        // Örnek 1: root = [1, null, 2, 3] ağacını oluşturalım.
        // Ağacın yapısı:
        //   1
        //    \
        //     2
        //    /
        //   3

        // Düğümleri oluşturuyoruz
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        // Düğümleri birbirine bağlıyoruz
        root.right = node2; // 1'in sağ çocuğu 2
        node2.left = node3; // 2'nin sol çocuğu 3

        System.out.println("Test için ağaç oluşturuldu.");
        System.out.println("Kök düğümün değeri: " + root.val);
        System.out.println("Kökün sağ çocuğunun değeri: " + root.right.val);
        System.out.println("Kökün sağ çocuğunun sol çocuğunun değeri: " + root.right.left.val);

        List<Integer> result = inorderTraversal(root);
        System.out.println("Inorder Traversal Sonucu: " + result); // Beklenen Çıktı: [1, 3, 2]
    }
}
