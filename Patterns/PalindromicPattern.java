import java.util.*;

public class PalindromicPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println();
        for(int i = 1; i <= n; i++){
            int a = i;
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                if(a >= 1){
                    System.out.print(a + " ");
                    a--;
                }
            }
            if(i>1){
                a++;
                while(a < i){
                    a++;
                    System.out.print(a + " ");
                }
            }
            System.out.println();     
        }
        System.out.println();
    }
}


/*

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

*/