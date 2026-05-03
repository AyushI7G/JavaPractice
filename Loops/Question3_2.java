import java.util.*;

public class  Question3_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, evensum = 0, oddsum = 0;
        char choice;
        do {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            if(n%2 == 0){
                evensum += n;
            }
            else{
                oddsum += n;
            }
            System.out.print("Do you want to continue adding numbers? (y/n): ");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

        System.out.println("Even Sum: " + evensum + "\nOdd Sum: " + oddsum);
    }
}