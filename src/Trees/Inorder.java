package Trees;

import java.util.ArrayList;
import java.util.List;

public class Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root,result);
        return result;


    }

    public void helper(TreeNode root,List<Integer> result)
    {
        if(root==null)  return;

        helper(root.left,result);
        result.add(root.val);
        helper(root.right,result);



    }
}
