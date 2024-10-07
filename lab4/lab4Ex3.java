// // Class for queue
// class Queue
// {
//  private int arr[];
//  private int front;
//  private int rear;
//  private int capacity;
//  private int count;
//  // Constructor to initialize queue
//  Queue(int size){
//     arr = new int[size];
//     capacity = size;
//     front = 0;
//     rear = 0;
//     count = 0;
//  }
 
// void dequeue(){
//     if(count != 0){
//         System.out.println("Removing " + arr[front % 5]);
//         front++;
//         count--;
//     }
//     else{
//         System.out.println("Queue is Empty");
//     }
//  }
 
// void enqueue(int item){    
//     if(count < capacity){
//         System.out.println("Inserting " + item);
//         arr[rear % 5] = item;
//         count++;
//         rear++;
//     }
//     else{
//         System.out.println("Queue is Full");
//     }
// }

// int peek(){
//     return arr[front];
// }

// int size(){
//     return count;
// }

// Boolean isEmpty(){
//     return (count == 0);
// }
// Boolean isFull(){
//     return (count == capacity);
// }}
// class lab4Ex3{
//     public static void main(String args[]){
//         Queue q = new Queue(5);
//         q.enqueue(1);
//         q.enqueue(2);
//         q.enqueue(3);
//         System.out.println("Front element is: " + q.peek());
//         q.dequeue();
//         System.out.println("Front element is: " + q.peek());
//         System.out.println("Queue size is " + q.size());
//         q.dequeue();
//         q.dequeue();
//         if (q.isEmpty())
//         System.out.println("Queue Is Empty");
//         else
//         System.out.println("Queue Is Not Empty");
//     }   
// }
