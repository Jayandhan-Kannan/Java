class Result {
    private Board board;

    public Result(Board board) {
        this.board = board;
    }

    // Check if there's a win condition
    public boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    // Check if the board is full (no more moves can be made)
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.getBoard()[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Check the rows for a win
    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board.getBoard()[i][0],board.getBoard()[i][1],board.getBoard()[i][2])) {
                return true;
            }
        }
        return false;
    }

    // Check the columns for a win
    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board.getBoard()[0][i],board.getBoard()[1][i],board.getBoard()[2][i])) {
                return true;
            }
        }
        return false;
    }

    // Check the diagonals for a win
    private boolean checkDiagonalsForWin() {
        return ((checkRowCol(board.getBoard()[0][0],board.getBoard()[1][1],board.getBoard()[2][2])) ||
                (checkRowCol(board.getBoard()[0][2],board.getBoard()[1][1],board.getBoard()[2][0])));
    }

    // Check if all three values are the same (and not empty) for a win condition
    private boolean checkRowCol(int c1, int c2, int c3) {
        return (c1+c2+c3 == 3 || c1+c2+c3 == 30);
    }
}