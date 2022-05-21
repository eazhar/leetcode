class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character, Integer> h = new HashMap<>();
        
        int maxLength = 0;
        int total = 0;
        
        String longestSubstring = "";
        
        for(int i = 0; i<s.length(); i++){
            
            if(!longestSubstring.contains(s.charAt(i)+"")){
                longestSubstring+=s.charAt(i);
                maxLength = Math.max(maxLength, longestSubstring.length());
            }
            else{
                //System.out.println(longestSubstring);
                longestSubstring = longestSubstring.substring(longestSubstring.indexOf(s.charAt(i))+1,longestSubstring.length())+s.charAt(i);
                maxLength = Math.max(maxLength, longestSubstring.length());
                //System.out.println(longestSubstring);
            }
            
            
            //Note: This solution works if you can start directly from where the repeated character occurs so it will only give you the wrong answer
            // if(!h.containsKey(s.charAt(i))){
            //     h.put(s.charAt(i), i);
            //     total++;
            //     maxLength = Math.max(maxLength,total);
            // }else{
            //     total = 0;
            //     h = new HashMap<>();
            //     h.put(s.charAt(i), i);
            //     total++;
            //     maxLength = Math.max(maxLength,total);
            // }
        }
        
        return maxLength;
    }
}