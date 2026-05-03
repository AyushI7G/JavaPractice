import java.util.*;

public class Question3_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;

        if(n > 0){
            for(int i = 1; i <= n; i++){
                f = f * i;
            }
        }
        System.out.println("Factorial = " + f);
    }

}
