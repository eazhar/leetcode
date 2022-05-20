/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        //base case: if the root value is the same for both
        if( root.val == p.val || root.val == q.val){
            return root;
        }
        if(Math.min(p.val,q.val) < root.val && root.val <Math.max(p.val, q.val)){
            return root;
        }
        //if both nodes are less than the root, we need to go left
        if(Math.max(p.val,q.val) < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(root.val < Math.min(p.val, q.val)){
            return lowestCommonAncestor(root.right, p, q);
        }
        return lowestCommonAncestor(root, p, q);
    }
}