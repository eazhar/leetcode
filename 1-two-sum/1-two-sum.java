class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] index = new int[2];
        HashMap <Integer, Integer> h  = new HashMap<>();
        
        
        for(int i = 0; i<nums.length; i++){
            //for(int j = i+1; j<nums.length; j++){
        	int keyLookup = target-nums[i]; //check if the subtraction of target and current value is the key
            if(h.containsKey(keyLookup)){
                index[0]=h.get(keyLookup);
                index[1]=i;
                return index;
            }
            else {
            	h.put(nums[i], i);
            }
        }
        
        //First Solution
        /*for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    index[0]=i;
                    index[1]=j;
                    return index;
                }
            }
        }*/
        return index;
    }
}