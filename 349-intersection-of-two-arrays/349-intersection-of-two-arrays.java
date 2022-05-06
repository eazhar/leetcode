class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> h1 = new  HashMap<>();
        HashMap <Integer, Integer> h2 = new HashMap<>(); 
        
        for(int i = 0; i<nums1.length; i++){
            if(h1.containsKey(nums1[i])){
                
            }else{
                h1.put(nums1[i],i);
            }
        }
        for(int i = 0; i<nums2.length; i++){
            if(h1.containsKey(nums2[i]) && !h2.containsKey(nums2[i])){
                h2.put(nums2[i],i);
            }else{
                //do nothing
            }
        }

        int [] retArray_int = new int[h2.size()];
        int i = 0;
        for(Map.Entry entry : h2.entrySet()){
            retArray_int[i++] = (int) entry.getKey();
        }
        
        return(retArray_int);
        
        // for(int i = 0; i<h2.size(); i++){
        //     returnArray = h2.getKey;
        // }
        
        
    }
}