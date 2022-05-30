class Solution {
    public boolean isValid(String s) {
        Stack parenStack = new Stack();
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                parenStack.push(s.charAt(i));
            }
            else if(s.charAt(i) == '{'){
                parenStack.push(s.charAt(i));
            }
            else if(s.charAt(i) == '['){
                parenStack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(parenStack.size() != 0 && (char)parenStack.peek() == '('){
                    parenStack.pop();
                }else{
                    return false;
                }
            }
            else if(s.charAt(i) == '}'){
                if(parenStack.size() != 0 && (char)parenStack.peek() == '{'){
                    parenStack.pop();
                }else{
                    return false;
                }
            }
            else if(s.charAt(i) == ']'){
                if(parenStack.size() != 0 && (char)parenStack.peek() == '['){
                    parenStack.pop();
                }else{
                    return false;
                }
            } 
        }
        if(parenStack.size() != 0){
            return false;
        }
        return true;
    }
}