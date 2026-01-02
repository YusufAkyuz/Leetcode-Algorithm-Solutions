public class MinimumDepthBinaryTree {
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
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            // Eğer bir taraf null ise, o tarafın derinliği 0 gelir.
            int left = minDepth(root.left);
            int right = minDepth(root.right);

            // Eğer sol veya sağ taraf 0 değilse (yani her iki çocuk da varsa)
            // o zaman minimum olanı al.
            // Ama eğer BİRİ 0 ise (yani tek çocuk varsa), o zaman 0 olmayanı al (toplamları).
            // Eğer İKİSİ de 0 ise (yapraksa), o zaman da 1 döner.
            if (left == 0 || right == 0) {
                return 1 + left + right;
            } else {
                return 1 + Math.min(left, right);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
