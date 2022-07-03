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
    public int countNodes(TreeNode root) {
        int height = 0;
        
        if (root == null){
            return 0;
        }
        
        //get the number of nodes up to the last level
        TreeNode p1 = root;
        while(p1.left != null){
            height++;
            p1 = p1.left;
        }
        
        if(height == 0){
            return 1;
        }
        
        int numNodes = (int)Math.pow(2,height)-1;
        int left = 1;
        int right = numNodes+1;
        while(left<right){
            //binary search on the bottom row, add to the total
            // int index = (int)Math.ceil((left+right)/2);
            int index = (int)((left+right)/2 + 0.5);
            if(nodeExists(index,height,root)){
                left = index+1;
            }
            else{
                right = index;
            }
        }
        // System.out.println("numNodes:" + numNodes);
        // System.out.println("left:" + left);
        
        
        return numNodes + left;
    }
    
    public boolean nodeExists(int index, int height, TreeNode node){
        int left = 0;
        int right = (int)Math.pow(2,height)-1;
               
        for(int count = 0; count<height; count++){
            int mid = (int)Math.ceil((left+right)/2);
            if(index <= mid){
                node = node.left;
                right = mid;
            }else{
                node = node.right;
                left = mid+1;
            }   
        }       
        return node != null;
    }
    
    /*public int binarySearch(int [] nums, int p1, int p2, int target){
        while(p1<=p2){
            int mid = (p1+p2)/2;
            if(nums[mid] == target){
                //do some shit         
                return mid;
            }
            else{
                if(nums[mid] < target){
                    p1=mid+1;
                }
                else{
                    p2 = mid-1;
                }
            }
        }
        return -1;
    }*/
}