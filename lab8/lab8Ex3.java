// import java.util.Scanner;
// class Node{
//     String data;
//     Node next;

//     Node(String data){
//         this.data = data;
//     }
// }

// class ReduStack{
//     Node top;

//     void push(String data){
//         Node newNode = new Node(data);
//         newNode.next = top;
//         top = newNode;
//     }

//     String pop(){
//         if(top != null ){
//             String temp = top.data;
//             top = top.next;
//             return temp;
//         }
//         return "";
//     }

//     void peek(){
//         System.out.println(top.data);
//     }
// }

// class Stack{
//     Node top;
//     ReduStack reduStack = new ReduStack();

//     void push(String data){
//         Node newNode = new Node(data);
//         newNode.next = top;
//         top = newNode;
//     }

//     String pop(){
//         {
//             if(top != null ){
//                 String temp = top.data;
//                 top = top.next;
//                 return temp;
//             }
//             return "";
//         }
//     }

//     String peek(){
//         return top.data;
//     }

//     void display(){
//         if(top == null){
//             System.out.println("Stack_Empty");
//         }
//         else{
//             ReduStack tempStack = new ReduStack();
//             while(top != null){
//                 System.out.print(peek() + " ");
//                 tempStack.push(pop());
//             }
//             System.out.println();
//             while (tempStack.top != null){
//                 push(tempStack.pop());
//             }
//         }
//     }

//     void undo(){
//         reduStack.push(pop());
//     }

//     void redo(){
//         push(reduStack.pop());
//     }

//     void choice(int choice){
//         switch(choice){
//             case 1:
//             Scanner inp = new Scanner(System.in);
//             System.out.print("Entert the input: ");
//             String data = inp.nextLine();
//             push(data);
//             break;
//             case 2:
//             undo();
//             break;
//             case 3:
//             redo();
//             break;
//             case 4:
//             display();
//             break;

//             default:
//             System.out.println("Enter the choice b/w 1 - 4 :");
//         }}}

// class lab8Ex3{
//     public static void main(String args[]){
//         Stack stack = new Stack();
//         stack.choice(1);    stack.choice(1);    stack.choice(1);    stack.choice(1);
        
//         stack.choice(2);    stack.choice(2);
//         stack.choice(4);
//         stack.choice(3);
//         stack.choice(4);
//         stack.choice(3);
//         stack.choice(4);   }}
