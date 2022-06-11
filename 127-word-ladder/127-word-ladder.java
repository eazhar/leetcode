class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        if(wordList.isEmpty() || !wordList.contains(endWord)){
            return 0;
        }
        
        int level = 1;
        
        Set <String> wordSet = new HashSet<>(wordList);
       
        //Queue to keep track of all nodes at current level
        Queue <String> queue = new LinkedList<>();
        queue.add(beginWord);
        
        //set to keep track of all visited sets so far
        Set <String> visitedSet = new HashSet<>();
        visitedSet.add(beginWord);
        
        while(!queue.isEmpty()){
            System.out.println("Queue Size 1: " + queue.size());
            //we need to iterate across every word in the queue because it maintains
            //the order of processing the current level
            for(int i = queue.size(); i>0; i--){
                System.out.println("Queue Size 2: " + queue.size());
                //pull top entry from queue
                String currentWord = queue.remove();
            
                //check if we met our base case
                if(currentWord.equals(endWord)){
                    return level;
                }

                //if not, generate all adjacent words to current word
                //1) transform current word to character array
                char [] currentWordCharArray = currentWord.toCharArray();
                
                //2) now iterate across each letter (size of the array)
                for(int j = 0; j<currentWordCharArray.length; j++){ //adjacent strings to s
                    
                    //3) maintain the current character for later
                    char tempCurrentChar = currentWordCharArray[j];
                    
                    //4) iterate across each letter a-z
                    for(char c = 'a'; c<='z'; c++){
                        //replace current letter position with new generated letter
                        currentWordCharArray[j] = c;
                        
                        //convert character array to string
                        String nextWord = new String(currentWordCharArray);
                        
                        //check if 
                        //a) that string has been visited (note, this will already happen if you iterate into the current string because the current string is already contained in visited)
                        //b) that the wordset actually contains the word
                        if(!visitedSet.contains(nextWord) && wordSet.contains(nextWord)){
                            //add current word to queue and visitedSet
                            System.out.println("i: "+ i+" Current Word: "+ currentWord +" Next Word: "+ nextWord + " Level: " + level);
                            queue.add(nextWord);
                            visitedSet.add(nextWord);
                            
                        }
                    }
                    //reset the current letter to the original
                    currentWordCharArray[j] = tempCurrentChar;
                } 
                System.out.println("Queue Size 3: " + queue.size());
            }
         System.out.println("Level: " + level);
         level++;   
        }
        
        
        
        return 0;
    }
}