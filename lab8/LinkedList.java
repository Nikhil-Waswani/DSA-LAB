class Node {
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data= data;
    }
}
class LinkedList{
    Node head;
    
    void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void removeFront(){
        head = head.next;
        
    }

    void display(){
        if(head != null){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;                
            }
        }
    }
    public static void main(String[] args){
        LinkedList list  = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
      
        Node M = list.head.next.next;
        list.head.next.prev = M;
        M.next = list.head.next;

        


        // list.display();
    }
    
}
