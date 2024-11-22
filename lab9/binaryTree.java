// class Node{
//     int data;

//     Node left;
//     Node right;
//     Node(int data){
//         this.data = data;
//     }
// }

// class binaryTree{
//     Node root;
    
    void breathFirst(Node root){
        if(root != null){
            Queue queue = new Queue();
            queue.enqueue(root);
            
            while(queue.head != null){
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

//     void completeTree(int data, Node root){
//         Node newNode = new Node(data);
//         if(root == null){
//             this.root=newNode;
//         }else{
//             Queue queue = new Queue();
//             queue.enqueue(root);
//             while(queue.head != null){
//                 Node temp = queue.dequeue();
//                 if(temp.left != null){
//                     queue.enqueue(temp.left);
//                 }
//                 else{
//                     temp.left = newNode;
//                     break;
//                 }
//                 if(temp.right != null){
//                     queue.enqueue(temp.right);
//                 }
//                 else{
//                     temp.right = newNode;
//                     break;
//                 }
//             }
//         }
//     }

//     binaryTree(int key){
//         root = new Node(key);
//     }
    
//     binaryTree(){
//         root = null;
//     }

//     void addNode(int data, Node root){
//         if(root == null){
//             this.root = new Node(data);
//         }else{
//             if(data<root.data){
//                 if(root.left == null){
//                     root.left = new Node(data);
                    
//                 }else{
//                     addNode(data, root.left);
//                 }
//             }
//             else{
//                 if(root.right == null){
//                     root.right = new Node(data);
                    
//                 }else{
//                     addNode(data, root.right);
//                 }
//             }  
//         }
//     } 
    
    void display(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            display(root.left);
        display(root.right);
        }
    }

//     boolean searchNode(int data) {
//         return helper(data,false, this.root);
        
//     }
    
//     boolean helper(int data, boolean bool, Node root){
//         if(root != null){
//             bool = helper(data, bool, root.left);
//             bool = helper(data,bool, root.right);
//             if(root.data == data){
//                 bool = true;
//             }
//         }
//         return bool;
//     }

//     int count =0;
    
//     int countOfNodes(Node root){
//         if(root != null){
//             count++;
//             count = countOfNodes(root.left);
//             count = countOfNodes(root.right);
//         }
//         return count;
//     }

//     int leftheight(Node root){
//         int leftSize=0;
//         int rightSize=0;
//         if(root == null){
//             return 0;
//         }
//         else if(root  == this.root){
//             leftSize = leftheight(root.left);
//         }
//         else{
//             leftSize = leftheight(root.left);
//             rightSize = leftheight(root.right);
//         }
//         return (leftSize>rightSize)? (leftSize+1) :  (rightSize+1);
//     }

//     int rightheight(Node root){
//         int leftSize=0;
//         int rightSize=0;
//         if(root == null){
//             return 0;
//         }
//         else if(root  == this.root){
//             leftSize = rightheight(root.right);
//         }
//         else{
//             leftSize = rightheight(root.left);
//             rightSize = rightheight(root.right);
//         }
//         return (leftSize>rightSize)? (leftSize+1) :  (rightSize+1);

//     }

//     int height(Node root) {
//         return (leftheight(root) > rightheight(root)) ? leftheight(root) : rightheight(root); 
//     }

//     int minNumHelper(Node root, int mini){
//         if(root != null){
//             mini = minNumHelper(root.left, mini);
//             mini = minNumHelper(root.right, mini);
//             if(mini > root.data){
//                 mini = root.data;
//             }   
//         }
//         return mini;
//     }

//     int minNumber(){
//         return minNumHelper(this.root, root.data);
//     }

//     int maxNumHelper(Node root, int mini){
//         if(root != null){
//             mini = maxNumHelper(root.left, mini);
//             mini = maxNumHelper(root.right, mini);
//             if(mini < root.data){
//                 mini = root.data;
//             }   
//         }
//         return mini;
//     }

//     int maxNumber(){
//         return maxNumHelper(this.root, root.data);
//     }

//     boolean balanceTree(Node root){
//         if((leftheight(root) - rightheight(root) == -1 ) || (leftheight(root) - rightheight(root) == 0) || (leftheight(root) - rightheight(root) == 1)){
//             return true;
//         }else{
//             return false;
//         }
//     }

//     boolean isSubTree(Node x, Node y){
//         boolean left = false;
//         boolean right = false;
//         if(x == null){
//             return false;
//         }

//         else if(x != null){
//             if(x.data == y.data){
//                 return isIdentical(x, y);
//             }
//             left = isSubTree(x.left, y);
//             right = isSubTree(x.right, y);
//         }
//         return (left == true)?left:right;
//     }
    
//     boolean isIdentical(Node x, Node y){
//         boolean leftcheck = true;
//         boolean rightcheck = true;

//         if((x == null && y != null ) || (x != null && y == null)){ 
//             return false;
//         }
//         if(x != null & y != null){
//             if(x.data != y.data){
//                 return false;
//             }
//             leftcheck = isIdentical(x.left, y.left);
//             rightcheck = isIdentical(x.right, y.right);
//         }
//        return (leftcheck == false)? leftcheck : rightcheck;
//     }
//     public static void main(String args[]){

//         binaryTree tree = new binaryTree();
//         binaryHeap heap = new binaryHeap();


//         tree.completeTree(1,tree.root);
//         tree.completeTree(2,tree.root);
//         tree.completeTree(3,tree.root);
//         tree.completeTree(4,tree.root);
//         tree.completeTree(5,tree.root);
//         tree.completeTree(6,tree.root);
//         tree.completeTree(7,tree.root);

//         tree.breathFirst(tree.root);
//         heap.display(tree.root);
       
//     }
// }
