class PriorityQueueUsingArray{
    int queue[] = new int[15];
    int size=0;

    void insert(int data){
        if(size < queue.length){
            queue[size++] = data;

            swiftUp(size-1);

        }

    }

    void swiftUp(int curr){
        while(curr > 0){
            int parent = (curr-1)/2; 
            if(queue[curr] > queue[parent]){
                int temp = queue[curr];
                queue[curr] = queue[parent];
                queue[parent] = temp;
                curr = parent;
            }
            else{
                break;
            }
        }
    }
    
    void display(){
        for(int i=0; i<size; i++){
            System.out.print(queue[i] + " ");
        }

    }
   
   int getMax(){
    if(size > 0){
        return queue[0];
    }
    return 0;
   }
   
   int extractMax(){
    if(size > 0){
        int max = queue[0];
        queue[0] = queue[size-1];
        size--;
        swiftDown(0);
        return max;
    }
    return 0;
   }

   void swiftDown(int i){
    int left = 2*i + 1;
    int right = 2*i + 2;

    while((left < size && right < size) && (queue[left] > queue[i] || queue[right] > queue[i])){
        if(queue[left] > queue[right]){
            int temp = queue[left];
            queue[left] = queue[i];
            queue[i] = temp;
            i = left;
        }
        else{
            int temp = queue[right];
            queue[right] = queue[i];
            queue[i] = temp;
            i = right;
        }

        left = 2*i + 1;
        right = 2*i + 2;
    
    }

    if(left < size){
        if(queue[left] > queue[i]){
            int temp = queue[left];
            queue[left] = queue[i];
            queue[i] = temp;
        }
    }

    if(right < size){
        if(queue[right] > queue[i]){
            int temp = queue[right];
            queue[right] = queue[i];
            queue[i] = temp;
        }
    }

}

void changePriority(int index, int change){
    queue[index] = change;
    if(queue[index] > queue[(index-1)/2]){
        swiftUp(index);
    }
    else if(queue[index] < queue[(2*index)-1] || queue[index] < queue[(2*index)-2]){
        swiftDown(index);
    }
}

void remove(int index){
    if(index < size){
        changePriority(index, Integer.MAX_VALUE);
        extractMax();
}
}


    public static void main(String args[]){
        PriorityQueueUsingArray binaryHeap  = new PriorityQueueUsingArray();
        binaryHeap.insert(42);
        binaryHeap.insert(29);
        binaryHeap.insert(18);
        binaryHeap.insert(14);
        binaryHeap.insert(17);
        binaryHeap.insert(11);
        binaryHeap.insert(18);
        binaryHeap.insert(11);
        binaryHeap.insert(3);
        binaryHeap.insert(32);

        System.out.print("Original priority queue : ");
        binaryHeap.display();


        System.out.println("\nMaximum data: " + binaryHeap.getMax());
        binaryHeap.extractMax();
        System.out.print("After Extracting max data: ");
        binaryHeap.display();

        binaryHeap.changePriority(1,9);
        System.out.println("\nNow After changing priority of \'29\' with \'9\'");
        binaryHeap.display();


        binaryHeap.remove(2);
        System.out.println("\n Removing \'18\'");
        binaryHeap.display();
    }
    
}