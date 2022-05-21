class Solution {
    public int maxSubArray(int[] nums) {
        int globalSum = nums[0];
        int localSum = 0;
        for(int i = 0; i<nums.length; i++){
            localSum = Math.max(nums[i], localSum+nums[i]);
            globalSum = Math.max(globalSum, localSum);
        }
        return globalSum;
        
    }
}