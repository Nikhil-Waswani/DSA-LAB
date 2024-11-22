class QueueNode{
    Node data;
    QueueNode next;

    QueueNode(Node data){
        this.data = data;
    }
} 

class Queue{
    QueueNode head;

    void enqueue(Node data){
        QueueNode newNode = new QueueNode(data);
        if(head == null){
            head = newNode;
        }else{
            QueueNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    Node dequeue(){
        Node temp = head.data;
        head = head.next;
        return temp;
    }
    
}
