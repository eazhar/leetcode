class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] cumLeft = new int[nums.length];
        int [] cumRight = new int[nums.length];
        int [] output = new int[nums.length];
        
        cumLeft[0] = 1;
        cumRight[nums.length-1] = 1;
        
        for(int i = 1; i<nums.length; i++){
            cumLeft[i] = cumLeft[i-1] * nums[i-1];
            
        }
        for(int i = nums.length-2; i>-1; i--){
            cumRight[i] = cumRight[i+1] * nums[i+1];
        }
        
        for(int i = 0; i<nums.length; i++){
            //System.out.println("Left: "+ cumLeft[i]);
            //System.out.println("Right: "+ cumRight[i]);
            output[i] = cumLeft[i]*cumRight[i];
        }
        
        return output;
        
    }
}