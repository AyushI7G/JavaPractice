import java.util.*;

public class hollowRectangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows in the rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter no of columns in the rectangle: ");
        int ht = sc.nextInt();
        System.out.println();
        for(int i = 0; i < len; i++){
            for(int j = 0; j < ht; j++){
                if(i == 0 || i == (len-1)){
                    System.out.print("* ");
                }
                else{
                    if(j == 0 || j == (ht-1)){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}


/*

*********
*       *
*       *
*********

*/