class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        backtrack(permutations,nums,0);
        return permutations;
    }
    public void backtrack(List<List<Integer>> result, int [] nums, int start){
        if(nums.length == start){
            List<Integer> res = new ArrayList<>();
            for(int i:nums){
                res.add(i);    
            }
            result.add(res);
        }
        else{
            for(int i = start; i<nums.length; i++){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                
                backtrack(result, nums, start+1);
                
                temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
            }
        }
    }
}