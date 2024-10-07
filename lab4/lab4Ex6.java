// class Stack{
//     private Queue q1,q2;

//     Stack(){
//         q1 = new Queue();
//         q2 = new Queue();
//     }
//     void push(int data){
//         q2.enqueue(data);
//         while(!q1.isEmpty()){
//             q2.enqueue(q1.dequeue());
//         }
//         while(!q2.isEmpty()){
//             q1.enqueue(q2.dequeue());
//         }
//     }
//     int pop(){
//        return (q1.dequeue());   
//     }
// }
// class lab4Ex6{
//     public static void main(String args[]){
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);

//         System.out.println("Removing " + s.pop());
//         System.out.println("Removing " + s.pop());
//         System.out.println("Removing " + s.pop());

//         s.push(2);
//         s.push(5);
//         System.out.println("Removing " + s.pop());
//     }
    
// }
