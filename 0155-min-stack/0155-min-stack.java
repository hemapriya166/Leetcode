class MinStack {
    int Stack[];
    int minStack[];
    int top;

    public MinStack() {
        top = -1;
        Stack = new int[30000];
        minStack = new int[30000];
    }

    public void push(int value) {
        top++;
        Stack[top] = value;

        if (top == 0) {
            minStack[top] = value;
        } else {
            minStack[top] = Math.min(minStack[top - 1], value);
        }
    }

    public void pop() {
        top--;
    }

    public int top() {
        return Stack[top];
    }

    public int getMin() {
        return minStack[top];
    }
}