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
        return inorderDFShelper(root, new ArrayList());
    }
    List<Integer> inorderDFShelper(TreeNode root, ArrayList list){
        if(root == null){
            return list;
        }
        
        inorderDFShelper(root.left,list);
        list.add(root.val);
        inorderDFShelper(root.right,list);
        
        
        
        return list;
    }
}