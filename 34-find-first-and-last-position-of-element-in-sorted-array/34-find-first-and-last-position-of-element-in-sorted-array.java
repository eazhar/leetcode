class Solution {
    public int[] searchRange(int[] nums, int target) {
        int p1 = 0;
        int p2 = nums.length-1;
        
        int finalmin = -1;
        int finalmax = -1;
        
        while(p1<=p2){
            System.out.println("Before: ");
            System.out.println("p1: " + p1);
            System.out.println("p2: " + p2);
            System.out.println("finalmin: " + finalmin);
            System.out.println("finalmax: " + finalmax);
            
            
            if(nums[p1] == target && finalmin == -1){
                finalmin = p1;
            }else if(finalmin == -1){
                p1++;
            }
            if(nums[p2] == target && finalmax == -1){
                finalmax = p2;
            }else if(finalmax == -1){
               p2--; 
            }
            if(finalmin != -1 && finalmax != -1){
                break;
            }
            System.out.println("After: ");
            System.out.println("p1: " + p1);
            System.out.println("p2: " + p2);
            System.out.println("finalmin: " + finalmin);
            System.out.println("finalmax: " + finalmax);
            
        }
        
        int [] result = {finalmin, finalmax};
        
        return result;
    }
}