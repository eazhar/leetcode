class Solution {
    public int trap(int[] height) {
        int p1 = 0;
        int p2 = height.length-1;

        //height[p1] --> 
        int maxLeft = 0;
        //height[p2] --> 
        int maxRight = 0;

        int totalWater = 0;

        while(p1<p2){

            if(height[p1]<=height[p2]){
                //operate on left side
                if(height[p1] > maxLeft){
                    //option 1: calculate water
                    maxLeft = height[p1];
                }
                else{
                    //option 2: update maxLeft
                    totalWater += maxLeft-height[p1];
                }
                p1++;
            }
            else{
                //operate on right side
                if(height[p2] > maxRight){
                    //option 1: calculate water
                    maxRight = height[p2];
                }
                else{
                    //option 2: update maxLeft
                    totalWater += maxRight-height[p2];
                }
                p2--;
            }

        }

        return totalWater;
    }
}