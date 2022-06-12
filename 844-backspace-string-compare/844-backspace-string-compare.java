class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack tempS = new Stack();
        Stack tempT = new Stack();
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '#'){    
                if(!tempS.isEmpty()){
                    System.out.println(tempS.pop());
                }
            }
            else{
                    tempS.push(s.charAt(i));
                }
        }
        
        for(int i = 0; i<t.length(); i++){
            if(t.charAt(i) == '#'){
                if(!tempT.isEmpty()){
                    System.out.println(tempT.pop());
                }
            }
            else{
                    tempT.push(t.charAt(i));
                }
        }
        
        if(tempT.size() != tempS.size()){
            return false;
        }else{
            while(!tempT.isEmpty()){                
                if(!tempT.pop().equals(tempS.pop())){
                    return false;
                }
            }
        }
        
        return true;
    }
}