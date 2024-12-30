public class Player 
{
    private String playerName;
    private char playerSymbol;

    public String getPlayerName()
    {
        return playerName;
    }

    public char getPlayerSymbol() 
    {
        return playerSymbol;
    }

    Player(String name, char symbol)
    {
        this.playerName = name;
        this.playerSymbol = symbol;
    }

    static void placeCoin(int column,char symbol)
    {
        Board.setCoin(column,symbol);
    }
}
