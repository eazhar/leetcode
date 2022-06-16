class Solution {
    // class Entry{
    //     char letter;
    //     int index;
    // }
    public String minRemoveToMakeValid(String s) {
        // ArrayList <int []> x = new ArrayList();
        Stack <Integer> s1 = new Stack<>(); //main stack
        Stack <Integer> s2 = new Stack<>(); //garbage stack
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                if(!s1.isEmpty() && s.charAt(s1.peek()) == '('){
                    s1.pop();
                }
                else{
                    s2.push(i);
                }
            }
            if(s.charAt(i) == '('){
                    s1.push(i);
            }
        }
        
        while(!s1.isEmpty()){
            int index = s1.pop();
            s = s.substring(0,index)+s.substring(index+1,s.length());
        }
        while(!s2.isEmpty()){
            int index = s2.pop();
            s = s.substring(0,index)+s.substring(index+1,s.length());
        }
        
        return s;
    }
}