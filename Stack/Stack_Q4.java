import java.util.*;
public class stack_ques4 {
    
        static final int max = 15;
        int top;
        char[] a = new char[max];
        
        public stack_ques4(){
            top = -1;
        }
        public boolean push(char x){
            if(isFull()){
                System.out.println("stack is full");
                return false;
            }
            else{
                a[++top] = x;
                return true;
            }
        }
        public char pop(){
 
                char x = a[top--];
                return x;
        }
        public char peek(){
 
                return a[top];
        }
        boolean isFull(){
            if(a.length <= top)
              return true;
            else
              return false;
        }
    
        // Underflow condition
        boolean isEmpty(){
            if(top < 0)
              return true;
            else
              return false;
        }
    
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to check: ");
        String s = sc.nextLine();
       check(s);
    }
    static void check(String str){
        stack_ques4 stack = new stack_ques4(); 
        boolean flag = true;
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(x=='(' ||x=='{' || x=='['){
                stack.push(x);
                continue;
            }
            if(stack.isEmpty()){
                flag = false;
            }
            switch (x) 
            {
                case ')':
                    char a = stack.pop();
                    if (a == '{' || a == '[')
                        flag = false;
                    break;
                case '}':
                    char b = stack.pop();
                    if (b == '(' || b == '[')
                        flag = false;
                    break;
                case ']':
                    char c = stack.pop();
                    if (c == '(' || c == '{')
                        flag = false;
                    break;
            }
 
        }
        if (flag){
            System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }
    }
}