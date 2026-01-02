import java.util.ArrayList;

public class SymmetricTree {

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

    // Ana symmetric kontrolü
    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        return (t1.val == t2.val)
                && isMirror(t1.left, t2.right)
                && isMirror(t1.right, t2.left);
    }

    // Test
    public static void main(String[] args) {
        SymmetricTree tree = new SymmetricTree();

        TreeNode root = tree.new TreeNode(1);
        root.left = tree.new TreeNode(2);
        root.right = tree.new TreeNode(2);
        root.left.left = tree.new TreeNode(3);
        root.left.right = tree.new TreeNode(4);
        root.right.left = tree.new TreeNode(4);
        root.right.right = tree.new TreeNode(3);

        System.out.println("Is symmetric? " + isSymmetric(root)); // true
    }
}
