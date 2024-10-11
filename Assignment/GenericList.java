class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}

class GenericList<T>{
    Node<T> head;

    void addToBack(T data){
        Node<T> newNode = new Node<>(data);

        if(head == null){
            head = newNode;
        }
        else{
            Node<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    void addToFront(T data){
        Node<T> newNode = new Node<>(data); 
        newNode.next = head;
        head = newNode;
    }

    void display(){
        if(head != null){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    void removeFirst(){
        if(head != null){
            head = head.next;
        }
        else{
            System.out.println("LIST_EMPTY");
        }
    }

    void removeLast(){
        if(head != null){
            Node<T> temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = temp.next.next;

        }
        else{
            System.out.println("LIST_EMPTY");
        }
    }
    public static void main(String args[]){

        GenericList<String> list = new GenericList<>();

        list.addToBack("Nikhil");
        list.addToBack("Imtiaz");
        list.addToBack("Zeeshan");
        list.addToFront("Munsif");

        list.removeLast();
        list.removeLast();

       list.display();

    }
}

 