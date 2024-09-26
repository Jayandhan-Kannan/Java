import java.util.*;
public class Greatest 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1=input.nextInt();
        System.out.print("Enter the second number : ");
        int n2=input.nextInt();
        System.out.print("Enter the third number : ");
        int n3=input.nextInt();
        if(n1>n2)
        {
            if(n2>n3)
            {
                System.out.println("n1 is big");
            }
            else if(n3>n1)
            {
                System.out.println("n3 is big");
            }
            else
            {
                System.out.println("n1 & n3 are equal and big");
            }
        }
        else if(n2>n1)
        {
            if(n2>n3)
            {
                System.out.println("n2 is big");
            }
            else if(n3>n2)
            {
                System.out.println("n3 is big");
            }
            else
            {
                System.out.println("n2 & n3 are equal and big");
            }
        }
        else
        {
            if(n1>n3)
            {
                System.out.println("n1 is big");
            }
            else if(n3>n1)
            {
                System.out.println("n3 is big");
            }
            else
            {
                System.out.println("n1, n2, n3 are equal");
            }
        }
        
    }    
}


