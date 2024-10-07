// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// class Queue{
//     Node rear = null;
//     Node front = null;

//     int dequeue(){
//         if(front != null){
//             int temp = front.data; 
//             front = front.next;
//             return temp;
//         }
//         else{
//             System.out.println("Queue is Empty");
//             return 0;
//         }
//     }

//     void enqueue(int item){
//     Node newNode = new Node(item);
//     rear = newNode;
//     if(front == null){
//         front = newNode;
//     }else{
//         Node temp = front;
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }
//  }

//     int peek(){
//     if(front != null){
//         return front.data;
//     }
//     else{
//         System.out.println("Queue is Empty");
//         return 0;
//     }
//  }

//  boolean isEmpty(){
//     return (front == null);
//  }
// }
// class lab4Ex4{
//     public static void main(String args[]){
//         Queue q = new Queue();
//         q.enqueue(1);
//         q.enqueue(2);
//         q.enqueue(3);
//         q.enqueue(4);
       
//         System.out.println("Front element is " + q.peek());
       
//         q.dequeue();
//         q.dequeue();
//         q.dequeue();
//         q.dequeue();
//         if(q.isEmpty()){
//             System.out.print("Queue is empty");
//             }else {
//             System.out.print("Queue is not empty");
//         }
//     }
// }
