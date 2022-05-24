class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character, Integer> h = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(!h.containsKey(s.charAt(i))){
                h.put(s.charAt(i), 1);
            }
            else{
                h.put(s.charAt(i), h.get(s.charAt(i))+1);
            }
        }
        int length = 0;
        boolean flag = false;
        for(Map.Entry<Character,Integer> val : h.entrySet()){
            if(val.getValue()%2==0){
                length += val.getValue();
            }else{
                flag = true;
                length += val.getValue() - 1;
            }
        }
        if(flag){
            length++;
        }
        return length;
    }
}