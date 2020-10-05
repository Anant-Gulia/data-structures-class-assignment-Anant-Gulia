import java.util.Scanner;

class StackNode {
    int data;
    StackNode next;     
}

class Stack_ques2 {
    StackNode top = null;

    void push(int data){
        StackNode newnode = new StackNode();
        if(isfull(newnode)){
            System.out.println("No space");
        }
        else{
                 newnode.data = data;
                 if(top == null){
                     top = newnode;
                 }
                 else{
                        newnode.next = top;
                        top = newnode;
                 }
        }
    }

    int pop(){
        int temp;
        if(isempty()){
            System.out.println(" Empty Stack");
            return 0;
        }
        else{
            temp =top.data;
            top=top.next;
            return temp;

        }
    }

    int peek(){
        if(isempty()){
            System.out.println(" Empty Stack");
            return 0;
        }
        else{
            return top.data;
        }

    }

    boolean isfull(StackNode node){
            if(node == null){
                return true;
            }
            else{
                return false;
            }
    }

    boolean isempty(){
        if(top==null){
            return true;
        }
        else{
            return false;
        }
    }

    void printStack(int size){
        System.out.print("[");
      for(int i = 0; i <size; i++){
            System.out.print(pop()+" ");
      }
      System.out.print("]");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack_ques2 obj = new Stack_ques2();
        System.out.println("Enter the size of stack");
        int size = sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<size;i++){
            obj.push(sc.nextInt());
        }

        System.out.println("Top Element is: "+obj.peek());

        System.out.println("Top Element Deleted: "+obj.pop());

        System.out.println("Elements are: ");
        obj.printStack(size);
        
    }    
}
