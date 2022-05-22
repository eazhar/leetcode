class Solution {
    public int findPeakElement(int[] nums) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        while (startIndex<endIndex){
            int mid = (startIndex+endIndex)/2;
            if(nums[mid]<nums[mid+1]){
                startIndex = mid+1;
            }
            else{
                endIndex = mid;
            }
        }
        return startIndex;
    }
}