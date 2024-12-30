import java.util.Scanner;
public class Game 
{
    Player player1;
    Player player2;
    Player currentPlayer;

    Game(Player player1,Player player2)
    {
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;
    }
    
    boolean isWin()
    {
        //check row win
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(Board.getBox()[i][j] == 'X' && Board.getBox()[i][j+1] == 'X' && Board.getBox()[i][j+2] == 'X' && Board.getBox()[i][j+3] == 'X')
                {
                    System.out.println("Congratulations!!!"+currentPlayer.getPlayerName()+" You won");
                    return false;
                }
                if(Board.getBox()[i][j] == 'O' && Board.getBox()[i][j+1] == 'O' && Board.getBox()[i][j+2] == 'O' && Board.getBox()[i][j+3] == 'O')
                {
                    System.out.println("Congratulations!!!"+currentPlayer.getPlayerName()+" You won");
                    return false;
                }
            }
        }

        //check column win
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(Board.getBox()[j][i] == 'X' && Board.getBox()[j+1][i] == 'X' && Board.getBox()[j+2][i] == 'X' && Board.getBox()[j+3][i] == 'X')
                {
                    System.out.println("Congratulations!!!"+currentPlayer.getPlayerName()+" You won");
                    return false;
                }
                if(Board.getBox()[j][i] == 'O' && Board.getBox()[j+1][i] == 'O' && Board.getBox()[j+2][i] == 'O' && Board.getBox()[j+3][i] == 'O')
                {
                    System.out.println("Congratulations!!!"+currentPlayer.getPlayerName()+" You won");
                    return false;
                }
            }
        }

        //check diagonal win
            for(int j=0;j<4;j++)
            {
                if(Board.getBox()[5][j] == 'X' && Board.getBox()[4][j+1] == 'X' && Board.getBox()[3][j+2] == 'X' && Board.getBox()[2][j+3] == 'X')
                {
                    System.out.println("Congratulations!!!"+currentPlayer.getPlayerName()+" You won");
                    return false;
                }
                if(Board.getBox()[5][j] == 'O' && Board.getBox()[4][j+1] == 'O' && Board.getBox()[3][j+2] == 'O' && Board.getBox()[2][j+3] == 'O')
                {
                    System.out.println("Congratulations!!!"+currentPlayer.getPlayerName()+" You won");
                    return false;
                }
                if(Board.getBox()[0][j] == 'X' && Board.getBox()[1][j+1] == 'X' && Board.getBox()[2][j+2] == 'X' && Board.getBox()[3][j+3] == 'X')
                {
                    System.out.println("Congratulations!!!"+currentPlayer.getPlayerName()+" You won");
                    return false;
                }
                if(Board.getBox()[0][j] == 'O' && Board.getBox()[1][j+1] == 'O' && Board.getBox()[2][j+2] == 'O' && Board.getBox()[3][j+3] == 'O')
                {
                    System.out.println("Congratulations!!!"+currentPlayer.getPlayerName()+" You won");
                    return false;
                }
            }
        return true;
    }

    boolean isDraw()
    {
        if(Board.getCount() == 42)
        {
            System.out.println("Oops! Match drawn");
            return false;
        }
        else
        {
            return true;
        }
    }

    void start(int column)
    {
        Player.placeCoin(column-1,currentPlayer.getPlayerSymbol());
        Board.display();
        isWin();
        isDraw();
        currentPlayer = (currentPlayer.getPlayerSymbol() == 'X') ? player2 : player1;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Board board = new Board();
        System.out.println("\nWelcome to Connect Four Game");
        System.out.print("Enter the player-1 name : ");
        Player player1 = new Player(input.next(), 'X');
        System.out.print("Enter the player-2 name : ");
        Player player2 = new Player(input.next(), 'O');
        Game game = new Game(player1,player2);
        board.display();
        boolean win = game.isWin();
        boolean draw = game.isDraw();
        while(win && draw)   
        {
            System.out.print(game.currentPlayer.getPlayerName()+"'s turn("+game.currentPlayer.getPlayerSymbol()+ ") Enter the column (1-7): ");
            int column = input.nextInt();
            if(column>7 || column<1)
            {
                System.out.println("Invalid position");
            }
            else
            {
                game.start(column);                
            }            
        }
    }
}

