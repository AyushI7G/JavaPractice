import java.util.*;

public class breakStatement {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.print("Enter you number: ");       
            input = sc.nextInt();
            if(input % 10 == 0){                              //if multiple of 10 break the loop
                break;
            }
            System.out.println(input);
        }while(true);
        System.out.println("The loop has ended.");
    }
}