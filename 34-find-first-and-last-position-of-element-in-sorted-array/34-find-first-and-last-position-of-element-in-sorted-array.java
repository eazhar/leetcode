class Solution {
    public int[] searchRange(int[] nums, int target) {
        int p1 = 0; //left pointer
        int p2 = nums.length-1; //right pointer
        int mid;
        
        int finalmin = -1;
        int finalmax = -1;
        int [] result = {finalmin, finalmax};
        
        int firstPos = binarySearch(nums,p1,p2,target);
        
        if(nums.length == 0 || firstPos==-1){
            return result;
        }
        
        int startPos = firstPos;
        int endPos = firstPos;
        // int temp1, temp2;
        
        while(startPos!=-1){
            finalmin = startPos;
            startPos = binarySearch(nums,p1,startPos-1, target);
        }
        while(endPos!=-1){
            finalmax = endPos;
            endPos = binarySearch(nums,endPos+1,p2, target);
        }
        
        
        
        // result = new int[2];
        
        
        result[0] = finalmin;
        result[1] = finalmax;
        
        // result = {finalmin, finalmax};
        return result;
    }
    public int binarySearch(int [] nums, int p1, int p2, int target){
        while(p1<=p2){
            int mid = (p1+p2)/2;
            if(nums[mid] == target){
                //do some shit         
                return mid;
            }
            else{
                if(nums[mid] < target){
                    p1=mid+1;
                }
                else{
                    p2 = mid-1;
                }
            }
        }
        return -1;
    }
}

//Old code linear search
// if(nums[p1] == target && finalmin == -1){
//                 finalmin = p1;
//             }else if(finalmin == -1){
//                 p1++;
//             }
//             if(nums[p2] == target && finalmax == -1){
//                 finalmax = p2;
//             }else if(finalmax == -1){
//                p2--; 
//             }
//             if(finalmin != -1 && finalmax != -1){
//                 break;
//             }


//Old linear search when target found
// for(int i = mid; i>=0; i--){
//                     // System.out.println("nums[i]: " + nums[i]);
//                     // System.out.println("target: " + target);
                    
                    
//                     if(nums[i]!=target){
//                         finalmin = i+1;
//                         break;
//                     }
//                 }
//                 for(int i = mid; i<nums.length; i++){
//                     if(nums[i]!=target){
//                         finalmax = i-1;
//                         break;
//                     }
//                 }
//                 break;

            // Debugging
            // System.out.println("Before: ");
            // System.out.println("p1: " + p1);
            // System.out.println("p2: " + p2);
            // System.out.println("finalmin: " + finalmin);
            // System.out.println("finalmax: " + finalmax);