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
    public boolean isSymmetric(TreeNode root) {
        TreeNode p = root.left;
        TreeNode q = root.right;
        
        if(p==null && q==null){
            return true;
        }
        else if(p == null && q != null){
            return false;
        }
        else if(p != null && q == null){
            return false;
        }
        else if(p.val != q.val){
            return false;
        }else{
            if(isSymmetricHelper(p,q)){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public boolean isSymmetricHelper(TreeNode left, TreeNode right){
        TreeNode p = left;
        TreeNode q = right;
        
        // if(p.val == q.val){
            // if(p.left != null && q.right != null){
                if(p==null && q==null){
                    return true;
                }
                else if(p == null && q != null){
                    return false;
                }
                else if(p != null && q == null){
                    return false;
                }
                else if(p.val != q.val){
                    return false;
                }else{
                    boolean b1 = isSymmetricHelper(p.left, q.right);
                    boolean b2 = isSymmetricHelper(p.right, q.left);
                    
                    return b1&&b2;
                    
                }
            // }
    }
    
}