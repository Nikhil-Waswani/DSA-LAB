import java.util.Scanner;
class lab7Ex4{
    int factorailHelper(int n, int start){
        if(start > n){
            return 1;
        }
        else{
             return start * factorailHelper(n, start+1);
        }
    }
    long factorial(int n){
        long statTime = System.nanoTime();
        int fact = 1;
        
        if(fact > 0 ){
            fact = factorailHelper(n, 1);
        }
        System.out.println(n + "! is equals to " + fact);
        long endTime = System.nanoTime();
        return endTime-statTime;
    }

    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        lab7Ex4 ex4 = new lab7Ex4();

        System.out.println("Enter the number: ");
        int n = inp.nextInt();
        
        System.out.println("Finding factorial with recursion: ");
        long recursionTime = ex4.factorial(n);

        System.out.println("Finding factorial with itreative approach: ");
        long startTime = System.nanoTime();
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(n + "! is equals to " + fact);
        long endTime = System.nanoTime();
        long itreativeTime = endTime-startTime;

        if(itreativeTime > recursionTime)
        System.out.println("Itreative approach is faster the recursion: ");
        else if(itreativeTime == recursionTime)
        System.out.println("Itreative approach and recursion is taking same time: ");
        else
        System.out.println("\nrecursion approach is faster the itreative: ");
    }
}
