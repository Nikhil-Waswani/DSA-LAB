class lab8Ex1{
    String binary = "";
    String decimalToBinary(int num){
        if(num == 1){
            binary += (num % 2);
            return binary;
        }
        else{
            decimalToBinary(num / 2);
            binary += (num % 2);
            return binary;
        }
    }
    public static void main(String args[]){
        lab8Ex1 lab = new lab8Ex1();
        System.out.println(lab.decimalToBinary(13));
    }
    
}
