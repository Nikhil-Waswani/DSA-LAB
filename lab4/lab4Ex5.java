class Queue {
    private Stack s1, s2; 
 
    Queue(){
        s1 = new Stack();
        s2 = new Stack();
    } 
 
    void enqueue(int data){
        s1.push(data);
    } 
 
   int dequeue(){
    while(!s1.isEmpty()){
        s2.push(s1.pop());
    }

    int temp = s2.pop();
    
    while(!s2.isEmpty()){
        s1.push(s2.pop());
    }
    return temp;
   }
}
 
class lab4Ex5{
    public static void main(String args[]){
        
        Queue q = new Queue();
        int[] keys = { 1, 2, 3, 4, 5 };
       
        // insert above keys
        for (int key : keys) {
        q.enqueue(key);
        }
        System.out.println(q.dequeue());
        System.out.println(q.dequeue()); 
    }
}
