import java.util.*;
public class stack 
{
    int array[]=new int[10];
    static int position=0;
    void push(int data)
    {        
        array[position]=data;
        System.out.println("Data successfully added to stack");
        System.out.print("Stack Data : ");
        for(int i=0;i<=position;i++)
        {
            System.out.print(array[i]+" ");
        }
        position++;
    }
    void pop()
    {
        if(position<1)
        {
            System.err.println("Stack is empty");
        }
        else
        {       
            System.out.println("Popped data : "+array[position-1]);     
            array[position]=0;
            position--;
        }
    }
    void peek()
    {
        if(position<1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Peek element : "+array[position-1]);
        }
    }
    void display()
    {
        if(position<1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.print("Data : ");
            for(int i=0;i<position;i++)
            {
                System.out.print(array[i]+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int choice=0;
        int pushData;
        stack obj=new stack();
        do
        {
            System.out.println("\n--------------------------");
            System.out.println("\nWelcome to Stack Operations");
            System.out.println("1. Push the data");
            System.out.println("2. Pop the data");
            System.out.println("3. Peek the data");
            System.out.println("4. Display the Stack data");
            System.out.println("5. Exit \n");
            System.out.print("Enter your choice : ");
            choice=input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the data to be pushed into stack: ");
                    obj.push(pushData=input.nextInt());
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.display();
                    break;
                case 5:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Please select valid choice");
                    break;
            }
        }while(choice!=5);
    }
}






// import java.util.*;
// public class stack 
// {
//     int pushData;    
//     int array[]=new int[10];
//     int position=0;
//     int t=-1;
//     void push(int data)
//     {
        
//         array[position]=data;
//         System.out.println("Data successfully added to stack");
//         System.out.print("Stack Data : ");
//         for(int i=0;i<=position;i++)
//         {
//             System.out.print(array[i]+" ");
//         }
//         t=position++;
//     }
//     void pop()
//     {
//         if(t<0)
//         {
//             System.err.println("Stack is empty");
//         }
//         else
//         {
//             position=t;
//             array[position]=0;
//             t--;
//         }
//     }
//     void peek()
//     {
//         if(t<0)
//         {
//             System.out.println("Stack is empty");
//         }
//         else
//         {
//             System.out.println("Peek element : "+array[t]);
//         }
//     }
//     void display()
//     {
//         if(t<0)
//         {
//             System.out.println("Stack is empty");
//         }
//         else
//         {
//             System.out.print("Data : ");
//             for(int i=0;i<=t;i++)
//             {
//                 System.out.print(array[i]+" ");
//             }
//         }
//     }
//     public static void main(String[] args)
//     {
//         Scanner input=new Scanner(System.in);
//         int choice=0;
//         stack obj=new stack();
//         do
//         {
//             System.out.println("\n--------------------------");
//             System.out.println("\nWelcome to Stack Operations");
//             System.out.println("1. Push the data");
//             System.out.println("2. Pop the data");
//             System.out.println("3. Peek the data");
//             System.out.println("4. Display the Stack data");
//             System.out.println("5. Exit \n");
//             System.out.print("Enter your choice : ");
//             choice=input.nextInt();
//             switch(choice)
//             {
//                 case 1:
//                     System.out.print("Enter the data to be pushed into stack: ");
//                     obj.push(pushData=input.nextInt());
//                     break;
//                 case 2:
//                     obj.pop();
//                     break;
//                 case 3:
//                     obj.peek();
//                     break;
//                 case 4:
//                     obj.display();
//                     break;
//                 case 5:
//                     System.out.println("Thank you");
//                     break;
//                 default:
//                     System.out.println("Please select valid choice");
//                     break;
//             }
//         }while(choice!=5);
//     }
// }
