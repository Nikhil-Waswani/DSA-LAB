// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//     }
// }

// class lab2Ex1{
//     Node head;
//     int length=0;

     
//     void addToBack(int data){
//         Node newNode = new Node(data);

//         if(head == null){
//             head = newNode;
//             length++;
           
//         }
//        else{
//         Node temp = head;
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = newNode;
//         length++;
       
//        }
//     }      
    
//     int length(){
//         int size =0;
//         if(head != null){
//             Node temp = head;
//             while(temp != null){
//                 size++;
//                 temp = temp.next;
//             }
//         }
//         return size;
//     }

//     void sreach(int data){
//        if(head != null){
//         Node temp = head;
//         while (temp != null){
//             if(temp.data == data)
//             {System.out.println("Data founded:");  
//             return;
//         }         
//             else{
//                 temp = temp.next;
//             }
//         }
//         System.out.println("Data not founded:");
//        }
//     }
    
//     void printList(){
//         if(head != null){
//             Node temp = head;
//             while(temp != null){
//                 System.out.print(temp.data+ " ");
//                 temp =temp.next;
//             }
//         }
//     }
//     public static void main(String args[]){
//         lab2Ex1 list = new lab2Ex1();
        
//         list.addToBack(1);
//         list.addToBack(2);
//         list.addToBack(4);
//         list.addToBack(5);
//         list.addToBack(6);

//         list.sreach(4);

//         list.printList();

//     }
// }