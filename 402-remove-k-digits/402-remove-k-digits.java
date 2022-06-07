class Solution {
	    public String removeKdigits(String num, int k) {
	        if(k==num.length()){
	            return "0";
	        }
	        Deque dq = new LinkedList();
	        for(int i = 0; i<num.length(); i++){
	            while((dq.size() > 0) && (num.charAt(i) < (char)dq.peek()) && (k>0) ){
	                dq.pop();
	                k--;
	            }
	            dq.push(num.charAt(i)); 
	        }
            
            for(int i = 0; i<k; i++){
                dq.pop();
            }
	        
	        
	        String res = new String();
	        
	        while(!dq.isEmpty()){
	            res += (dq.removeLast());
	        }
            
            while(res.length() > 1 && res.charAt(0) == '0'){
                res = res.substring(1,res.length());
            }
	        
            return res;
	        
	    }
}