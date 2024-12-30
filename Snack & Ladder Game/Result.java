public class Result 
{
    private Board board;
    private Player player;
    public Result(Board board)
    {
        this.board = board;
    }
    public boolean check()
    {
        if("$".equals(board.getBoard()[0][0]))
        {
            return true;
        }
        return false;
    }
}
