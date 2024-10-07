
interface List{
     boolean isEmpty();
     int size();
     void add(int data);
     void add(int index, LinkedList.Node newNode);
     void remove(int index);
     void remove(LinkedList.Node node);
     LinkedList duplicate();
     LinkedList duplicateReversed();
    }

class LinkedList implements List{
    Node head;
    int size;
    
    LinkedList(){
        size = 0;
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public boolean isEmpty(){// checked working Good
        if(head == null){
            return true;
        }
        return false;
    }

     public void add(int data){// checked working Good
        size++;
        Node newNode = new Node(data);
        if(head == null){
           head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public void add(int index, Node newNode ){//checked working Good
            if(index == 1){
                newNode.next = head;
                head = newNode;
            }
            else{
                Node temp = head;
                for(int i=1; i<index-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

}
    
    public void remove(int index){// checked working Good
       if(index == 1 && head != null){
        head = head.next;
       }else{
        Node temp = head;
        for(int i=1; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;}}
    
    public LinkedList duplicate(){// checked working Good
        LinkedList dupList = new LinkedList();
        Node temp = head;
        while(temp != null){
            Node newNode = new Node(temp.data);
            if(dupList.head == null){
                dupList.head = newNode;
                temp = temp.next;
            }else{
                Node dupTemp = dupList.head;
                while(dupTemp.next != null){
                    dupTemp = dupTemp.next;}
                dupTemp.next = newNode;
                temp = temp.next;}}
        return dupList;}
    
     public LinkedList duplicateReversed(){// checked working Good
        LinkedList dupReverse = new LinkedList();
        for(int i=0; i<=size; i++){
            Node temp = head;
            for(int j=i; j<size; j++){
                temp = temp.next;}
            Node newNode = new Node(temp.data);
            if(dupReverse.head == null){
                dupReverse.head = newNode; 
            }else{
                Node dupTemp = dupReverse.head;
                while(dupTemp.next != null){
                    dupTemp = dupTemp.next;}
                dupTemp.next = newNode;}}
        return dupReverse;}
    
    public String toString() {
        System.out.println("Size : " + size() );
        System.out.print(" - ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " , ");
            temp = temp.next;}
        return "";}

    public void remove(Node node){// checked working Good
        Node temp = head;
        Node preTemp = null;
        while(temp != null){
            if(node.data == temp.data){
                preTemp.next = temp.next;
                break;
            }else{
                preTemp = temp;
                temp = temp.next;}}}

    public int size()// checked working Good
     {int size =0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;}
    }