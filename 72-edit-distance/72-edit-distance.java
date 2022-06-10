class Solution {
    public int minDistance(String word1, String word2) {
        int cols = word1.length();
        int rows = word2.length();
        
        int[][] costMatrix = new int[cols+1][rows+1];
        costMatrix[0][0] = 0;
        
        for(int i = 1; i < cols+1; i++){
            costMatrix[i][0] = i;
        }
        for(int i = 1; i < rows+1; i++){
            costMatrix[0][i] = i;
        }
        
        for(int i = 1; i<cols+1; i++){
            for(int j = 1; j<rows+1; j++){
              if(word1.charAt(i-1) == word2.charAt(j-1)){
                  costMatrix[i][j] = costMatrix[i-1][j-1];
              }else{
                  costMatrix[i][j] = 1+Math.min(Math.min(costMatrix[i][j-1], costMatrix[i-1][j]), costMatrix[i-1][j-1]);
              }
            }
        }
        
        return costMatrix[cols][rows];
        
        
        
    }
}