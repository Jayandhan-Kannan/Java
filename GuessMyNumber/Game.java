abstract class Game 
{
    protected static double randomNumber;
    protected static int attempt = 0;

    public int getAttempt()
    {
        return attempt;
    }
        
    boolean checkWin(double number)
    {
        attempt++;
        if(number==randomNumber)
        {
            return false;
        }
        return true;
    }

    abstract void help(double number);
}
    
class Easy extends Game
{
    Easy(double number)
    {
        super.randomNumber = number;        
    }

    void help(double number)
    {
        if(number>randomNumber)
        {
            System.out.println("Your guess is greater than my number");
        }
        else if(number<randomNumber)
        {
            System.out.println("Your guess is less than my number");
        }
    }    
}

class Hard extends Game
{
    Hard(double number)
    {
        super.randomNumber = number;        
    }

    void help(double number)
    {
        if(number>=randomNumber && number<=(randomNumber+5))
        {
            System.out.println("Your guess is nearly higher");
            return;
            
        }
        else if(number<=randomNumber && number>=(randomNumber-5))
        {
            System.out.println("Your guess is nearly low");
            return;
        }
        if(number>randomNumber)
        {
            System.out.println("Your guess is greater than my number");
        }
        else if(number<randomNumber)
        {
            System.out.println("Your guess is less than my number");
        }        
    }   
}


