class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int p1 = 0;
        int p2 = height.length-1;
        
        while(p1<p2){
            int h = Math.min(height[p1],height[p2]);
            int width = p2-p1;
            int area = width*h;
            if(area>maxArea){
                maxArea = area;
            }
            if(height[p1] <= height[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        
        return maxArea;
    }
}