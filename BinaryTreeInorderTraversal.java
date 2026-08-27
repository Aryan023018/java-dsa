import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        inorder(root, result);

        return result;
    }

    private void inorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        // Left
        inorder(root.left, result);

        // Root
        result.add(root.val);

        // Right
        inorder(root.right, result);
    }

    public static void main(String[] args) {

        BinaryTreeInorderTraversal obj =
                new BinaryTreeInorderTraversal();

        /*
                 1
                  \
                   2
                  /
                 3
        */

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = obj.inorderTraversal(root);

        System.out.println("Inorder Traversal: " + result);
    }
}
