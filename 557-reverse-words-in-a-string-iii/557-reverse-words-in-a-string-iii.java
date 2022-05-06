class Solution {
    public String reverseWords(String s) {
        Scanner scan = new Scanner(s);
        String t = "";
        while(scan.hasNext()){
            String currentWord = scan.next();
            for(int i = 0; i<currentWord.length(); i++){
                t+=currentWord.charAt(currentWord.length() - i - 1);
            }
            if(scan.hasNext()){
               t+=" "; 
            }
            
        }
        return t;
        
    }
}