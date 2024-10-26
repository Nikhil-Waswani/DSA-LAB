class lab8Ex4{
    int pointer;
    
    void greedy(int[][] arr, int row, int col){
        pointer = arr[row][col];

        if((row == arr.length-1) && (col == arr[row].length-1)){
            return;

        }else{
        System.out.println(pointer + " ");
            
            int maxR = row+1;
            int maxC = col;

            try{if(arr[maxR][maxC] < arr[row][col+1]){
                maxR = row;
                maxC = col+1;
            }}catch(Exception e){}
            
            
            try{if(arr[maxR][maxC] < arr[row+1][col+1]){
                maxR = row+1;
                maxC = col+1;
            }}catch(Exception e){}

            greedy(arr,maxR,maxC);
        }
    }
    
    public static void main(String args[]){
        lab8Ex4 lab = new lab8Ex4();
       
        int arr[][] = {{0,-1,-1,1,1,1,0},{-1,2,5,4,10,3,-1},{3,2,-1,-1,0,3,8},{7,-1,10,2,-1,-1,17},{4,3,9,-1,-1,8,33},{17,-1,-1,1,0,44,100}};

        lab.greedy(arr,0,0);
        System.out.println(lab.pointer);
    }    
}
