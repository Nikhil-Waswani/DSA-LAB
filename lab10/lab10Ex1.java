
// class lab10Ex1 {
//     void preorderTraversal(Node root){
//         if(root != null){
//             System.out.print(root.data + " ");
//             preorderTraversal(root.left);
//             preorderTraversal(root.right);
//         }
//     }

//     void inorderTraversal(Node root){
//         if(root != null){
//             inorderTraversal(root.left);
//             System.out.print(root.data + " ");
//             inorderTraversal(root.right);

//         }
//     }

//     void postorderTraversal(Node root){
//         if(root != null){
//             postorderTraversal(root.left);
//             postorderTraversal(root.right);
//             System.out.print(root.data + " ");
//         }
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

//     boolean isfull(Node root){
//         Queue queue = new Queue();
//         boolean flag =true;
//         int level = 0;
//         if(root != null){
//             queue.enqueue(root);
//             while(queue.head != null){
//                 int size =0;
//                 Queue q = new Queue();
//                 while(queue.head != null){
//                     size++;
//                     q.enqueue(queue.dequeue());
//                 }
//                 while(q.head != null){
//                     queue.enqueue(q.dequeue());
//                 }

//                 if(size != 0 && size != Math.pow(2,level)){
//                     return false;
//                 }

//                 for(int i=1; i<=Math.pow(2,level); i++){
//                     Node temp = queue.dequeue();

//                     if(temp.left != null){
//                         queue.enqueue(temp.left);
//                     }
//                     if(temp.right != null){
//                         queue.enqueue(temp.right);
//                     }
//                 }
//                 level++;
//             }
//         }
//         return flag;
        
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
//     public static void main(String arg[]){
//         binaryTree x = new binaryTree();
//         binaryTree sec = new binaryTree();
        
//         x.completeTree(1,x.root);
//         x.completeTree(2,x.root);
//         x.completeTree(3,x.root);
//         x.completeTree(4,x.root);
//         x.completeTree(5,x.root);
//         x.completeTree(6,x.root);
//         x.completeTree(7,x.root);

//         sec.completeTree(3,sec.root);
//         sec.completeTree(6,sec.root);
//         sec.completeTree(7,sec.root);

//         System.out.println("tree: ");
//         x.display(x.root);
//         System.out.println("\ntree: ");
//         sec.display(sec.root);

//         System.out.println("\nIs anyone subtree of other: " + x.isSubTree(x.root,sec.root));

//     }
    
// }this is my sey