import java.util.Scanner;
public class DiamondOutline
{
    public static void printStar(int i)
    {
        for(int j=1;j<=i;j++)
        {
            if(j==1 || j==i)
            {
                System.out.print(" * ");
                printSpace(i-2);
            }
        }
        System.out.println();
    }
    public static void printSpace(int i)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("   ");
        }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=input.nextInt();
        if(n%2==0)
        {
            System.out.println("Invalid input. It accepts only odd number");
            return;
        }
        int spaceCount=(n-1)/2;
        for(int i=1;i<=n;i=i+2)        
        {
            printSpace(spaceCount);
            printStar(i);
            spaceCount--;
        }
        spaceCount=spaceCount+2;
        for(int i=n-2;i>=1;i=i-2)
        {
            printSpace(spaceCount);
            printStar(i);
            spaceCount++;
        }        
    }    
}


