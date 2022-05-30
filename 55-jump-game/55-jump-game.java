class Solution {
    public boolean canJump(int[] nums) {
        
        int maxIndex = 0;
        for(int i = 0; i<nums.length; i++){
            if(i>maxIndex){
                return false;
            }
            else{
                maxIndex = Math.max(maxIndex, i+nums[i]);
            }
        }
        return maxIndex >= nums.length-1;
        
//O(n^2) solution
//         boolean [] dp = new boolean[nums.length];
//         //System.out.println(dp[1]);
//         dp[0] = true;
        
//         for(int i = 0; i<nums.length; i++){
//             if(dp[i]==false){
//                 return false;
//             }
//             else if(nums[i]+i>= nums.length-1){
//                 return true;
//             }
//             else{
//                 for(int j = 1; j<nums[i]+1; j++){
//                     dp[i+j] = true;
//                 }
//             }
//         }
         
//         return dp[dp.length-1];
    }
}