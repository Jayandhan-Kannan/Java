public class Board 
{
    private String[][] board;
    public Board()
    {
        board = new String[10][10];
        initializeBoard();
    }
    public String[][] getBoard()
    {
        return board;
    }
    private void initializeBoard()
    {
        int a=100;
        for(int i=0;i<10;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<10;j++,a--)
                {
                    String temp = a+"";
                    board[i][j] = temp;
                }
            }
            else
            {
                for(int j=9;j>=0;j--,a--)
                {
                    String temp = a+"";
                    board[i][j] = temp;
                }
            }

        }
    }  
    public void printBoard()
    {
        System.out.println("\nBoard");
        for(int i=0;i<10;i++)
        {
            if(i==9)
            {
                for(int j=0;j<10;j++)
                {
                    System.out.print(board[i][j]+"    ");
                }
                return;
            }
            for(int j=0;j<10;j++)
            {
                System.out.print(board[i][j]+"   ");
            }
            System.out.println("\n");
        }
    }
    int r=9,c=0;
    String t = "1";
    public boolean placeMark(int row, int col, String symbol)
    {       
        // System.out.println(t);
        board[r][c]=t;
        if(row>0 && col>0 && row<=10 && col<=10)
        {
            r=row-1;
            c=col-1;
            t = board[r][c];
            board[row-1][col-1] = symbol;
            //  System.out.println(t);
            return true;
        }
        return false;
    }
    public void fallBack(int i,int j,String symbol)
    {
        if("$".equals((board[i-1][j-1]).trim()))
        {
            if(i==6 && j==3)
            {
                placeMark(i, j, symbol);
            }
        }
    }
}
