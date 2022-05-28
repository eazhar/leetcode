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
    public boolean isValidBST(TreeNode root) {
        //Option 2: Doesn't work
        //return isValidBSTHelper(root,-99999);
        return isValidBSTHelper(root,Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);
    }
    public boolean isValidBSTHelper(TreeNode root, double min, double max){
        
        if(root==null){
            return true;
        }
        else if(root.val <= min || root.val >= max){
            return false;
        }
        else{
            return isValidBSTHelper(root.left, min, root.val) && isValidBSTHelper(root.right, root.val, max);
        }
        
        
        //Option 2: Doesn't work
        // if(root == null){
        //     return true;
        // }
        // if(!isValidBSTHelper(root.left, precedent)){
        //     return false;
        // }
        // else{
        //     precedent = root.val;
        // }
        // if(!isValidBSTHelper(root.right, precedent)){
        //     return false;
        // }
        // return true;
    }
}