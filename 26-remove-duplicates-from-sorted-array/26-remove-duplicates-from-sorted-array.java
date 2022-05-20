class Solution {
    public int removeDuplicates(int[] nums) {///
        HashMap <Integer, Integer> h = new LinkedHashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i], i);
            }
        }
        int size = h.size();
        
        int i = 0;
        for(Map.Entry <Integer, Integer> val : h.entrySet()){
            nums[i] = (int) val.getKey();
            i++;
        }
        return size;
    }
}