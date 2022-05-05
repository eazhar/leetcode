class Solution {
    public int removeElement(int[] nums, int val) {
        Queue q = new LinkedList();
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=val){
                q.add(nums[i]);
                count++;
            }
        }
        int index = 0;
        while(!q.isEmpty()){
            nums[index] = (int)q.remove();
            index++;
        }
        return count;
    }
}