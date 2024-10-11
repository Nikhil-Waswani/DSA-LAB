class Node{
    int data;
    Node next;
     
    Node(int data){
        this.data = data;
    }
}

class Assignment1{
    Node head;
    int size=0;

    void addFront(Node newNode){
        newNode.next = head;
        head = newNode;
    }

    void addFront(int data){
        Node newNode = new Node(data);
        size++;
        newNode.next = head;
        head = newNode;
    }

    void addToBack(int data){
        Node newNode = new Node(data);
        size++;
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

    void DisplayList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    int nthFromLast(int index){
        if(head == null){
            System.out.println("LIST_EMPTY");
            return 0;
        }
        else{
            Node temp = head;
            for(int i=0; i<size - index; i++){
                temp = temp.next;
            }
            return temp.data;
        }

    }
   
    void reverse(){
             if(head != null){
                Node temp = head;
                 for(int i=0; i<size/2; i++){
                    Node tempLAst =head;
                     for(int j=1; j<size-i-2; j++){
                        tempLAst = tempLAst.next;
                    }
                    int tempData = temp.data;
                    temp.data = tempLAst.data;
                    tempLAst.data = tempData;
                    temp = temp.next;
                 }
             }
             else{
                System.out.println("LIST_EMPTY");
            }
        }

    void removeDuplicates(){ 
        if(head != null){
            Node point = head;
            
            while(point != null){
                Node dataCheck = point;
                while(dataCheck.next != null){
                    if(dataCheck.next.data == point.data){
                        dataCheck.next = dataCheck.next.next;
                    }
                    else{
                        dataCheck = dataCheck.next;
                    }
                }
                point = point.next;
            }

        }
        else{
            System.out.println("LIST_EMPTY");
        }
    }
    
    void sort(){
        if(head != null){
            Node temp = head;
         while(temp != null){
                Node curr = temp.next;
                Node mini = temp;
                while(curr != null){
                    if(curr.data < mini.data){
                        mini = curr;
                        curr = curr.next;
                    }
                    else{
                        curr = curr.next;
                    }
                }
                int val = mini.data;
                mini.data = temp.data;
                temp.data = val;
                temp = temp.next;
            }
        }
        else{
            System.out.println(" LIST_EMPTY");
        }
    }
      
    public static void main(String[] args){
        Assignment1 list = new Assignment1();

      list.addToBack(5);
        list.addToBack(4);
        list.addToBack(1);
        list.addToBack(2);
        list.addToBack(3);
        list.addFront(2);
        list.addFront(3);

        System.out.println("3rd element from end of the list: " + list.nthFromLast(3));
        
        System.out.println("\nbefore Sorting");
        list.DisplayList();
        System.out.println("\nAfter sorting ");
        list.sort();
        list.DisplayList();

        System.out.println("\n\nAfter removing duplicates: ");
        list.removeDuplicates();
        list.DisplayList();

        System.out.println("\n\nAfter reversing the current list: ");
        list.reverse();
        list.DisplayList();


    }
}