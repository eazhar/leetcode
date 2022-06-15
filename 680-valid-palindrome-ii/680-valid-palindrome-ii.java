class Solution {
    public boolean validPalindrome(String s) {
        int startIndex = 0;
        int endIndex = s.length()-1;
        
        while(startIndex < endIndex){
            if(s.charAt(startIndex) != s.charAt(endIndex)){
                return validPalindromeHelper(s,startIndex+1,endIndex) || validPalindromeHelper(s,startIndex,endIndex-1);
            }else{
                startIndex++;
                endIndex--;
            }
        }
        
        return true;
        
    }
    public boolean validPalindromeHelper(String s, int startIndex, int endIndex){
        
        while(startIndex < endIndex){
            if(s.charAt(startIndex) != s.charAt(endIndex)){
                return false;
            }else{
                startIndex++;
                endIndex--;
            }
        }
        return true;
    }
}