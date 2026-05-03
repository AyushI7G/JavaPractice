public class PalindromeFunc {
    /*
    public static void palindrome (int a) {
        int n = a, num = 0, rem;              //121
        while(a > 0){
            rem = a % 10;                         //1      //  2
            num = num*10 + rem;                   //1      // 12
            a = a / 10;                           //12     // 1
        }
        System.out.println("reverse number: " + num);
        if( n == num){
            System.out.println("Yes its a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    public static void main(String args[]){
        palindrome(1221);
    }
    */

    public static boolean palindrome(int a) {
        int n = a, num = 0, rem;
        while(a > 0){
            rem = a % 10;                //to take the last digit
            num = num*10 + rem;         
            a = a / 10;                  //removing the last digit
        }
        if (num == n) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        if(palindrome(4554)){
            System.out.println("Is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}