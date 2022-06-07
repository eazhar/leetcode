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
	        
	        
	        StringBuilder res = new StringBuilder();
	        
	        while(!dq.isEmpty()){
	            res.append(dq.removeLast());
	        }
            
            while(res.length() > 1 && res.charAt(0) == '0'){
                res.deleteCharAt(0);
            }
            //System.out.println(res.length());
//             if(res.length() == 2){
                
//                 return "0";
//             }else{
//                return res.replaceFirst("^0*", ""); 
//             }
	        
            return res.toString();
	        
	    }
}