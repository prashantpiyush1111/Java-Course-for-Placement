import java.util.*;

public class NQueens {

    public static void solve(int n) {
        char[][] board = new char[n][n];

        // Initialize board
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(board, 0);
    }

    private static void backtrack(char[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(board, row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // vertical check
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(4); // Example: 4 queens
    }
}