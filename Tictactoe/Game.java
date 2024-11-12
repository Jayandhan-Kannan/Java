import java.util.Scanner;
public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Result result;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        board = new Board();
        result = new Result(board);
    }

    // Start the game
    public void start() {
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;

        while (true) {
            System.out.println("------------------");
            board.printBoard();
            int row, col;

            // Prompt the current player for their move
            do {
                System.out.println(currentPlayer.getName() + " (" + currentPlayer.getMark() + "), enter your move (row and column): ");
                row = scanner.nextInt();
                col = scanner.nextInt();
            } while (!board.placeMark(row - 1, col - 1, currentPlayer.getMark())); // Adjusting for 0-indexed array

            if (result.checkForWin()) {
                board.printBoard();
                System.out.println("Congratulations! " + currentPlayer.getName() + " wins!");
                break;
            } else if (result.isBoardFull()) {
                board.printBoard();
                System.out.println("The game is a tie!");
                break;
            }

            // Switch players
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe Game");
        System.out.print("Enter the Player-1 name : ");
        Player player1 = new Player(scanner.next(), 1);
        System.out.print("Enter the Player name-2 : ");
        Player player2 = new Player(scanner.next(), 10);
        Game game = new Game(player1, player2);
        game.start();
    }
} 
