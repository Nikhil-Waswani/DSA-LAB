class lab8Ex2 {
    String plaindromeHelper(String str, String palindromeString, int index){
        if(index == str.length())
        {
            return "";
        }
        else{
            palindromeString= plaindromeHelper(str, palindromeString, index+1);
            return palindromeString += str.charAt(index);
        }
        
    }
    boolean palindrome(String str){
        String plaindromeString = "";
        plaindromeString = plaindromeHelper(str, plaindromeString, 0);
        System.out.println("Value of palindrome: " + plaindromeString);
        if(str.equals(plaindromeString)){
            return true;
        }
        return false;
    } 
    public static void main(String args[]){
        lab8Ex2 lab = new lab8Ex2();

        String str= "racecar";
       System.out.println( lab.palindrome(str));
    }
    
}
