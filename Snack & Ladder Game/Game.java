import java.util.*;
import java.lang.Math;
public class Game 
{
    private Player p1;
    private Player p2;
    private Result result;
    private Board board;
    public Game(Player p1,Player p2)
    {
        this.p1 = p1;
        this.p2 = p2;
        board = new Board();
        result = new Result(board);
    }
    int i=10,j=0,k=0,t=0;
    public void start()
    {
        Scanner input = new Scanner(System.in);
        Player currentPlayer = p1;        
        board.printBoard();    
        boolean t= true;   
        do
        {
             
            // System.out.print("\n\n"+currentPlayer.getName()+" Would you want to roll? Press y to roll : ");
            // String decision = input.next();
            // if("y".equals(decision))
            // {
                int roll = input.nextInt();  
                // int roll = (int)(Math.random()*6);
                j+=roll; 
            if(j>10)
            {
                i--;
                j=j-10;                 
            }
            if(i%2!=0)
            {
                k=11-j;
                board.placeMark(i,k," "+currentPlayer.getSymbol());
                board.fallBack(i, j, currentPlayer.getSymbol());
            }  
            else
            {
                board.placeMark(i,j," "+currentPlayer.getSymbol());
                board.fallBack(i, j, currentPlayer.getSymbol());
            }  
            board.printBoard();          
            if(result.check())
            {
                System.out.println("\n"+currentPlayer.getName()+" "+"Congratulations you win!!!");
                break;
            }
            // currentPlayer=(currentPlayer == p1) ? p2 : p1;
            // }
            // else
            // {
            //     break;
            // }            
            
        }while(t);
        input.close();
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Snack & Ladder Game");
        System.out.print("Enter the Player-1 name : ");
        Player p1 = new Player(input.next(),"$");
        System.out.print("Enter the Player-2 name : ");
        Player p2 = new Player(input.next(),"#");
        Game game = new Game(p1,p2);
        game.start(); 
        input.close();
    }
}
