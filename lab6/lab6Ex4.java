class lab6Ex4{
    void TwoSum(int arr[], int k){
        lab6Ex3 ex3 = new lab6Ex3();
        // ex3.bubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            int left =  i+1;
        int right = arr.length-1;
            while(left<=right){
                int mid = (left + right)/2;
                if(arr[i] + arr[mid]  == k ){
                    System.out.println("yes ( " + arr[i] + " + " + arr[mid] + " is " + k + " )");
                    return;
                }
                else if(arr[i] + arr[mid] < k){
                    left = mid + 1; 
                }

                else if(arr[i] + arr[mid] > k){
                    right = mid -1;
                }
            }
        }

        System.out.println("No there isn't any two numbers that's sum equals to " + k);
    }
    public static void main(String args[]){
        lab6Ex4 ex4 = new lab6Ex4();
        int arr[] = {1,6,8,4};

        ex4.TwoSum(arr, 10);
    }
    
}
