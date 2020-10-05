import java.util.*;
  
public class stack_ques8
{      static final int max = 15;
    int top;
    char[] a = new char[max];
    public boolean isEmpty(){
        return (top<0);
    }
    public stack_ques8(){
        top = -1;

    }
    public boolean push(char x){
        if(top>=max){
            System.out.println("stack overflow");
            return false;
        }
        else{

            a[++top] = x;
            return true;
        }
    }
    boolean isempty(){
        if(top < 0)
          return true;
        else
          return false;
    }
    public char pop(){

            char x = a[top--];

            return x;
    }
    public char peek(){

            return a[top];
    }
    void printStack(){
        for(int i = top; i >= 0; i--){
              System.out.print(pop()+"");
        }
      }
  


    public static void main(String[] args)  
    { 
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        stack_ques8 stack=new stack_ques8();
        for (int i = 0; i < str.length();i=i+1) { 
            if (str.charAt(i) != ' ')
            { 
                stack.push(str.charAt(i)); 
            }
            else 
            { 
                while (stack.isempty() == false) 
                { 
                    System.out.print(stack.pop()); 
                } 
                System.out.print(" "); 
            } 
        } 
        while (stack.isempty() == false) 
        { 
            System.out.print(stack.pop()); 
        } 
        
        
    } 
}