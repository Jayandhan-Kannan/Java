import java.util.Scanner;

public class hPattern
{
    public static void printStar(int n,int s1,int s2)
    {
        for(int j=1;j<=n;j++)
        {
            if(j<=s1 || j>=s2)
            {
                System.out.print(" * ");
            }
            else
            {
                printSpace(1);
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
        int s1=1;
        int s2=n;
        for(int i=1;i<=n;i=i+2)
        {
            printStar(n,s1,s2);
            s1++;
            s2--;
        }
        for(int i=n-2;i>=1;i=i-2)
        {
            printStar(n,s2,s1);
            s2--;
            s1++;
            
        }
        
    }
}
