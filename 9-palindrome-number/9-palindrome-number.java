class Solution {
    public boolean isPalindrome(int x) {
        String strIn = Integer.toString(x);
        for(int i = 0; i<strIn.length()/2; i++){
            if(strIn.charAt(i) != strIn.charAt(strIn.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}