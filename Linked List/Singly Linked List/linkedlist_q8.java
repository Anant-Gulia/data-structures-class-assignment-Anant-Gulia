import java.util.Scanner;


class ll_ques8 {
    node head = null;
    node tail = null;
    void insertAtBeg(int key){
       
        node newnode = new node();
       
          newnode.data=key;
          if(head==null){
              head=newnode;
          }
          else{
              head.previous = newnode;
              newnode.next = head;
              head = newnode;
          
        }
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        tail = temp;
          
    }


    void insertAtEnd(int key){
        node newnode = new node();
        newnode.data = key;
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.previous = temp;
        newnode.next = null;
    }
    void traverse(){
        node temp = head;
        while(temp!=null){
          System.out.print("   "+temp.data);
          temp=temp.next;
        }
    }
    void insertatpos(int pos,int key){
        node newnode = new node();
        node temp = head;
        node temp2 = null;
        newnode.data = key;
        int i = 0;
        while(i<pos-1){
            temp = temp.next;
            i++;
        }
        temp2 = temp.next;
        temp.next = newnode;
        newnode.previous = temp;
        newnode.next = temp2;
        temp2.previous = newnode;
        temp2 = null;


    }
    void deleteatbeg(){
        head = head.next;
    }
    void deleteatend(){
        node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next.previous = null;
        temp.next = null;
    }
    void deletatpos(int pos){
            node temp = head;
            node temp2 =null;
            int i = 0;
            while(i<pos-1){
                temp = temp.next;
                i++;
            }
            temp2 =temp.next;
            temp.next.previous = temp.previous;
            temp.next = null;
            temp.previous.next =temp2;
            temp.previous = null;
            
    }
    void reversetraverse(){
        node temp = tail;
        while(temp!=null){
            System.out.print("   "+temp.data);
            temp = temp.previous;
        }
    }

    public static void main(String[] args) {
        ll_ques8 mylist = new ll_ques8();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size");
        int size = sc.nextInt();
        System.out.print("enter the elements");
        for(int i=0;i<size;i++){
            mylist.insertAtBeg(sc.nextInt());}
          
            

        mylist.traverse();
        System.out.println("enter the number to insert at the end");
        int iae = sc.nextInt();
        mylist.insertAtEnd(iae);
        mylist.traverse();
        System.out.println("enter the position and number to insert");
        mylist.insertatpos(sc.nextInt(),sc.nextInt() );
        mylist.traverse();
        System.out.println("first element deleted");
        mylist.deleteatbeg();
        mylist.traverse();
        System.out.println("last element deleted");
        mylist.deleteatend();
        mylist.traverse();
        System.out.println("enter the position to delete ");
        mylist.deletatpos(sc.nextInt());
        mylist.traverse();
        System.out.println("Reverse traversed Linked List is : ");
        mylist.reversetraverse();

    }
}