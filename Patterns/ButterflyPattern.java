import java.util.*; //entered number = radius of the butterfly
public class ButterflyPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println();
        for(int i = 1; i <= n; i++){                        //1st half of butterfly (or more like bow)
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= (2*(n-i)); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){                        //2nd half --> mirror image of 1st half
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= (2*(n-i)); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*

for n = 4

*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *

*/

/*

//limitations for below one:
//Works for even numbers only
//entered number = width of the butterfly

public class ButterflyPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a even number: ");
        int n = sc.nextInt();
        System.out.println();
        for(int i = 1; i <= n/2; i++){                        //1st half of butterfly (or more like bow)
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= (n - (i*2)); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n/2; i++){                                  //2nd part 
            for(int j = 1; j <= ((n/2) - i + 1); j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= (i*2)-2; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= ((n/2) - i + 1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

*/


/*

for n = 8

*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             * 

*/
