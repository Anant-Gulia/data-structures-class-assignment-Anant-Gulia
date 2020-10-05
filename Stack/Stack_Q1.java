import java.util.*;
class stack_ques1{

    int top = -1;

    void push(int data,int[] stack)
    {
        if(isfull(stack))
        {
            System.out.println("stack is full");
        }
        else
        {
            top = top+1;
            stack[top]  = data;
        }
    }


    int pop(int[] stack)
    {
        if(isempty()){
            System.out.println("empty stack");
            return 0;
        }
        else
        {
            int temp = stack[top];
            top = top-1;
            return temp;
        }
       
    }

    boolean isfull(int[] stack)
    {
        if(stack.length <= top)
        return true;
      else
        return false;
    }

    boolean isempty(){
        if(top < 0)
          return true;
        else
          return false;
    }
    int peek(int[] stack)
    {
        if(isempty()){
            System.out.println("empty stack");
            return 0;
        }
        else
        {
            
            return stack[top];
        }
    }

    void printstack(int[] stack){
        System.out.print("[");
      for(int i = top; i >= 0; i--){
            System.out.print(pop(stack) + " ");
      }
      System.out.print("]");
    }


    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     stack_ques1 obj = new stack_ques1();
     System.out.println("enter the stack size");
     int size = sc.nextInt();
     int[] stack = new int[size];
     for(int i = 0 ; i < size ; i++){
         obj.push(sc.nextInt(),stack);
     }
     System.out.println("top element is "+obj.peek(stack));
     obj.printstack(stack);

    }

}
