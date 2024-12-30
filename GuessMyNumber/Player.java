import java.util.*;

public class Player 
{
    private static String playerName;
    
    Player(String name)
    {
        this.playerName = name;
    }

    public static String getPlayerName()
    {
        return playerName;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Guess My Number Game");
        System.out.print("Enter the player name : ");
        Player player = new Player(input.next());
        System.out.print("Enter your target (10 or 100) : ");
        int target = input.nextInt();
        double guess;
        boolean flow;
        Game game;
        if(target == 10)
        {
            game = new Easy(Math.floor(Math.random()*10)+1);
            do
            {
                System.out.print("\nEnter your guess (1-10) : ");
                guess = input.nextDouble();
                flow = game.checkWin(guess);
                game.help(guess);
            }while(flow);   
            System.out.println("Congratulation!!! "+getPlayerName()+" You won");
            System.out.println("You took "+Game.attempt+" attempts to guess the number");
        }
        else
        {
            game = new Hard(Math.floor(Math.random()*100)+1);
            do
            {
                System.out.print("\nEnter your guess (1-100) : ");
                guess = input.nextDouble();
                flow = game.checkWin(guess);
                game.help(guess);                
            }while(flow); 
            System.out.println("Congratulation!!! "+getPlayerName()+" You won");
            System.out.println("You took "+Game.attempt+" attempts to guess the number");
        }
    }
}
