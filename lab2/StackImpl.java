class Node {
    int data;
    Node next;
Node(int data){
this.data=data;
this.next=null;
}
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    public void push(int x) {
        Node newNode = new Node(x);
        newNode.data = x;
        newNode.next = top;
        top = newNode;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return top element in a stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        return top.data;
    }

    // Utility function to pop top element from the stack and check for Stack underflow
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int temp = peek();
        top = top.next;
        return temp;
    }
}

class StackImpl {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        if (stack.isEmpty()) {
            System.out.print("Stack is empty");
        } else {
            System.out.print("Stack is not empty");
        }
    }
}
