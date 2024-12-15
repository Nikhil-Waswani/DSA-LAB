class PeriorityQueue {
    Node head;
    class Node{

        Graph.Pair data;
        Node next;

        Node(Graph.Pair data){
            this.data = data;
        }
    }
    void enqueue(Graph.Pair data){
        if(head == null){
            head = new Node(data);
        }else{
            Node newNode = new Node(data);
            if(data.weight < head.data.weight){
                newNode.next = head;
                head = newNode;                
            }else{
                Node temp = head;
                while(temp.next != null && data.weight > temp.next.data.weight){
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    Graph.Pair dequeue(){
        Graph.Pair temp = head.data;
        head = head.next;
        return temp;
    }

    void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
   
    
}
