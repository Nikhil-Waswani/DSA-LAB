import java.util.Scanner;
class temp{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // int i = inp.nextInt();
        String s = inp.nextLine();
        String s2 = inp.nextLine();

        System.out.println("from here:");
        // System.out.println(i);
        System.out.println(s);
        System.out.println(s2);

    }
}
// int minNumHelper(Node root, int mini){
    //     if(root != null){
    //         mini = minNumHelper(root.left, mini);
    //         mini = minNumHelper(root.right, mini);
    //         if(mini > root.data){
    //             mini = root.data;
    //         }   
    //     }
    //     return mini;
    // }

    // int minNumber(){
    //     return minNumHelper(this.root, root.data);
    // }

    // int maxNumHelper(Node root, int mini){
    //     if(root != null){
    //         mini = maxNumHelper(root.left, mini);
    //         mini = maxNumHelper(root.right, mini);
    //         if(mini < root.data){
    //             mini = root.data;
    //         }   
    //     }
    //     return mini;
    // }

    // int maxNumber(){
    //     return maxNumHelper(this.root, root.data);
    // }
    



    // boolean balanceTree(Node root){
    //     if((leftheight(root) - rightheight(root) == -1 ) || (leftheight(root) - rightheight(root) == 0) || (leftheight(root) - rightheight(root) == 1)){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }
