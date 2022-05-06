class Solution {
    public boolean isAnagram(String s, String t) {
        boolean returnValue;
        HashMap <Character, Integer> h = new HashMap<>();
        
        if(s.length() != t.length()){
            return false;
        }
        
        for(int i = 0; i<s.length(); i++){
            if(h.containsKey(s.charAt(i))){
                h.put(s.charAt(i), h.get(s.charAt(i))+1);
            }
            else{
                h.put(s.charAt(i),1);
            }
        }
        for(int i = 0; i<t.length(); i++){
            if(h.containsKey(t.charAt(i))){
                if(h.get(t.charAt(i)) == 1){
                    h.remove(t.charAt(i));
                }
                else if(h.get(t.charAt(i)) == null){
                    return false;   
                }else{
                    h.put(t.charAt(i), (int)h.get(t.charAt(i))-1);
                }
                
            }
            else{
                return false;
            } 
        }
        return true;
    }
}