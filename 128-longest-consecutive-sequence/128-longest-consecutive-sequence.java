class Solution {
    public int longestConsecutive(int[] nums) {
        
        //Option 1: Brute Force - start with element, seach for consective numbers below and above.  T: O(n^3) S: O(1)
        //Option 2: Sort Array first, look for consectives sequentially low to high T: O(nlog(n) + n) S: O(1) (modify input), O(n) otherwise
        //Option 3: Use a set and store each value into the set and check for if its the smallest of the set
        
        if(nums.length <2){
            return nums.length;
        }
        int maxLength = 1;
        Set<Integer> values = new HashSet<Integer>();
        values.addAll(IntStream.of(nums).boxed().collect(Collectors.toList()));
        
        for(int i:values){
            if(!values.contains(i-1)){
                int right = i;
                while(values.contains(right+1)){
                    right+=1;
                }
                maxLength = Math.max(maxLength, right-i+1);
            }
        }
        return maxLength;
    }
}