class Solution {
    public void moveZeroes(int[] nums) {
        
        int firstzero = 0;
        boolean zeroseen = false;
        int oldLength = nums.length;
        for(int i = 0; i<oldLength; i++){
            if(nums[i]==0 && !zeroseen){
                firstzero = i;
                zeroseen=true;
            }
            if(nums[i]!=0 && zeroseen){
                nums[firstzero]=nums[i];
                nums[i] = 0;
                i = firstzero;
                zeroseen=false;
            }
        }
        
        
//          Old solution: Time: 5 ms (14.50%), Space: 55 MB (26.94%) - LeetHub        
//         Queue q = new LinkedList();
//         int oldLength = nums.length;
//         for(int i = 0; i<oldLength; i++){
//             if(nums[i]!=0){
//                 q.add(nums[i]);
//             }
//         }
//         int nonzero = q.size();
//         for(int i=0; i<nonzero; i++){
//             nums[i] = (int) q.remove();
//         }
//         for(int i = nonzero; i<oldLength; i++){
//             nums[i] = 0;
//         }
    }
}