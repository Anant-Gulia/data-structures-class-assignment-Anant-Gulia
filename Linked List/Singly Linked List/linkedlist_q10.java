import java.util.*;
class ll_ques10{
    nodee head = null;
    nodee tail = null;
    void insertAtBeg(int key){
        nodee newnode = new nodee();
        newnode.data=key;
        if(head==null){
            head=newnode;
            tail = newnode;  
             
        }
        else{
           
            tail.next = newnode;    
            tail = newnode;  
            tail.next = head;  
        }  
       
        
    }
    void traverse(){
        nodee temp = head;
        do{
            System.out.print("   "+temp.data);
              temp=temp.next;
        }while(temp!=head);
       
    }
    void insertatpos(int pos,int key){
        nodee temp =head;
        nodee newnode = new nodee();
        nodee temp2 = null;
        newnode.data = key;
        int i=0;
        while(i<pos-2){
            temp=temp.next;
            i++;
        }
        temp2 = temp.next;
        temp.next = newnode;
        newnode.next = temp2;


    }
    void deleteatpos(int pos){
        nodee temp = head;
        int i=0;
        while(i<pos-2){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

    }
    public static void main(String[] args) {
        ll_ques10 obj = new ll_ques10();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size");
        int size = sc.nextInt();
        System.out.print("enter the elements");
        for(int i=0;i<size;i++){
            obj.insertAtBeg(sc.nextInt());

        }
        obj.traverse();
        System.out.print("enter the position and  element to insert : ");
        obj.insertatpos(sc.nextInt(), sc.nextInt());
        obj.traverse();
        System.out.print("enter the position to delete : ");
        obj.deleteatpos(sc.nextInt());
        obj.traverse();
        
        
    }
}