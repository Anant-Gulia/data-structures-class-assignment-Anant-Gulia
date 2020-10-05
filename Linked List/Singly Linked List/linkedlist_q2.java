import java.util.*;
public class list2
{
    Node head;
    static class Node 
    { 
        int data; 
        Node next; 
       
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
    public void printList() 
    { 
        Node n = head; 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
    } 
     void swap()
    {
        
            Node temp = head;
            Node temp2 = null;
    
            while(temp.next != null) {
                temp2 = temp;
                temp = temp.next;
            }
    
            temp.next = head.next;
            head.next = null;
            temp2.next = head;
            head = temp;
        
        
    }
     void deleteAlt() 
    { 
       if (head == null)  
          return; 
  
       Node temp = head; 
       Node temp2= head.next; 
  
       while (temp != null && temp2 != null)  
       {            
           temp.next = temp2.next; 
           temp2= null; 
           temp = temp.next; 
           if (temp != null)  
              temp2 = temp.next; 
       } 
    }  
     void removeDuplicates() 
    { 
        
        Node temp2 = head; 
  
        while (temp2 != null) { 
             Node temp = temp2; 
            
            while(temp!=null && temp.data==temp2.data) { 
                temp = temp.next; 
            } 
          
            temp2.next = temp; 
            temp2 = temp2.next; 
        } 
    }
     void pairswap()
    {
        Node temp = head; 
        int i;
    
        while (temp != null && temp.next != null) { 
  
            i = temp.data; 
            temp.data = temp.next.data; 
            temp.next.data = i; 
            temp = temp.next.next; 
        } 


    }
    void firstandlast()
{
    Node temp=head;
    System.out.println("\nirst element is: "+temp.data);
    while(temp.next!=null)
    {
        temp=temp.next;
    }
    System.out.println("Last element is: "+temp.data);


}
   
   
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       list2 list=new list2();
       System.out.println("Enter the number of elements you want to add in the linked list");
       int number= sc.nextInt();
       System.out.println("Enter Elements:");
       for(int i=0;i<number;i++)
       {
          int n=sc.nextInt();
          list.push(n);
       }
        System.out.println("List created by you :");
        list.printList();
        
        System.out.println("\nAfter swapping first and last element:");
        list.swap();
        list.printList();
        System.out.println("\nAfter deleting repeting node");
        list.removeDuplicates();
        list.printList();
        System.out.println("\nPairwise swap elements of a given linked list ");
        list.pairswap();
        list.printList();
        System.out.println("\nAfter deleting alternate node");
        list.deleteAlt();
        list.printList();
        list.firstandlast();
       
       
       
        
}
}