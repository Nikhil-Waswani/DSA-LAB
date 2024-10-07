class Node{
 int data;
 Node next;

 Node(int data){
    this.data = data;
 }
}

class Stack
{
    Node top;

    public Stack(){
        this.top = null;
    }

    void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

 boolean isEmpty(){
    return (top == null);
 }
 
 int peek(){
    if(top != null){
        return top.data;
    }
    else
    System.out.println("Stack is Empty");
    return 0;

}

 int pop(){
    if(top != null){
        int temp = top.data;
        top = top.next;
        return temp;
    }
    else{
        System.out.println("Stack is Empty");
        return 0;
    }
 }
}
class lab4Ex2{
    public static void main(String args[]){
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
