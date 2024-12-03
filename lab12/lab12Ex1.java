class dynamicArray {
    int[] arr;
    int size;

    dynamicArray(){
        arr = new int[1];
        size = 0;

    }
    
    void grow(){
        int temp[] = new int[arr.length];
        for(int i=0; i<temp.length; i++){
            temp[i] = arr[i];
        }
       
        arr = new int[arr.length*2];
       
        for(int i=0; i<temp.length; i++){
            arr[i] = temp[i];
        }
    }

    void add(int data){
        if(size == arr.length){
            grow();

        }
        arr[size++] = data;

    }

    void insert(int index, int data){
        if(size==arr.length){
            grow();
        }
        for(int i = size-1; i>=index; i--){
            arr[i+1] = arr[i];
            
        }
        arr[index] = data;
        size++;

    }
    
    void delete(int index){
        for(int i=index; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean contains(int value){
        for(int i=0; i<size; i++){
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }

    void set(int index, int value){
        arr[index] = value;
    }

    int get(int index){
        if(size > index){
            return arr[index];
        }
        return 0;
    }

    void display(){
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }    
}

class lab12Ex1{
    public static void main(String[] args) {
        dynamicArray dyArray = new dynamicArray();
    
        dyArray.add(1);
        dyArray.add(2);
        dyArray.add(3);
        dyArray.add(4);
        dyArray.add(5);
    
        dyArray.delete(4);
        System.out.println("Does \'4\' exist: " + dyArray.contains(4));
        System.out.println("Does \'5\' exist: " + dyArray.contains(5));
    
        dyArray.set(2, 5);
        dyArray.insert(2, 5);
    
        dyArray.display();   
            
        }
}