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
    public List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversalDFShelper(root, new ArrayList());
    }
    List<Integer> inorderTraversalDFShelper(TreeNode root, ArrayList nodeValuesInOrder){
        if(root == null){
            return nodeValuesInOrder;
        }
        
        inorderTraversalDFShelper(root.left,nodeValuesInOrder);
        nodeValuesInOrder.add(root.val);
        inorderTraversalDFShelper(root.right,nodeValuesInOrder);
        
        
        
        return nodeValuesInOrder;
    }
}