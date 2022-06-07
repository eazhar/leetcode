class Solution {
    public String shortestPalindrome(String s) {
        //O(n^2) solution 
        
        String mirrorString = s + "#" + (new StringBuilder()).append(s).reverse().toString();
        int [] lpsArr = KMP(mirrorString);
        int mirrorLength = lpsArr[lpsArr.length-1];
        // for(int i = 0; i<s.length()+1; i++){
        //     String currentString = s.substring(0,i);
        //     String revString = (new StringBuilder()).append(currentString).reverse().toString();
        //     if(currentString.equals(revString)){
        //         mirrorLength = i;
        //         //mirrorString = currentString;
        //         //System.out.println(mirrorString);
        //     }
        // }
        // //System.out.println(mirrorLength);
        
        String newPrefix = (new StringBuilder()).append(s.substring(mirrorLength,s.length())).reverse().toString();

        return newPrefix + s;
    }
    //longest prefix-suffix (lps Arr)
    public int[] KMP(String s) {
        int [] lpsArr = new int[s.length()];
        int length = 0;
        
        int i = 1;
        while(i<s.length()){
            if(s.charAt(i) == s.charAt(length)){
                length++;
                lpsArr[i] = length;
                i++;
            }else if(length >0){
                length = lpsArr[length-1];
            }else{
                lpsArr[i] = 0;
                i++;
            }
        }
        return lpsArr;
    }
}