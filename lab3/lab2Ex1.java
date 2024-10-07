class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class lab2Ex1{
    
    int size =0;
    Node addNote(int data, Node node){
        Node newNode = new Node(data);
        size ++;
        if(node == null){
            node = newNode;
        }
        else{
            Node temp = node;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return node;
    }
    
     Node addToFront(int data, Node head){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    void createCycle(Node head){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head.next;
    }

    void printList(Node head){
       if(head != null){ Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }}
    
    void checkCycle(Node head){
        Node temp = head;
        int check =0;
        while(temp != null){
            temp = temp.next;
            check++;
            if(check> size){
                System.out.println("Cycle Founded in the list");
                break;
            }
        }
        if(check <= size)
        { System.out.println("Cycle not founded");}
    }
   
    Node DupReverse(Node head){
        Node dupHead = null;
        Node temp = head;
        while(temp != null){
            dupHead = addToFront(temp.data, dupHead);
            temp = temp.next;
        }
        return dupHead;
    }

    Node Dup(Node head){
        Node dupHead = null;
        Node temp = head;
        while(temp != null){
            dupHead = addNote(temp.data, dupHead);
            temp = temp.next;
        }
        return dupHead;

    }

    
    public static void main(String args[]){
        lab2Ex1 list = new lab2Ex1();
        Node head=null;

        head = list.addNote(1, head);
        head = list.addNote(2, head);
        head = list.addNote(3, head);

        Node dupr = list.Dup(head);

       list.printList(dupr);
    }
}