class lab6Ex1{
    int[] selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int mini = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[mini] > arr[j])
                    mini = j;
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;}
        return arr;}

    int[] insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;}
            arr[j+1] = key;}
        return arr;} 
    public static void main(String args[]){
        lab6Ex1 ex1 = new lab6Ex1();
        
        System.out.println("Selection Sorting");
        int arr1[] = {9,7,3,8,0,5};
        ex1.selectionSort(arr1);
        for(int i : arr1){
            System.out.print(i + " ");
        }
        
        System.out.println("\nInsertion Sorting");
        int arr2[] = {1,4,2,5,3};
        ex1.insertionSort(arr2);
        for(int i : arr2){
            System.out.print(i + " ");
        }}}