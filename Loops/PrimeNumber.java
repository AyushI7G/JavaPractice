import java.util.*;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if(number <= 1){
            isPrime = false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {                                //if(isPrime){ print is a prime number }
            System.out.println("A Prime Number");
        }
        else{
            System.out.println("Not Prime Number.");
        }
    }
}
