import java.util.ArrayList;

public class BFS {
    class TreeNode {
        int val;
        SymmetricTree.TreeNode left;
        SymmetricTree.TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, SymmetricTree.TreeNode left, SymmetricTree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    void levelOrderRec(SymmetricTree.TreeNode root, int level, ArrayList<ArrayList<Integer>> res) {
        if (root == null)
            return;

        if (res.size() <= level)
            res.add(new ArrayList<>());

        res.get(level).add(root.val);

        levelOrderRec(root.left, level + 1, res);
        levelOrderRec(root.right, level + 1, res);
    }

    ArrayList<ArrayList<Integer>> levelOrder(SymmetricTree.TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        levelOrderRec(root, 0, res);
        return res;
    }

    public static void main(String[] args) {

    }
}
