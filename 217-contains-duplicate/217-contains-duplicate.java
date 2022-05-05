class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        boolean retVal;
        HashMap <Integer, Integer> h = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            if(h.containsKey(nums[i])){
                return true;
            }
            else{
                h.put(nums[i],i);
            }
        }
        
        return false;
        
    }
}