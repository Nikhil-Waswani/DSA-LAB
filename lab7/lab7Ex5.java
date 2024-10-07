class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
class linkedlist{
    Node head;
    void addToBack(int data){
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

    long itreativeDisplay(){
        long startTime = System.nanoTime();

        if(head != null){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        else{
            System.out.println("Linked list is empty: ");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;}

    long recursionDisplay(){
        long startTime = System.nanoTime();
        
        if(head == null){
            System.out.println("Linked List is empty: ");
        }
        else{
            recursionDisplayHelper(head);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;} 
    void recursionDisplayHelper(Node head){
        if(head == null){
            return;
        }
        else{
            System.out.print(head.data + " ");
            recursionDisplayHelper(head.next);
        }}}
class lab7Ex5{
    public static void main(String[] args){
        linkedlist list = new linkedlist(); 
        list.addToBack(1);
        list.addToBack(2);
        list.addToBack(3);
        list.addToBack(4);
        list.addToBack(5);

        System.out.println("Display data with iterative approach: ");
        long iterativeTime = list.itreativeDisplay(); 
        System.out.println("\nDisplay data with recursion: ");
        long recursionTime = list.recursionDisplay();
        System.out.println("\n");
        if( iterativeTime > recursionTime)
        System.out.println("Itreative approach is faster the recursion: ");
        else if( iterativeTime == recursionTime)
        System.out.println("Itreative approach and recursion is taking same time: ");
        else
        System.out.println("recursion approach is faster the itreative: ");}}
