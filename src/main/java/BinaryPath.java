import java.util.ArrayList;
import java.util.List;

public class BinaryPath {
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

    public List<String> binaryTreePaths(TreeNode root) {
        // Cevap listmei tutacağım list'i oluşturup yardımcı fonksiyon aracılığıyla DFS(Recursive) yapacam.
        List<String> answer = new ArrayList<>();

        if (root != null) {
            search(root, "", answer);
        }

        return answer;
    }

    private void search(TreeNode node, String path, List<String> answer) {

        //Eğer hem left child ve right child yoksa listeye sadece o ona kadar bulunan path'i eklicem
        if (node.left == null && node.right == null) {
            answer.add(path + node.val);
        }

        //Left child'ı varsa recursive bir şekilde yeni path'i vererek ilerlicem
        if (node.left != null) {
            search(node.left, path + node.val + "->", answer);
        }

        //Right child'ı varsa recursive bir şekilde yeni path'i vererek ilerlicem
        if (node.right != null) {
            search(node.right, path + node.val + "->", answer);
        }
    }

    public static void main(String[] args) {

    }
}
