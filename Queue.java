import java.util.Scanner;

public class Queue 
{
    Node head;
    void enqueue(int newValue)
    {
        Node n = new Node(newValue);
        if(head == null)
        {
            head=n;
            System.out.println("Data pushed into queue");
        }
        else
        {
            Node current = head;
            while(current.next!=null) 
            {
                current=current.next;
            }  
            current.next=n;        
        }
    }
    void dequeue()
    {
        if(head == null)
        {
            System.out.println("Queue is empty");
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
            System.out.println("Queue is empty");
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
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Queue data :");
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
            System.out.println("Yes, Queue is empty");
        }
        else
        {
            System.out.println("No, Queue contains some data");
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
        Queue q = new Queue();
        do
        {
            System.out.println("\nWelcome to Queue Implementation");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Is Empty");
            System.out.println("6. Exit");
            System.out.print("\nSelect your choice : ");
            choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the data to be pushed into the queue : ");
                    int newValue = input.nextInt();
                    q.enqueue(newValue);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    q.isEmpty();
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
