class Solution {
    public int countBattleships(char[][] board) {
        int numShips = 0;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'X'){
                   numShips++;
                    sinkShip(board, i ,j);
                }
            }
        }
        return numShips;
    }
    public void sinkShip(char[][] board, int i, int j){
        board[i][j] = '.';
        
        if(i < board.length - 1 && board[i + 1][j] == 'X'){
            sinkShip(board, i + 1, j);
        }
        if(i > 0 && board[i - 1][j] == 'X'){
            sinkShip(board, i - 1, j);
        }
        if(j < board[0].length - 1 && board[i][j + 1] == 'X'){
            sinkShip(board, i, j + 1);
        }
        if(j > 0 && board[i][j - 1] == 'X'){
            sinkShip(board, i, j - 1);
        }
    }
}
