class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char [][] board = new char[n][n];
        
        for(char [] cs:board){
            Arrays.fill(cs,'.');
        }
        solveNQueensDFShelper(n,board,0, result);
        return result;
    }
    public void solveNQueensDFShelper(int n, char [][] board, int row, List<List<String>> result){
        if(row>=n){ 
            
            //convert board from 2D char array to a string
            List<String> list = new LinkedList<>();
            StringBuilder str;
            for(char[] cs:board){
                str = new StringBuilder();
                for(char cur:cs){
                    str.append(cur);
                }
                list.add(str.toString());
            }
            
            result.add(list);
        }
        for(int i = 0; i<n; i++){
            if(notAttacked(board,row,i)){
                board[row][i] = 'Q';
                solveNQueensDFShelper(n,board,row+1, result);
                board[row][i] = '.';
            }
        }
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