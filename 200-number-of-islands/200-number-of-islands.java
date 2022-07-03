class Solution {
    
    final int [][] directions = {{-1,0},{0,1},{1,0},{0,-1}};
    
    public int numIslands(char[][] grid) {
        if(grid.length == 0){
            
            return 0;
        }
        
        int numIslandCount = 0;
        
        for(int row = 0; row<grid.length; row++){
            for(int col = 0; col<grid[0].length; col++){
                if(grid[row][col] == ('1')){
                    
                    numIslandCount++;
                    grid[row][col] = 0;
                    
                    Queue <ArrayList> q = new LinkedList<ArrayList>();
                    ArrayList <Integer> a = new ArrayList<Integer>();
                    a.add(row);
                    a.add(col);
                    q.add(a);
                    
                    while(!q.isEmpty()){
                        ArrayList <Integer> currentPos = q.remove();
                        int currentRow = currentPos.get(0);
                        int currentCol = currentPos.get(1);
                        
                        for(int i = 0; i<directions.length; i++){
                            int nextRow = currentRow + directions[i][0];
                            int nextCol = currentCol + directions[i][1];
                            
                            if(nextRow < 0 || nextCol < 0 || nextRow >= grid.length || nextCol >= grid[0].length){
                                //do nothing
                            }
                            else if(grid[nextRow][nextCol] == ('1')){
                                ArrayList <Integer> nextPos = new ArrayList<Integer>();
                                nextPos.add(nextRow);
                                nextPos.add(nextCol);
                                q.add(nextPos);
                                grid[nextRow][nextCol] = 0;
                            }
                            
                        }
                        
                    }
                    
                    
                }
            }
        }
        
        
        return numIslandCount;
    }
    
    
    
}