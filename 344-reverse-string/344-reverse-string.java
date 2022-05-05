class Solution {
    public void reverseString(char[] s) {
        //char [] s2 = new char[s.length];
        char temp;
        for(int i = 0; i<s.length/2; i++){
            temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1]=temp;
        }
        // for(int i = 0; i<s.length; i++){
        //     s[i] = s2[i];
        // }
        
        //Doesn't work
        //s = Arrays.copyOf(s2, s2.length);
    }
}