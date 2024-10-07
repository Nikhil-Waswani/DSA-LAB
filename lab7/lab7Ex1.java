import java.util.Scanner;
class lab7Ex1{
    void assendingNumbers(int n){
        if(n <= 0){
            return;
        }
        else{
            assendingNumbers(n-1);
            System.out.print(n + " ");
        }
    }

    void decendingNumber(int n){
        if(n <= 0){
            return;
        }
        else{
            System.out.print(n + " ");
            assendingNumbers(n-1);
        }
    }

    void assendingCharacters(char ch){
        if(ch > 'z'){
            return;
        }
        else{
            System.out.print(ch + " ");
            assendingCharacters((char)(ch + 1));
        }
    }

    void decendingCharacters(char ch){
        if(ch > 'z'){
            return;
        }
        else{
            decendingCharacters((char)(ch + 1));
            System.out.print(ch + " ");
        }
    }

    public static void main(String[] args) {
        lab7Ex1 ex1 = new lab7Ex1(); 
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int n = inp.nextInt();  

        ex1.assendingNumbers(n);
        System.out.println();
        ex1.assendingNumbers(n);
        System.out.println();
        ex1.assendingCharacters('a');
        System.out.println();
        ex1.decendingCharacters('a');
    }
}