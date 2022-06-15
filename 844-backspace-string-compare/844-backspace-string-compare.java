class Solution {
    public boolean backspaceCompare(String s, String t) {
        //Optimized Solution
        int p1 = s.length()-1;
        int p2 = t.length()-1;
        int backCount = 0;
        
        while(p1>=0 || p2>=0){
            while(p1 >= 0 && (backCount > 0 || s.charAt(p1) == '#')){
                if(s.charAt(p1) == '#'){
                    backCount++;
                }
                else{
                    backCount--;
                }
                    
               p1--;
            }
            backCount = 0;
            while(p2 >= 0 && (backCount > 0 || t.charAt(p2) == '#')){
                if(t.charAt(p2) == '#'){
                    backCount++;
                }
                else{
                    backCount--;
                }
                    
                p2--;
            }
            
            System.out.println("p1: "+ p1);// + "s.p1: " + s.charAt(p1));
            System.out.println("p2: "+ p2);// + "t.p2: " + t.charAt(p2));
                
            if(p1 >= 0 && p2 >= 0){
                if(s.charAt(p1) != t.charAt(p2)){
                    return false;
                }
                else{
                   p1--; 
                   p2--;
                }

            }else {
                if(p1 >= 0 || p2 >= 0){
                    return false;
                }
            }
        }
        return true;
    }
        
}
            
        
        
        //BRUTE FORCE SOLUTION
//         Stack tempS = new Stack();
//         Stack tempT = new Stack();
        
//         for(int i = 0; i<s.length(); i++){
//             if(s.charAt(i) == '#'){    
//                 if(!tempS.isEmpty()){
//                     System.out.println(tempS.pop());
//                 }
//             }
//             else{
//                     tempS.push(s.charAt(i));
//                 }
//         }
        
//         for(int i = 0; i<t.length(); i++){
//             if(t.charAt(i) == '#'){
//                 if(!tempT.isEmpty()){
//                     System.out.println(tempT.pop());
//                 }
//             }
//             else{
//                     tempT.push(t.charAt(i));
//                 }
//         }
        
//         if(tempT.size() != tempS.size()){
//             return false;
//         }else{
//             while(!tempT.isEmpty()){                
//                 if(!tempT.pop().equals(tempS.pop())){
//                     return false;
//                 }
//             }
//         }
        

//UNUSED




//         int buffer = 0;
        
//         while(s.charAt(p1) == '#'){
//             p1-=2;
//         }
//         while(t.charAt(p2) == '#'){
//             p2-=2;
//         }
        
//         // System.out.println("Hello");