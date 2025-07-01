package Trees;

import static Trees.DeleteFromBST.deleteNode;

public class BSTBuilder {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val < root.val) root.left = insertIntoBST(root.left, val);
        else root.right = insertIntoBST(root.right, val);

        return root;
    }

    public TreeNode createBSTFromArray(int[] arr) {
        TreeNode root = null;
        for (int val : arr) {
            root = insertIntoBST(root, val);
        }
        return root;
    }

    public void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        BSTBuilder tree = new BSTBuilder();
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        TreeNode root = tree.createBSTFromArray(values);

        System.out.print("Preorder Traversal: ");
        tree.preorder(root); // Output should match BST structure

        TreeNode node=deleteNode(root,2);

        tree.preorder(root);

    }
}
