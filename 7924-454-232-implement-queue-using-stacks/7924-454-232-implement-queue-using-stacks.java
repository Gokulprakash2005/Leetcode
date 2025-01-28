import java.util.*;
class MyQueue {
    Stack<Integer> frist;
    Stack<Integer> second;
    public MyQueue() {
        frist=new Stack<>();
        second=new Stack<>();
    }
    
    public void push(int x) {
   
        while(!frist.isEmpty())
        {
            second.push(frist.pop());
        }
        second.push(x);
         while(!second.isEmpty())
        {
            frist.push(second.pop());
        }
    }
    
    public int pop() {
        if(!frist.isEmpty())
        {
        return frist.pop();
        }
        return -1;
    }
    
    public int peek() {
        if(!frist.isEmpty())
        {
        return frist.peek();
        }
        return -1;
    }
    
    public boolean empty() {
        return frist.isEmpty();
    }
} 


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */