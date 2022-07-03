class Solution {
    
    final int [][] directions = {{-1,0},{0,1},{1,0},{0,-1}};
    
    public int orangesRotting(int[][] grid) {
        if(grid.length == 0){
            return 0;
        }
        
        int numFreshOranges = 0;
        int numMinutes = 0;
        int queueLength = 0;
        Queue <ArrayList> q = new LinkedList<ArrayList>();
        
        for(int row = 0; row<grid.length; row++){
            for(int col = 0; col<grid[0].length; col++){
                if(grid[row][col] == 2){
                    
                    ArrayList <Integer> a = new ArrayList<Integer>();
                    a.add(row);
                    a.add(col);
                    q.add(a);
                }
                if(grid[row][col] == 1){
                    numFreshOranges++;
                }
            }
        }     
        queueLength = q.size();
        
        if(queueLength == 0 && numFreshOranges==0){
            return 0;
        }else if(queueLength == 0 && numFreshOranges!=0){
            return -1;
        }
        
        //System.out.println("queueLength: " + queueLength);
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
                else if(grid[nextRow][nextCol] == 1){
                    ArrayList <Integer> nextPos = new ArrayList<Integer>();
                    nextPos.add(nextRow);
                    nextPos.add(nextCol);
                    q.add(nextPos);
                    grid[nextRow][nextCol] = 2;
                    numFreshOranges--;
                }
            }
            queueLength--;
            
            //System.out.println("queueLength: " + queueLength);
            // System.out.println("queueLength: " + queueLength);
            
            if(queueLength==0){
                numMinutes++;
                queueLength = q.size();
            }
            
        }
        if(numFreshOranges>0){
            return -1;
        }
        return numMinutes-1;
    }
}
