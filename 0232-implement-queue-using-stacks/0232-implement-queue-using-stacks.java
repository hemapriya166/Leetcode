class MyQueue {
    int stack[];
    int stack2[];
    int top;
    int j;
    int value;


    public MyQueue() {
        stack=new int[10000];
        stack2=new int[stack.length];
        top=-1;
        j=-1;
       
        
    }
    
    public void push(int x) {
      top++;
      stack[top]=x;
      
    }
    void transfer(){
        if(j==-1){
            while(top>=0){
                 j++;
                 stack2[j]=stack[top];
                 top--;
            
            }
        }
    }
        
    
    public int pop() {
        transfer();
        value=stack2[j];
        j--;
        return value;
        
    }
    
    public int peek() {
        transfer();
       return stack2[j];
        
    }
    
    public boolean empty() {
        if(top==-1&&j==-1){
            return true;
        }
        return false;
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