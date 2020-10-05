import java.util.Scanner;


class ll_ques4 {
    node head=null;
     void insertAtBeg(int key){
          node newnode = new node();
          newnode.data=key;
          if(head==null){
              head=newnode;
          }
          else{
              newnode.next=head;
              head=newnode;
          }  
      }

      void traverse(){
        node temp = head;
        while(temp!=null){
          System.out.print("   "+temp.data);
          temp=temp.next;}
        
          }
          void palindrome(int size){
            node current = head;
            int position =0;
            boolean flag = true;
            while(current!=null) 
            {
                node temp2 = head;
                for(int i =0;i<size-position-1;i++) {
                    temp2 = temp2.next;
                }
                if(current.data != temp2.data)
                {
                    flag = false;
                    break;
                }
                current = current.next;
                position++;
            }
            if (flag){
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Not Palindrome");
            }
    }
    public static void main(String[] args) {
        ll_ques4 mylist = new ll_ques4();
        Scanner sc = new Scanner(System.in);
       

        System.out.print("enter the size");
        int size = sc.nextInt();
        System.out.print("enter the elements");
        for(int i=0;i<size;i++){
            mylist.insertAtBeg(sc.nextInt());

        }
        mylist.traverse();
        mylist.palindrome(size);
    }
}