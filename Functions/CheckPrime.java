public class CheckPrime {
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        boolean n = isPrime(4);
        if(n){
            System.out.println("A Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }        
    }
}