class PriorityQueueUsingArray {
    int queue[];
    int size=0;
    
    PriorityQueueUsingArray() {
        queue = new int[5];
    }
    
    void insert(int data) {
        if(size < 5){
            if(size == 0){
                queue[size++] = data;
            }else{
                for(int i=size-1; i>=0; i--){
                    if(data >= queue[i]){
                        queue[i+1] = data;
                        size++;
                        return;
                    }
                    queue[i+1] = queue[i];
                }

                queue[0] = data;
                size++;
            }
        }else{
            System.out.println("Queue is full");
        }
    }
    
    int extractMax() {
        int temp = queue[size-1];
        queue[size-1]=0;
        size--;
        return temp;
    }
    
    int getMax() {
        return queue[size-1];
    }
    
    boolean searchData(int data) {
        for(int i=0;i<size; i++){
            if(data == queue[i]){
                return true;
            }
        }
        return false;
    }
   }
class lab11Ex1{
    public static void main(String args[]){
        PriorityQueueUsingArray lab = new PriorityQueueUsingArray();
        lab.insert(7);
        lab.insert(5);
        lab.insert(1);
        lab.insert(2);
        lab.insert(9);

        System.out.println("using of extractMax method: " + lab.extractMax());
        System.out.println("After this \'9\' is removed!");
        System.out.println("using of getMax method: " + lab.getMax());
        System.out.println("Does 1 is present in queur: " + lab.searchData(1));
        
    } 
}