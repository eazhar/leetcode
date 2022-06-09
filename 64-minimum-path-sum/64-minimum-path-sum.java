class Solution {
    public int minPathSum(int[][] grid) {
        int cols = grid.length;
        int rows = grid[0].length;
        
        int [][] costMatrix = new int[cols][rows];
        costMatrix[0][0] = grid[0][0];
        
        for(int i = 1; i<cols; i++){
            costMatrix[i][0] = costMatrix[i-1][0] + grid[i][0];
        }
        for(int i = 1; i<rows; i++){
            costMatrix[0][i] = costMatrix[0][i-1] + grid[0][i];
        }
        
        for(int i = 1; i<cols; i++){
            for(int j = 1; j<rows; j++){
                costMatrix[i][j] = grid[i][j] + Math.min(costMatrix[i-1][j], costMatrix[i][j-1]);
            }
        }
        
        return costMatrix[cols-1][rows-1];
        
    }
}