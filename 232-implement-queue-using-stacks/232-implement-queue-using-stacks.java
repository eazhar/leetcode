class MyQueue {
    Stack <Integer> s1;
    public MyQueue() {
        s1 = new Stack<Integer>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        Stack <Integer> s2 = new Stack<>();
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int value = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return value;
    }
    
    public int peek() {
        Stack <Integer> s2 = new Stack<>();
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int value = s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return value;
    }
    
    public boolean empty() {
        return s1.isEmpty();
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