public class Board 
{
    private static char box[][];
    private static int count;
        
        Board()
        {
            count = 0;
            box = new char[6][7];
            for(int i=0;i<6;i++)
            {
                for(int j=0;j<7;j++)
                {
                    box[i][j] = '-';
                }
            }
        }

        public static int getCount()
        {
            return count;
        }
    
        public static char[][] getBox()
        {
            return box;
        }
        
        static void display()
            {
                System.out.println("Board");
                System.out.println(" -----------------------------");
                for(int i=0;i<6;i++)
                {
                    for(int j=0;j<7;j++)
                    {
                        System.out.print(" | "+box[i][j]);
                    }
                    System.out.println(" |");
                    System.out.println(" -----------------------------");
                    
                }
            }
        
        static void setCoin(int column, char symbol)
        {
            for(int i=5;i>=0;i--)
            {
                if(box[i][column] == '-')
                {
                    box[i][column] = symbol;
                    count++;
                break;
            }
            if(box[0][column] != '-')
            {
                System.out.println("Please select valid position");
                break;
            }
        }
    }
}
