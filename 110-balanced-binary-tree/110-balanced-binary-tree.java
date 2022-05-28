/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean flag;
    public boolean isBalanced(TreeNode root) {
        flag = true;
        isBalancedHelper(root);
        return flag;
        
        //Option 2: Did not work
        //return isBalancedHelper(root, 0);
    }
    public int isBalancedHelper(TreeNode root){
        
        if(root == null){
            return 0;
        }
        int leftHeight = isBalancedHelper(root.left);
        int rightHeight = isBalancedHelper(root.right);
        
        if(Math.abs(leftHeight-rightHeight) > 1){
            flag = false;
        }

        
        return 1 + Math.max(leftHeight, rightHeight);
        
        //Option 2: Did not work
//         if(root == null){
//             return true;
//         }
//         int leftHeight = 0;
//         int rightHeight = 0;
//         boolean isbalLeft = isBalancedHelper(root.left, leftHeight);
//         boolean isbalRight = isBalancedHelper(root.right, rightHeight);
        
//         height = 1 + Math.max(leftHeight, rightHeight);
//         return isbalLeft && isbalRight && (Math.abs(leftHeight-rightHeight) <= 1);
        
    }
}