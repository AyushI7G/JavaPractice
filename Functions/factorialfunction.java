import java.util.*;
public class factorialfunction {
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
        
       /* factorial from for loop
       int f = 1;
       for(int i = 1; i <= n; i++){
        f = f * i;
       }
       return f;
       */
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fact of " + n + " is " + factorial(n));
    }
}