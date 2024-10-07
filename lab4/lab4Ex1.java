// class Stack
// {
//  private int arr[];
//  private int top;
//  private int capacity;

//  Stack(int size){
//     arr = new int[size];
//     capacity = size;
//     top = -1;
//  }

//  void push(int x){
//     if(top+1 < capacity){
//         System.out.println("Inserting " + x);
//         arr[++top] = x;
//     }
//     else{
//         System.out.println("Stack is full");
//     }
//  }
 
//  int pop(){
//     if(top > -1){
//         System.out.println("removing " + arr[top]);
//         return arr[top--];
//     }
//     else{
//         System.out.println("Stack is empty");
//         return 0;
//     }
//  }

//  int peek(){
//     return arr[top];
//  }

//  int size(){
//     return top+1;
// }

// Boolean isEmpty(){
//     return (top == -1);
//  }
 
//  Boolean isFull(){
//     return (top == 2);
//  }
// }
// class lab4Ex1{
//     public static void main(String args[]){
//         Stack stack = new Stack(3);
//         stack.push(1);
//         stack.push(2);
//         stack.pop();
//         stack.pop();
//         stack.push(3);
//         System.out.println("Top element is: " + stack.peek());
//         System.out.println("Stack size is " + stack.size());
//         stack.pop();

//         if (stack.isEmpty())
//         System.out.println("Stack Is Empty");
//         else
//         System.out.println("Stack Is Not Empty");
//     }
// }