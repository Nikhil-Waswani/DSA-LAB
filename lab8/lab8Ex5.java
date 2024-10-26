class lab8Ex5 {
    static Node mergeSort(LinkedList list1, LinkedList list2){
        LinkedList mergedList = new LinkedList();

        while((list1.head != null) && (list2.head != null)){
            if(list1.head.data <= list2.head.data){
                mergedList.add(list1.head.data);
                list1.removeFront();
            }
            else{
                mergedList.add(list2.head.data);
                list2.removeFront();
            }
        }

        while(list1.head != null){
            mergedList.add(list1.head.data);
                list1.removeFront();}

        while(list2.head != null){
            mergedList.add(list2.head.data);
                list2.removeFront();}

        return mergedList.head;        
    }
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList mergedList = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        mergedList.head = mergeSort(list1, list2); 
        mergedList.display();
    }    
}
