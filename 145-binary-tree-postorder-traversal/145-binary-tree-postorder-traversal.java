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
    public List<Integer> postorderTraversal(TreeNode root) {
        return postorderDFSHelper(root,new ArrayList());
    }
    public List<Integer> postorderDFSHelper(TreeNode root, ArrayList list) {
        if(root == null){
            return list;
        }
        
        postorderDFSHelper(root.left, list);
        postorderDFSHelper(root.right, list);
        list.add(root.val);
        
        return list;
    }
}