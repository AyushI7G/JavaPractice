import java.util.*;

public class continueStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter number: ");
            n = sc.nextInt();
            if( n % 10 == 0){                                      //Skips the printing of multiple of 10
                continue;                                           //Skips only that statement
            }
            else{
                System.out.println(n);
            }
        }while(true);
    }
}