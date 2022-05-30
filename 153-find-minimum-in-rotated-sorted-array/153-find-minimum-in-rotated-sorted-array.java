class Solution {
    public int findMin(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        if(nums[rightIndex] > nums[leftIndex]){
            return nums[leftIndex];
        }
        while(leftIndex < rightIndex){
            int mid = (leftIndex+rightIndex)/2;
            if(nums[mid+1] < nums[mid]){
                return nums[mid+1];
            }
            else if(nums[mid] < nums[mid-1]){
                return nums[mid];
            }
            else if(nums[mid] > nums[rightIndex]){
                leftIndex = mid+1;
            }
            else{
                rightIndex = mid-1;
            }
        }
        return nums[leftIndex];
    }
}