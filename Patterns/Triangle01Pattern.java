import java.util.*;
public class Triangle01Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int a = 0;
        System.out.println();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1 && (i%2) != 0){
                    if(i % 2 != 0){
                        a=1;
                        System.out.print(a);
                    }
                    else{
                        System.out.print(a);
                    }
                }
                else{
                    if(a == 0){
                        a=1;
                        System.out.print(a);
                    }
                    else{
                        a=0;
                        System.out.print(a);
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*

1
01
101
0101
10101

*/


/*
import java.util.*;
public class Triangle01Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int a = 0;
        System.out.println();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i + j)% 2 == 0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

*/
