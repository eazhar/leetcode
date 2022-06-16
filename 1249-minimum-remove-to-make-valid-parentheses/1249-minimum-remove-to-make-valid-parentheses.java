class Solution {
    // class Entry{
    //     char letter;
    //     int index;
    // }
    public String minRemoveToMakeValid(String s) {
        // ArrayList <int []> x = new ArrayList();
        Stack <Integer> s1 = new Stack<>(); //main stack
        
        char [] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        // Stack <Integer> s2 = new Stack<>(); //garbage stack
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                if(!s1.isEmpty() && s.charAt(s1.peek()) == '('){
                    s1.pop();
                }
                else{
                    ch[i] = '*';
                }
            }
            if(s.charAt(i) == '('){
                    s1.push(i);
            }
        }
        
        while(!s1.isEmpty()){
            int index = s1.pop();
            ch[index] = '*';
        }
        
        for(char c: ch){
            if(c != '*'){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}