class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

class binaryHeap {
    Node root;

    void addNode(int data){
        Node newNode = new Node(data);
        
        if(this.root == null){
            this.root = new Node(data);

        }
        else{
            Queue queue = new Queue();
            queue.enqueue(this.root);

            while(queue.head != null){
                Node temp = queue.dequeue();
                if(temp.left != null){
                    queue.enqueue(temp.left);
                }else{
                    temp.left = newNode;
                    System.out.println("added");
                    break;
                }
                if(temp.right != null){

                    queue.enqueue(temp.right);
                }else{
                    temp.right = newNode;

                    break;
                }
            }
            
           
        }
    }
    
    void display(Node root){
        if(root != null){
            Queue queue = new Queue();
            queue.enqueue(root);
            while (queue.head != null) {
                Node temp = queue.dequeue();
                System.out.print(temp.data + " ");

                if(temp.left != null){
                    queue.enqueue(temp.left);
                }

                if(temp.right != null){
                    queue.enqueue(temp.right);
                }
            }
        }
    }

    public static void main(String args[]){
        binaryHeap heap = new binaryHeap();
        binaryTree tree = new binaryTree();

        heap.addNode(1);
        heap.addNode(2);
        heap.addNode(3);
        heap.addNode(4);
        heap.addNode(5);
        heap.addNode(6);

        heap.display(heap.root);
        // tree.breathFirst(heap.root);
        
    }
    
}
