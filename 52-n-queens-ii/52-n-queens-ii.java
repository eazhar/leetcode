class Solution {
    public int totalNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char [][] board = new char[n][n];
        
        for(char [] cs:board){
            Arrays.fill(cs,'.');
        }
        
        return solveNQueensDFShelper(n,board,0);
    }
    public int solveNQueensDFShelper(int n, char [][] board, int row){
        if(row>=n){ 
            return 1;
        }
        int sumWays = 0;
        for(int i = 0; i<n; i++){
            if(notAttacked(board,row,i)){
                board[row][i] = 'Q';
                sumWays += solveNQueensDFShelper(n,board,row+1);
                board[row][i] = '.';
            }
        }
        return sumWays;
    }
    public boolean notAttacked(char [][] board, int row, int col){
        int i = row-1;
        int jLeft = col-1;
        int jRight = col+1;
        while(i>=0){
            if(board[i][col] == 'Q' || (jLeft >= 0 && board[i][jLeft]=='Q') || (jRight < board.length && board[i][jRight]=='Q')){
                return false;
            }else{
                i--;
                jLeft--;
                jRight++;
            }
        }
        return true;
    }
}