class MyStack {
Queue<Integer>q1 = new ArrayDeque<>();
Queue<Integer>q2 = new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        //move all elments form q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        //add new element  to q2
        q1.add(x);
        
        //move all elemnts back from q2 to q1
        while (!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
        }
    }


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */