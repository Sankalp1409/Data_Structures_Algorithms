class MyQueue {
    
    Stack<Integer>input;
    Stack<Integer>output;
    public MyQueue() {
        input=new Stack<>();
        output=new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(output.size()!=0)
            return output.pop();
    
        int size=input.size();
        while(size>0)
        {
            output.push(input.pop());
            size--;
        }
        return output.pop();
    }
    
    public int peek() {
        if(output.size()!=0)
            return output.peek();
        int size=input.size();
        while(size>0)
        {
            output.push(input.pop());
            size--;
        }
        return output.peek();
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
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