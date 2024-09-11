import java.util.Scanner;
public class Prime 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check prime or not : ");
        int number = input.nextInt();
        if(number<0)
        {
            System.out.println("Invalid input");
            return;
        }
        for(int i=2;i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                System.out.println("It is not a prime");
                return;
            }
            else
            {
                System.out.println("It is prime");
                return;
            }
        }
        if(number == 0 || number == 1)
        {
            System.out.println("not a prime");
        }
        else
        {
            System.out.println("prime");
        }
    }
}
