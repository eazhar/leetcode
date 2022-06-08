class Solution {
    public int lengthOfLIS(int[] nums) {
        List <Integer> cache = new ArrayList<>();
        
        for(int i : nums){
            
            int index = Arrays.binarySearch(cache.toArray(), i);
            if(index<0){
                index = -1*index-1;
            }
            if(cache.size() <= index){
                cache.add(i);
            }else{
                cache.set(index,i);
            }
            
        }
        
        
        return cache.size();
    }
}