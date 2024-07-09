class arrayStack {
    int[] stack;
    int size, top;

    arrayStack(int n) {
        size = n;
        top = -1;
        stack = new int[size];
    }

    void push(int x) {
        if (top == size) {
            System.out.println("Stack overflow.");
        } else {
            top++;
            stack[top] = x;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack underflow.");
        } else {
            int value = stack[top];
            top--;
            System.out.println("Deleted Value: " + value);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    int size() {
        return top++;
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println(stack[top]);
        }
    }
}
