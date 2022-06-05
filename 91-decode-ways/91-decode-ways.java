class Solution {
    public int numDecodings(String s) {
        
        int n = s.length();
        if(n==0 || s.charAt(0) == '0'){
            return 0;
        }
        int beforePrevious = 1;
        int previous = 1;
        
        for(int i = 1; i<n; i++){
            int current = 0;
            if(s.charAt(i) != '0'){
                current += previous;
                // System.out.println("if1: " + current);
            }
            String tempString = "" + s.charAt(i-1) + s.charAt(i);
            // System.out.println("tempString: " + tempString +"\ni: " + i);
            if(Integer.parseInt(tempString) <=26 && Integer.parseInt(tempString) >=10){
                current +=beforePrevious;
                // System.out.println("if2: " + current);
            }
            beforePrevious = previous;
            previous = current;
        }
        return previous;
    }
}