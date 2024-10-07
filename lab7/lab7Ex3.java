import java.util.Scanner;
class lab7Ex3{
    void fibonacciSeriesHelper(int first, int sec, int times, int n){
        if(n > times){
            return;
        }
        else{
            System.out.print(first+sec + " ");
            fibonacciSeriesHelper(sec, first+sec, times, n+1);
        }
    }
    
    long fibonacciSeries(int times){

        long startRecursionTime = System.nanoTime();
        if(times == 1 ){
            System.out.println(0);
        }
        else if(times == 2){
            System.out.println(0 + " " + 1 + " ");
        }
        else if(times > 2){
            System.out.print(0 + " " + 1 + " ");
            fibonacciSeriesHelper(0,1,times-2,1);
        }
        long endRecursionTime = System.nanoTime();
        return endRecursionTime-startRecursionTime;
    }
    
    public static void main(String[] args) {
        lab7Ex3 ex3 = new lab7Ex3();
        Scanner inp = new Scanner(System.in);

        long recursionTime;
        long itreativeTime;

        System.out.println("Enter the number: ");
        int n = inp.nextInt();

        System.out.println("Printing Fibonacci Series with recursion: ");
        recursionTime = ex3.fibonacciSeries(n);

        System.out.println("\nPrinting Fibonacci Series with Iterative approach: ");
        long startitreativeTime = System.nanoTime();
        int first =0, sec =1;
        if(n == 1 ){
            System.out.println(0);
        }
        else if(n == 2){
            System.out.println(0 + " " + 1 + " ");
        }
        else if(n > 2){
            System.out.print(0 + " " + 1 + " ");

            for(int i=2; i<n; i++){
                System.out.print((first+sec) + " ");
                int temp = first;
                first = sec;
                sec = sec + temp;
            }

        }
        long endItreativeTime = System.nanoTime();
        itreativeTime = endItreativeTime-startitreativeTime;

        System.out.println();
        if(itreativeTime > recursionTime)
        System.out.println("Itreative approach is faster the recursion: ");
        else if(itreativeTime == recursionTime)
        System.out.println("Itreative approach and recursion is taking same time: ");
        else
        System.out.println("recursion approach is faster the itreative: ");
    }
    
}
