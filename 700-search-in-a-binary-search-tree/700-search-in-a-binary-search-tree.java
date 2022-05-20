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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode currentNode = root;
        if(currentNode!=null){
            if(currentNode.val == val){
                return currentNode;
            }else if(currentNode.val > val){
                return searchBST(currentNode.left, val);
            }
            else{
                return searchBST(currentNode.right, val);
            }
        }
        else{
            return null;
        }
    }
}