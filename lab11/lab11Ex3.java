class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

class Complete{
    Node root;

    void addNode(int data){
        if(root == null){
            root = new Node(data);
        }
        else{
            Queue queue = new Queue();
            queue.enqueue(root);
            while(queue.head != null){
                Node temp = queue.dequeue();
                if(temp.left == null){
                    temp.left = new Node(data);
                    if(temp.data < temp.left.data){
                        shiftUp();
                    }
                    break;
                }else{
                    queue.enqueue(temp.left);
                }
                
                if(temp.right == null){
                    temp.right = new Node(data);
                    shiftUp();

                    break;
                }else{
                    queue.enqueue(temp.right);
                }
            }
        }
    }

    void display(){
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

    void shiftUp(){
        if(root != null){
            boolean check;
            do{
                check = true;
                Queue queue = new Queue();
            queue.enqueue(root);
            while(queue.head != null){
                Node temp = queue.dequeue();
                if(temp.left != null){
                    if(temp.data < temp.left.data){
                        int parent = temp.data;
                        temp.data = temp.left.data;
                        temp.left.data = parent;
                        check = false;
                        break;
                    }else{
                        queue.enqueue(temp.left);   
                    }
                }
                if(temp.right != null){
                    if(temp.data < temp.right.data){
                        int parent = temp.data;
                        temp.data = temp.right.data;
                        temp.right.data = parent;
                        check = false;

                        break;
                    }else{
                        queue.enqueue(temp.right);
                    }
                }
            }
        }while(check == false);
            }
    }

    void shiftDown(Node root){
        while((root.left != null && root.right != null) && (root.left.data > root.data || root.right.data > root.data)){
            if(root.left.data > root.right.data){
                int temp = root.data;
                root.data = root.left.data;
                root.left.data = temp;
                root = root.left;
            }else{
                int temp = root.data;
                root.data = root.right.data;
                root.right.data = temp;
                root = root.right;

            }
        }

        if(root.left != null && root.left.data > root.data){
            int temp = root.data;
            root.data = root.left.data;
            root.left.data = temp;
        }

        if(root.right != null && root.right.data > root.data){
            int temp = root.data;
            root.data = root.right.data;
            root.right.data = temp;
        }
        
    }

    int getMax(){
        return root.data;
    }

    int extractMax(){
        if(root != null){
            int max = root.data;
            Queue queue = new Queue();
            queue.enqueue(root);
            Node previousNode = root;
            while(queue.head != null){
                Node temp = queue.dequeue();

                if(temp.left == null){  
                    root.data = previousNode.right.data;
                    previousNode.right = null;
                    break;

                }else{
                    queue.enqueue(temp.left);
                }
                
                if(temp.right == null){
                    root.data = temp.left.data;
                    temp.left = null;
                    break;
                }else{
                    queue.enqueue(temp.right);
                }
                previousNode = temp;
            }

            shiftDown(root);
            return max;
        }
        return 0;
    }

    void changePriority(int data, int change){
        if(root != null){
            Queue queue = new Queue();
            Node temp = root;
            queue.enqueue(root);
            while(queue.head != null){
                temp = queue.dequeue();
                if(temp.data == data){
                    temp.data = change;

                    if((temp.left != null && temp.left.data > temp.data) || (temp.right != null && temp.right.data > temp.data)){
                        shiftDown(temp);
                    }
                    else{
                        shiftUp();
                    }
                    break;
                }
                else{
                    if(temp.left != null){
                        queue.enqueue(temp.left);
                    }

                    if(temp.right != null){
                        queue.enqueue(temp.right);
                    }
                }
            }
        }

    }

    void remove(int data){

        changePriority(data, Integer.MAX_VALUE);
        extractMax();

    }
}

class lab11Ex3{
    public static void main(String args[]){
        Complete binaryHeap  = new Complete();
        binaryHeap.addNode(42);
        binaryHeap.addNode(29);
        binaryHeap.addNode(18);
        binaryHeap.addNode(14);
        binaryHeap.addNode(17);
        binaryHeap.addNode(11);
        binaryHeap.addNode(18);
        binaryHeap.addNode(11);
        binaryHeap.addNode(3);
        binaryHeap.addNode(32);

        System.out.print("Original priority queue : ");
        binaryHeap.display();


        System.out.println("\nMaximum data: " + binaryHeap.getMax());
        binaryHeap.extractMax();
        System.out.print("After Extracting max data: ");
        binaryHeap.display();

        binaryHeap.changePriority(29,9);
        System.out.println("\nNow After changing priority of \'29\' with \'9\'");
        binaryHeap.display();


        binaryHeap.remove(18);
        System.out.println("\n Removing \'18\'");
        binaryHeap.display();
    }
    
}
