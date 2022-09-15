import java.util.*;

public class NQueensProblem {

    // N-Queens problem (N x N chessboard, N Queens, Print all the solutions where
    // queens are safe)

    static boolean isSafe(int row, int col, char[][] board) {
        // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q')
                return false;
        }
        // vertical
        for (char[] chars : board) {
            if (chars[col] == 'Q')
                return false;
        }
        // upper left
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--)
            if (board[r][c] == 'Q')
                return false;
        // upper right
        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++)
            if (board[r][c] == 'Q')
                return false;
        // lower left
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--)
            if (board[r][c] == 'Q')
                return false;
        // lower right
        for (int r = row, c = col; r < board.length && c < board.length; r++, c++)
            if (board[r][c] == 'Q')
                return false;
        return true;
    }

    static void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for (char[] chars : board) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (chars[j] == 'Q')
                    row += 'Q';
                else
                    row += '_';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    static void nQueen(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                nQueen(board, allBoards, col + 1);
                board[row][col] = '_';
            }
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of N: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        nQueen(board, allBoards, 0);
        for (List<String> allBoard : allBoards) {
            System.out.println(allBoard);
        }
        scanner.close();
    }
}
