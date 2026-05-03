import java.util.*;

public class HollowDiamond {
    public static void pattern(int n) {
        for(int i = 0; i < (n/2) + 1; i++){
            for(int j = 0; j < (n/2 - i); j++){
                System.out.print("  ");
            }
            System.out.print("* ");      
            for(int j = 0; j < (2*i - 1); j++){
                System.out.print("  ");
            }
            if(i != 0){
                System.out.print("* "); 
            }            
            System.out.println();    
        }
        for(int i = 0; i < (n/2); i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("  ");
            }
            System.out.print("* ");      
            for(int j = 0; j < n - 4; j = j + 2){
                System.out.print("  ");
            }
            if(i != (n/2 - 1)){
                System.out.print("* "); 
            }            
            System.out.println();    
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the length of edge: ");
        int edge = sc.nextInt();
        pattern(edge);
    }
}


/*

    *
  *   *
*       *
  *   *
    *

*/
