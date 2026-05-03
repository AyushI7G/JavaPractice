import java.util.*;

public class NumberPyramidPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println();
        for(int i = 1; i  <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i+"   ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


/*

      1
    2   2
  3   3   3
4   4   4   4

*/