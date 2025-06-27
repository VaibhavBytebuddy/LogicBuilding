package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CreateTree {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=null;
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);

        System.out.println("Preorder Traversal");
        List<Integer> order = preorderTraversal(root);
        System.out.println(order);

    }

    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> li = new ArrayList<>();
        preorderHelper(root, li);
        return li;

    }
    public static void preorderHelper(TreeNode root, List<Integer> li) {
        if (root == null) return;

        li.add(root.val);               // visit root
        preorderHelper(root.left, li);  // visit left
        preorderHelper(root.right, li); // visit right


    }
}
