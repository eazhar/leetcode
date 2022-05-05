class Solution {
    public void moveZeroes(int[] nums) {
        Queue q = new LinkedList();
        int oldLength = nums.length;
        for(int i = 0; i<oldLength; i++){
            if(nums[i]!=0){
                q.add(nums[i]);
            }
        }
        int nonzero = q.size();
        for(int i=0; i<nonzero; i++){
            nums[i] = (int) q.remove();
        }
        for(int i = nonzero; i<oldLength; i++){
            nums[i] = 0;
        }
    }
}