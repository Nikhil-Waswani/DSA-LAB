import java.util.Scanner;
class lab7Ex6{
    int iterativeSearch(int arr[], int num){
        int found = 0;
        for(int i : arr){
            if(i == num){
                found = 1;
                return found;
            }
        }
        return found;
    }
    
    int recursionSearchHelper(int index, int arr[], int num){
        if(index == arr.length){
            return 0;
        }
        else{
            if(arr[index] == num){
                return 1;
            }
            else{
                return recursionSearchHelper(index+1, arr, num);
            }   
        }
    }

    int recursionSearch(int arr[], int num){
        return recursionSearchHelper(0, arr, num);
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        lab7Ex6 ex6 = new lab7Ex6();

        int arr[] = {1,11,6,4,3,15,13,7,0};

        System.out.print("Enter the number To sreach : ");
        int num = inp. nextInt();

        System.out.println("Iterative Search:");
        long iterativeStart = System.nanoTime();
        System.out.println("found : " + ex6.iterativeSearch(arr, num));
        long iterativeEnd = System.nanoTime();

        System.out.println("\nRecursion Search:");
        long recursionStart = System.nanoTime();
        System.out.println("found : " + ex6.recursionSearch(arr, num));
        long recursionEnd = System.nanoTime();

        if((iterativeEnd-iterativeStart) > (recursionEnd-recursionStart))
        System.out.println("Itreative approach is faster the recursion: ");
        else if((iterativeEnd-iterativeStart) == (recursionEnd-recursionStart))
        System.out.println("Itreative approach and recursion is taking same time: ");
        else
        System.out.println("recursion approach is faster the itreative: ");        
    }
    
}
