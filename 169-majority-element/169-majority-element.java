class Solution {
    public int majorityElement(int[] nums) {
        int return_value = 0;
        HashMap <Integer, Integer> h = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }else{
                h.put(nums[i],1);
            }
        }
        
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : h.entrySet())
        {
            //if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            if(Math.ceil(entry.getValue())>nums.length/2)
            {
                //maxEntry = entry;
                return (entry.getKey());
            }
        }
        return (maxEntry.getKey());
        
        
       // return return_value;
    }
}