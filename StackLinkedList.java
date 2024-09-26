import java.util.Scanner;

public class StackLinkedList
{
    Node head;
    void push(int newValue)
    {
        Node n = new Node(newValue);
        if(head == null)
        {
            head=n;
            System.out.println("Data pushed into stack");
        }
        else
        {
            n.next=head;
            head=n;            
        }
    }
    void pop()
    {
        if(head == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            head=head.next;
            System.out.println("Top element popped");
        }
    }
    void peek()
    {
        if(head == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Peek element : "+""+head.data);  
        }
        
    }
    void display()
    {
        Node current = head;
        if(head == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack data :");
            while(current != null)
            {
                System.out.println(current.data+" -> "+current.next);
                current=current.next;
            }
        }        
    }
    void isEmpty()
    {
        if(head == null)
        {
            System.out.println("Yes, Stack is empty");
        }
        else
        {
            System.out.println("No, Stack contains some data");
        }
    }
    public class Node 
    {
        int data;
        Node next;

        Node(int data) 
        {
            this.data = data;
        }
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        StackLinkedList sl = new StackLinkedList();
        do
        {
            System.out.println("\nWelcome to Stack Implementation");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Is Empty");
            System.out.println("6. Exit");
            System.out.print("\nSelect your choice : ");
            choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the data to be pushed into the stack : ");
                    int newValue = input.nextInt();
                    sl.push(newValue);
                    break;
                case 2:
                    sl.pop();
                    break;
                case 3:
                    sl.peek();
                    break;
                case 4:
                    sl.display();
                    break;
                case 5:
                    sl.isEmpty();
                    break;
                case 6:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }while(choice != 6);       

    }
}