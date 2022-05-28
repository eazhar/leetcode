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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> temp = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        
        temp.add(root);
        
        while(temp.size()!=0){
            ArrayList level = new ArrayList();
            int count = temp.size();
            
            for(int i = 0; i<count; i++){
                TreeNode node = temp.poll();
                if(node!=null){
                    level.add(node.val);
                    if(node.left!=null){
                        temp.add(node.left);
                    }
                    if(node.right!=null){
                        temp.add(node.right);
                    }  
                 }
                
            }
            if(level.size()!=0){
                list.add(level);
            }
            
        }
        
        return list;
    }
}