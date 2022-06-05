class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        
        int [] dp = new int[m+1];
        int [] tempDP = new int[m+1];
        
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j<m+1; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    tempDP[j] = 1+dp[j-1];
                }
                else{
                    tempDP[j] = Math.max(tempDP[j-1], dp[j]);
                }
            }
            for(int j = 1; j<m+1; j++){
                dp[j] = tempDP[j];
                tempDP[j] = 0;
            }
        }
        
        return dp[m];
    }
}