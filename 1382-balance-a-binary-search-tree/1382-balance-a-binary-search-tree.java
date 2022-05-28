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
    public TreeNode balanceBST(TreeNode root) {
        LinkedList <TreeNode> nodeList = new LinkedList<>();
        inOrder(nodeList,root);
        return buildTree(nodeList,0,nodeList.size()-1);
    }
    
    private void inOrder(LinkedList <TreeNode> nodeList, TreeNode currentNode){
        if(currentNode != null){
            inOrder(nodeList, currentNode.left);
            nodeList.add(currentNode);
            inOrder(nodeList, currentNode.right);
        }
    }
    private TreeNode buildTree(LinkedList <TreeNode> nodeList, int lo, int hi){
        if(lo>hi){
            return null;
        }
        
        int mid = (int)((lo + hi)/2+0.5);
        
        TreeNode root2 = nodeList.get(mid);
        
        root2.left = buildTree(nodeList,lo,mid-1);
        root2.right = buildTree(nodeList,mid+1,hi);
        
        return root2;
        
    }
}