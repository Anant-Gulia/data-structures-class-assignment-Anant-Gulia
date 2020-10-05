import java.util.Scanner;


class ll_ques9 {
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
    void traverse(){
        node temp = head;
        while(temp!=null){
          System.out.print("   "+temp.data);
          temp=temp.next;
        }
    }
    void rotate(int pos){
        node temp = head;
        int i = 0;
         node temp3 = null;
        while(i<pos-1){
            temp = temp.next;
            i++;
        }
        temp3 = temp.next;
        temp.next.previous = null;
        temp.next = null;
        head.previous = tail;
        tail.next = head;
        head = temp3;
    }
    public static void main(String[] args) {
        ll_ques9 mylist = new ll_ques9();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size");
        int size = sc.nextInt();
        System.out.print("enter the elements");
        for(int i=0;i<size;i++){
            mylist.insertAtBeg(sc.nextInt());}
        mylist.traverse();
        System.out.println("Enter the position from where you want to rotate the list?");
        mylist.rotate(sc.nextInt());
        mylist.traverse();
    }
}