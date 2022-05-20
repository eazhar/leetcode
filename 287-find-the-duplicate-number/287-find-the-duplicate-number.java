class Solution {
    public int findDuplicate(int[] nums) {
        HashMap <Integer, Integer> h = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],i);
            }
            else{
                return nums[i];
            }
        }
        return -1;
    }
}