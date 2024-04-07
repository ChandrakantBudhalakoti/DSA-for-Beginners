package BackTracking;

public class NQueenProblem {
    // all posible combination for queens safe location
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueen(char board[][], int row) {
        // base case
        if (row == board.lenght) {
            printBoard(board);
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)){
                board[row][j] == 'Q';
                nQueen(board, row+1); //function call 
                board[row][j] = 'X'; //backtrack step
            }
        }
    }
}
