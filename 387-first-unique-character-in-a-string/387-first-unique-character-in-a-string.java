class Solution {
    public int firstUniqChar(String s) {
        Queue unique = new LinkedList();
        
        HashMap <Character,Integer> h = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(h.containsKey(s.charAt(i))){
                //h.get(s.charAt(i));
                unique.remove(s.charAt(i));
            }
            else{
                h.put(s.charAt(i),i);
                unique.add(s.charAt(i));
            }
        }
        if(unique.isEmpty()){
            return -1;
        }
        else{
            return h.get(unique.remove());
        }
    }
}