class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        
        boolean [][] visited = new boolean[row][col];
        
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(board[i][j] == word.charAt(0)){
                    if(searchDFS(board, word, i, j, 0, visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean searchDFS(char[][] board, String word, int i, int j, int counter, boolean [][] visited){
        if(counter == word.length()){
            return true;
        }
        else if(i<0 || j<0 || i>=board.length || j>=board[0].length || visited[i][j] || board[i][j]!= word.charAt(counter)){
            return false;
        }
        else{
            visited[i][j] = true;
            if(searchDFS(board, word, i+1, j, counter+1,visited) || searchDFS(board, word, i, j+1, counter+1,visited) 
               || searchDFS(board, word, i-1, j, counter+1,visited) || searchDFS(board, word, i, j-1, counter+1,visited)){
                return true;
            }
            else{
                visited[i][j] = false;
                return false;
            }
        }
    }
    
}