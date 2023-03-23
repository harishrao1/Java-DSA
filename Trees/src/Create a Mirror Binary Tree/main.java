

public class Solution {

    public TreeNode mirrorBinaryTree(TreeNode root) {

            //base case
         if (root == null){
             return null;
        }
        //set the left to rigth tree and right to left tree
        TreeNode new_node =new TreeNode(root.val);
        new_node.left = mirrorBinaryTree(root.right);
        new_node.right = mirrorBinaryTree(root.left);
        return new_node;
    }

}
