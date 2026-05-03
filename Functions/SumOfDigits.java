public class SumOfDigits {
    public static void sumdigit(int n){
        int rem, sum = 0, a = n;
        while(n > 0){
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("Sum of Digits (" + a + ") is: " + sum);        
    }
    public static void main(String[] args) {
        sumdigit(1234);
    }
}
