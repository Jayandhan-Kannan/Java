public class Board {
    private int[][] board;

    public Board() {
        board = new int[3][3];
        initializeBoard();
    }

    // Initialize the board with empty spaces
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 0;
            }
        }
    }

    // Print the current state of the board
    public void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Place a mark on the board
    public boolean placeMark(int row, int col, int mark) {
        if (row >= 0 && col >= 0 && row < 3 && col < 3) {
            if (board[row][col] == 0) {
                board[row][col] = mark;
                return true;
            }
        }
        System.out.println("Invalid move or already filled");
        return false;
    }

    public int[][] getBoard() {
        return board;
    }
}
